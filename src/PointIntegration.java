import com.sforce.soap.enterprise.*;
import com.mdsuk.ws.dise3g.order.service.*;
import com.mdsuk.ws.dise3g.order.dto.business.OrderHeaderType;
import com.mdsuk.ws.dise3g.order.dto.service.*;
import com.mdsuk.ws.dise3g.subscription.dto.business.SubscriptionConnectionType;
import com.sforce.soap.enterprise.sobject.*;
import com.sforce.ws.*;
    

public class PointIntegration {

	
	public static void main(String[] args) throws ConnectionException {
		System.out.println ("Staring...");
		ConnectorConfig config = new ConnectorConfig();
		config.setUsername(System.getenv("SFDC_USERNAME"));
		config.setPassword(System.getenv("SFDC_PASSWORD"));
		EnterpriseConnection connection = Connector.newConnection(config);

		
		OrderService dice = new OrderService();
		OrderPortType diceSoap = dice.getOrderPort();

		QueryResult qr = connection.query("Select subject from Case where MDS_Status__c = 'Pending'");

		SObject[] recs = qr.getRecords();
		for (SObject o : recs) {
			Case c= (Case)o;
			System.out.println ("Got Case " + c.getSubject());
			
			OrderType ot = new OrderType();
			ot.setAccountIdentifier(123123);
			
			ot.setExternalReference(c.getId());
			
			OrderHeaderType oht = new OrderHeaderType();
			oht.setCustomerReference("Customer");
			oht.setDeliveryInstructions("Del Instructions");
			
			ot.setOrderHeader(oht);
			
			ProductType pt = new ProductType();
			pt.setProductCode("CODE01");
			pt.setQuantity(1);
			pt.setCategory("Category");
			
			SubscriptionConnectionType st = new SubscriptionConnectionType();
			pt.setSubscription(st);
			
			ProductsType pst = new ProductsType();
			pst.getProduct().add(pt);
			
			ot.setProducts(pst);
			System.out.println ("Created dice OrderType, sending... ");
			try { 
				OrderResponseType ores = diceSoap.createOrder(ot);
				String onum = ores.getOrderNumber();
				
				Case newc = new Case();
				newc.setId(c.getId());
				newc.setBilling_Order_Number__c(onum);
				connection.update(new Case[]{newc});
				
			} catch (Exception e) {
				System.out.println ("exception " + e.getMessage());
			}
			
		}

	}

}
