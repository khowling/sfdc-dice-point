import java.math.BigDecimal;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;

import com.sforce.soap.enterprise.*;
import com.mdsuk.ws.dise3g.address.dto.business.AddressType;
import com.mdsuk.ws.dise3g.address.dto.business.BusinessAddressType;
import com.mdsuk.ws.dise3g.order.service.*;
import com.mdsuk.ws.dise3g.order.dto.business.ActivationType;
import com.mdsuk.ws.dise3g.order.dto.business.OrderHeaderType;
import com.mdsuk.ws.dise3g.order.dto.business.PaymentType;
import com.mdsuk.ws.dise3g.order.dto.business.ShippingAddressInformationType;
import com.mdsuk.ws.dise3g.order.dto.service.*;
import com.mdsuk.ws.dise3g.subscription.dto.business.ConnectionDetailsType;
import com.mdsuk.ws.dise3g.subscription.dto.business.SubscriptionConnectionType;
import com.sforce.soap.enterprise.sobject.*;
import com.sforce.ws.*;
    

public class PointIntegration {

	
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
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, System.getenv("DISE_URL"));
		bp.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, System.getenv("DISE_USERNAME"));
		bp.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, System.getenv("DISE_PASSWORD"));

		
		
		QueryResult qr = connection.query("Select Subject, Subscription_Account__r.AccountNumber, Subscription_Account__c, Customer_Product__c, Contact.Cost_Centre__c, Contact.Payroll_Number__c, Contact.MobilePhone, Contact.Phone, Contact.MailingPostalCode, Contact.MailingState, Contact.MailingCity, Contact.MailingStreet, Contact.Name, ContactId, Account.AccountNumber, AccountId from Case where MDS_Status__c = 'Pending'");

		SObject[] recs = qr.getRecords();
		for (SObject o : recs) {
			Case c= (Case)o;
			Contact con = c.getContact();
			Account acc = c.getAccount();
			Account sacc = c.getSubscription_Account__r();
			
			System.out.println ("Got Case " + c.getSubject());
			
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
			
			OrderHeaderType oht = new OrderHeaderType();

			// Phone, Name, payroll number + cost centre
			oht.setCustomerReference(con.getPhone() + " " + con.getPayroll_Number__c() + " " + con.getCost_Centre__c());
			
			oht.setDeliveryInstructions("Not used");

			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(); 
			xmlDate.setYear(new Date().getYear());
			xmlDate.setMonth(new Date().getMonth());
			xmlDate.setDay(new Date().getDay());
			
			oht.setDespatchByDate(xmlDate);
			oht.setGenerate(true);

			oht.setPaymentType(PaymentType.ON_ACCOUNT);
			oht.setPromisedForDate(xmlDate);
			
			ShippingAddressInformationType s = new ShippingAddressInformationType();
			AddressType at = new AddressType();
			BusinessAddressType ba = new BusinessAddressType();
			ba.setAddress1(con.getMailingStreet());
			ba.setAddress2(con.getMailingCity());
			ba.setAddress3(con.getMailingState());
			ba.setPostcode(con.getMailingPostalCode());
			at.setBusinessAddress(ba);
			s.setAddress(at);
			
			oht.setShippingAddressInformation(s);
			// new field on the Case SubscriptonAccount.AccountNumber
			if (sacc != null) {
				try {
					Integer accid = new Integer(sacc.getAccountNumber());
					oht.setSubscriptionAccountCode(accid); 
				} catch (NumberFormatException  ne) {
					// not a valid number
				}
			}
			oht.setWarehouseCode("HOWLEY");
			
			// the rep/agent from the USer record
			oht.setSalesAccountNumber(4627949);
			
			
			ot.setOrderHeader(oht);
			
			// do products
			ProductsType pst = new ProductsType();
			
			QueryResult qr_products = connection.query("Select Name, ProductCode__c, Price__c, Customer_Product__c From Product_SKU__c where Customer_Product__c = '" + c.getCustomer_Product__c() + "'");

			SObject[] recs_products = qr_products.getRecords();
			for (SObject prod : recs_products) {
				Product_SKU__c sku = (Product_SKU__c)prod;
			
				ProductType pt = new ProductType();
				
				pt.setActivationType(ActivationType.IMMEDIATE);
				//pt.setCategory(arg0);
				//pt.setComment(arg0);
				

				
				SubscriptionConnectionType sct = new SubscriptionConnectionType();
				sct.setUserName(con.getName());
				pt.setSubscription(sct);
				
				pt.setQuantity(1);
				pt.setProductPriceOverride(new BigDecimal(sku.getPrice__c()));
				pt.setProductCode(sku.getProductCode__c());
				
				SubscriptionConnectionType st = new SubscriptionConnectionType();
				st.setTariffCode("NWRDAT");
				st.setPackageCode("NWRPKG");
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
				
				System.out.println ("exception, updating salesforce with " + ex1.getMessage());
				
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
