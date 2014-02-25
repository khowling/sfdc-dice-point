import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.sforce.soap.enterprise.*;
import com.mdsuk.ws.dise3g.address.dto.business.AddressType;
import com.mdsuk.ws.dise3g.address.dto.business.BusinessAddressType;
import com.mdsuk.ws.dise3g.order.service.*;
import com.mdsuk.ws.dise3g.order.dto.business.ActivationType;
import com.mdsuk.ws.dise3g.order.dto.business.OrderHeaderType;
import com.mdsuk.ws.dise3g.order.dto.business.PaymentType;
import com.mdsuk.ws.dise3g.order.dto.business.ShippingAddressInformationType;
import com.mdsuk.ws.dise3g.order.dto.service.*;
import com.mdsuk.ws.dise3g.subscription.dto.business.SubscriptionConnectionType;
import com.sforce.soap.enterprise.sobject.*;
import com.sforce.ws.*;
    

public class PointIntegration {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ConnectionException, DatatypeConfigurationException {
		System.out.println ("Starting...");
		ConnectorConfig config = new ConnectorConfig();
		config.setUsername(System.getenv("SFDC_USERNAME"));
		config.setPassword(System.getenv("SFDC_PASSWORD"));
		EnterpriseConnection connection = Connector.newConnection(config);

		
		OrderService dice = new OrderService();
		OrderPortType diceSoap = dice.getOrderPort();

		QueryResult qr = connection.query("Select subject, Account.AccountNumber from Case where MDS_Status__c = 'Pending'");

		SObject[] recs = qr.getRecords();
		for (SObject o : recs) {
			Case c= (Case)o;
			
			System.out.println ("Got Case " + c.getSubject());
			
			OrderType ot = new OrderType();
			
			// DISE Account number - NR Account represents the Account Cost centre
			// this is the Accont.AccountNumber
			ot.setAccountIdentifier(4968558); 

			ot.setExternalReference(c.getId());
			
			OrderHeaderType oht = new OrderHeaderType();

			// Phone, Name, payroll number + cost centre
			oht.setCustomerReference("Customer");
			
			oht.setDeliveryInstructions("Not used");



			XMLGregorianCalendar xmlDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(); 
			xmlDate.setYear(new Date().getYear());
			xmlDate.setMonth(new Date().getMonth());
			xmlDate.setDay(new Date().getDay());
			
			oht.setDespatchByDate(xmlDate);
			oht.setGenerate(true);
		//	PaymentType pt = new PaymentType();
			oht.setPaymentType(PaymentType.ON_ACCOUNT);
			oht.setPromisedForDate(xmlDate);
			
			ShippingAddressInformationType s = new ShippingAddressInformationType();
			AddressType at = new AddressType();
			BusinessAddressType ba = new BusinessAddressType();
			ba.setAddress1("Addr1");
			ba.setAddress2("Addr2");
			ba.setPostcode("SL6 1HH");
			at.setBusinessAddress(ba);
			s.setAddress(at);
			
			oht.setShippingAddressInformation(s);
			// new field on the Case SubscriptonAccount.AccountNumber
			oht.setSubscriptionAccountCode(arg0);
			oht.setWarehouseCode("HOWLEY");
			
			
			ot.setOrderHeader(oht);
			
			ProductType pt = new ProductType();
			
			pt.setActivationType(ActivationType.IMMEDIATE);
			//pt.setCategory(arg0);
			//pt.setComment(arg0);
			pt.setProductPriceOverride(arg0);
			pt.setProductCode("CODE01");
			pt.setSubscription(arg0);
			pt.setQuantity(1);
			pt.setCategory("Category");
			
			SubscriptionConnectionType st = new SubscriptionConnectionType();
			pt.setSubscription(st);
			
			ProductsType pst = new ProductsType();
			pst.getProduct().add(pt);
			
			ot.setProducts(pst);
			System.out.println ("Created dice OrderType, sending... ");
			
			Case newc = new Case();
			newc.setId(c.getId());
			
			try { 
				OrderResponseType ores = diceSoap.createOrder(ot);
				String onum = ores.getOrderNumber();

				newc.setBilling_Order_Number__c(onum);
				connection.update(new Case[]{newc});
				
				System.out.println ("Created");
				
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
