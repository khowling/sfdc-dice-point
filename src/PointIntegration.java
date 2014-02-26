import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.cert.X509Certificate;
import java.util.Date;


import java.util.GregorianCalendar;
import java.util.List;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.Handler;

import com.sforce.soap.enterprise.*;
import com.mdsuk.ws.dise3g.address.dto.business.AddressType;
import com.mdsuk.ws.dise3g.address.dto.business.BusinessAddressType;
import com.mdsuk.ws.dise3g.address.dto.business.PersonalAddressType;
import com.mdsuk.ws.dise3g.order.service.*;
import com.mdsuk.ws.dise3g.order.dto.business.ActivationType;
import com.mdsuk.ws.dise3g.order.dto.business.OrderHeaderType;
import com.mdsuk.ws.dise3g.order.dto.business.PaymentType;
import com.mdsuk.ws.dise3g.order.dto.business.ShippingAddressInformationType;
import com.mdsuk.ws.dise3g.order.dto.business.SubsOrderType;
import com.mdsuk.ws.dise3g.order.dto.service.*;
import com.mdsuk.ws.dise3g.subscription.dto.business.ConnectionDetailsType;
import com.mdsuk.ws.dise3g.subscription.dto.business.SubscriptionConnectionType;
import com.sforce.soap.enterprise.sobject.*;
import com.sforce.ws.*;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
    


