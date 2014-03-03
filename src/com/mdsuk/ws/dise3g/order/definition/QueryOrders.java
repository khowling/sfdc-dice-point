
package com.mdsuk.ws.dise3g.order.definition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.order.dto.service.QueryOrdersType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrderHistory" type="{http://mdsuk.com/ws/dise3g/order/dto/service}QueryOrdersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "orderHistory"
})
@XmlRootElement(name = "QueryOrders")
public class QueryOrders {

    @XmlElement(name = "OrderHistory", required = true)
    protected QueryOrdersType orderHistory;

    /**
     * Gets the value of the orderHistory property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOrdersType }
     *     
     */
    public QueryOrdersType getOrderHistory() {
        return orderHistory;
    }

    /**
     * Sets the value of the orderHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOrdersType }
     *     
     */
    public void setOrderHistory(QueryOrdersType value) {
        this.orderHistory = value;
    }

}
