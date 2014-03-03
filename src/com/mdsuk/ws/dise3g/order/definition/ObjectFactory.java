
package com.mdsuk.ws.dise3g.order.definition;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.mdsuk.ws.dise3g.fault.SecurityFault;
import com.mdsuk.ws.dise3g.fault.ServiceUnavailableFault;
import com.mdsuk.ws.dise3g.fault.SystemFault;
import com.mdsuk.ws.dise3g.fault.ValidationFault;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mdsuk.ws.dise3g.order.definition package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ValidationFault_QNAME = new QName("http://mdsuk.com/ws/dise3g/order/definition", "ValidationFault");
    private final static QName _SecurityFault_QNAME = new QName("http://mdsuk.com/ws/dise3g/order/definition", "SecurityFault");
    private final static QName _ServiceUnavailableFault_QNAME = new QName("http://mdsuk.com/ws/dise3g/order/definition", "ServiceUnavailableFault");
    private final static QName _SystemFault_QNAME = new QName("http://mdsuk.com/ws/dise3g/order/definition", "SystemFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mdsuk.ws.dise3g.order.definition
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryStock }
     * 
     */
    public QueryStock createQueryStock() {
        return new QueryStock();
    }

    /**
     * Create an instance of {@link QueryOrder }
     * 
     */
    public QueryOrder createQueryOrder() {
        return new QueryOrder();
    }

    /**
     * Create an instance of {@link QueryOrdersResponse }
     * 
     */
    public QueryOrdersResponse createQueryOrdersResponse() {
        return new QueryOrdersResponse();
    }

    /**
     * Create an instance of {@link UpdateOrderStatusResponse }
     * 
     */
    public UpdateOrderStatusResponse createUpdateOrderStatusResponse() {
        return new UpdateOrderStatusResponse();
    }

    /**
     * Create an instance of {@link CreateOrder }
     * 
     */
    public CreateOrder createCreateOrder() {
        return new CreateOrder();
    }

    /**
     * Create an instance of {@link QueryStockResponse }
     * 
     */
    public QueryStockResponse createQueryStockResponse() {
        return new QueryStockResponse();
    }

    /**
     * Create an instance of {@link CreateOrderResponse }
     * 
     */
    public CreateOrderResponse createCreateOrderResponse() {
        return new CreateOrderResponse();
    }

    /**
     * Create an instance of {@link UpdateOrderStatus }
     * 
     */
    public UpdateOrderStatus createUpdateOrderStatus() {
        return new UpdateOrderStatus();
    }

    /**
     * Create an instance of {@link QueryOrders }
     * 
     */
    public QueryOrders createQueryOrders() {
        return new QueryOrders();
    }

    /**
     * Create an instance of {@link QueryOrderResponse }
     * 
     */
    public QueryOrderResponse createQueryOrderResponse() {
        return new QueryOrderResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidationFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdsuk.com/ws/dise3g/order/definition", name = "ValidationFault")
    public JAXBElement<ValidationFault> createValidationFault(ValidationFault value) {
        return new JAXBElement<ValidationFault>(_ValidationFault_QNAME, ValidationFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurityFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdsuk.com/ws/dise3g/order/definition", name = "SecurityFault")
    public JAXBElement<SecurityFault> createSecurityFault(SecurityFault value) {
        return new JAXBElement<SecurityFault>(_SecurityFault_QNAME, SecurityFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceUnavailableFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdsuk.com/ws/dise3g/order/definition", name = "ServiceUnavailableFault")
    public JAXBElement<ServiceUnavailableFault> createServiceUnavailableFault(ServiceUnavailableFault value) {
        return new JAXBElement<ServiceUnavailableFault>(_ServiceUnavailableFault_QNAME, ServiceUnavailableFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://mdsuk.com/ws/dise3g/order/definition", name = "SystemFault")
    public JAXBElement<SystemFault> createSystemFault(SystemFault value) {
        return new JAXBElement<SystemFault>(_SystemFault_QNAME, SystemFault.class, null, value);
    }

}