public class PointIntegration {

	
	static {
	    //WORKAROUND. TO BE REMOVED.

	    javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(
	    new javax.net.ssl.HostnameVerifier(){

	        public boolean verify(String hostname,
	                javax.net.ssl.SSLSession sslSession) {
	            if (hostname.equals("mytargethostname")) {
	                return true;
	            }
	            return true;
	        }
	    });
	}
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ConnectionException, DatatypeConfigurationException {
		System.out.println ("Starting... DISE API at : " + System.getenv("DISE_URL"));
		
		ConnectorConfig config = new ConnectorConfig();
		config.setUsername(System.getenv("SFDC_USERNAME"));
		config.setPassword(System.getenv("SFDC_PASSWORD"));
		
		String proxy = System.getenv("NET_PROXY");
		if (proxy != null) {
			System.out.println ("Setting WSC Proxy to  : " + proxy);
			config.setProxy(proxy, 8080);
		}

		EnterpriseConnection connection = Connector.newConnection(config);

		
		OrderService dice = new OrderService();
		OrderPortType diceSoap = dice.getOrderPort();
		BindingProvider bp = (BindingProvider)diceSoap;
		List<Handler> handlerList = bp.getBinding().getHandlerChain();
		handlerList.add( new SOAPLoggingHandler());
		bp.getBinding().setHandlerChain(handlerList);
		
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, System.getenv("DISE_URL"));
		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, System.getenv("DISE_USERNAME"));
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, System.getenv("DISE_PASSWORD"));
		


		
		/***** WARNING - BYPASS ALL SLL CHECKING *******/
		try {
		    // Create a trust manager that does not validate certificate chains
		    final TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
		        @Override
		        public void checkClientTrusted( final X509Certificate[] chain, final String authType ) {
		        }
		        @Override
		        public void checkServerTrusted( final X509Certificate[] chain, final String authType ) {
		        }
		        @Override
		        public X509Certificate[] getAcceptedIssuers() {
		            return null;
		        }
		    } };
		    
		    // Install the all-trusting trust manager
		    final SSLContext sslContext = SSLContext.getInstance( "SSL" );
		    sslContext.init( null, trustAllCerts, new java.security.SecureRandom() );
		    // Create an ssl socket factory with our all-trusting manager
		    final SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
		    
		    
			bp.getRequestContext().put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory",  sslSocketFactory );
		    
		} catch ( final Exception e ) {
		    e.printStackTrace();
		}
		
		
		QueryResult qr = connection.query("Select Id, Subject, Subscription_Account__r.AccountNumber, Subscription_Account__c, Customer_Product__c, Contact.Cost_Centre__c, Contact.Payroll_Number__c, Contact.MobilePhone, Contact.Phone, Contact.MailingPostalCode, Contact.MailingState, Contact.MailingCity, Contact.MailingStreet, Contact.Name, Contact.Salutation, Contact.FirstName, Contact.LastName, ContactId, Account.AccountNumber, AccountId from Case where MDS_Status__c = 'Pending'");

		SObject[] recs = qr.getRecords();
		for (SObject o : recs) {
			Case c= (Case)o;
			Contact con = c.getContact();
			Account acc = c.getAccount();
			Account sacc = c.getSubscription_Account__r();
			
			System.out.println ("Got Case " + c.getSubject());
			System.out.println ("Got Case " + c.getAccount().getAccountNumber());
			
			OrderType ot = new OrderType();
			
			// DISE Account number - NR Account represents the Account Cost centre
			// this is the Accont.AccountNumber
			try {
				Integer accid = new Integer(acc.getAccountNumber());
				ot.setAccountIdentifier(accid); 
			} catch (NumberFormatException  ne) {
				// not a valid number
			}
			
			ot.setExternalReference(c.getId());
			
			/************* ORDER HEADER ****************/
			OrderHeaderType oht = new OrderHeaderType();

			oht.setSalesAccountNumber(39);
			
			//TimeZone utc = TimeZone.getTimeZone("UTC");
			GregorianCalendar gc = new GregorianCalendar();
			gc.setTime(new Date());

			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
			xmlDate.setTimezone(DatatypeConstants.FIELD_UNDEFINED);
			oht.setPromisedForDate(xmlDate);
			oht.setDespatchByDate(xmlDate);
			
			oht.setWarehouseCode("HOWLEY");
			oht.setDeliveryMethodCode("BDPOST");
			oht.setDeliveryInstructions("ACC");
			oht.setPaymentType(PaymentType.CASH);

			//oht.setGenerate(true);

			ShippingAddressInformationType s = new ShippingAddressInformationType();
			AddressType at = new AddressType();
			PersonalAddressType ba = new PersonalAddressType();
			ba.setSurname(con.getLastName());
			ba.setForename(con.getFirstName());
			ba.setTitle(con.getSalutation());
			ba.setAddress1(con.getMailingStreet());
			ba.setAddress2(con.getMailingCity());
			ba.setAddress3(con.getMailingState());
			ba.setPostcode(con.getMailingPostalCode());
			at.setPersonalAddress(ba);
			s.setAddress(at);
			
			oht.setShippingAddressInformation(s);
			// new field on the Case SubscriptonAccount.AccountNumber
			
			// Phone, Name, payroll number + cost centre
			oht.setCustomerReference(con.getPhone() + " " + con.getName() + " " + con.getPayroll_Number__c() + " " + con.getCost_Centre__c());

			
			if (sacc != null) {
				try {
					Integer accid = new Integer(sacc.getAccountNumber());
					oht.setSubscriptionAccountCode(accid); 
				} catch (NumberFormatException  ne) {
					// not a valid number
				}
			}
			
			
			ot.setOrderHeader(oht);
			
			// do products
			ProductsType pst = new ProductsType();
			
			QueryResult qr_products = connection.query("Select Name, ProductCode__c, Price__c, Customer_Product__c From Product_SKU__c where Customer_Product__c = '" + c.getCustomer_Product__c() + "'");

			SObject[] recs_products = qr_products.getRecords();
			for (SObject prod : recs_products) {
				Product_SKU__c sku = (Product_SKU__c)prod;
			
				ProductType pt = new ProductType();
				
				pt.setSubsOrderType(SubsOrderType.NEW_CONNECTION);
				pt.setProductCode(sku.getProductCode__c());
				pt.setQuantity(1);
				pt.setProductPriceOverride(new BigDecimal(sku.getPrice__c()).setScale(2, RoundingMode.HALF_UP));
				pt.setActivationType(ActivationType.IMMEDIATE);
				//pt.setCategory(arg0);
				//pt.setComment(arg0);
				


				SubscriptionConnectionType st = new SubscriptionConnectionType();
				st.setTariffCode("NWRDAT");
				st.setPackageCode("NWRPKG");
				st.setUserName(con.getName());
				
				ConnectionDetailsType ctd = new ConnectionDetailsType();
				ctd.setConnectionType("BO+");
				ctd.setConnectionReason("NB");
				
				st.setConnectionDetails(ctd);
	
				pt.setSubscription(st);

				pst.getProduct().add(pt);
			}
			ot.setProducts(pst);
			System.out.println ("Created dice OrderType, sending... ");
			
			Case newc = new Case();
			newc.setId(c.getId());
			
			try { 
				
				OrderResponseType ores = diceSoap.createOrder(ot);
				String onum = ores.getOrderNumber();

				newc.setBilling_Order_Number__c(onum);
				newc.setMDS_Status__c("Integrated");
				connection.update(new Case[]{newc});
				
				System.out.println ("Created Order Successfully in DISE, order number: " + onum);
				
			} catch (Exception ex1) {
				
				System.out.println ("exception: " + ex1.getMessage());
				
				try {
					newc.setMDS_Status__c(ex1.getMessage());
					connection.update(new Case[]{newc});
				} catch (Exception ex2) { // unable to update
					System.out.println ("exception trying to update status in salesforce" + ex2.getMessage());
				}
			}
			
		}

	}

}
