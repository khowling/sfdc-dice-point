
package com.mdsuk.ws.dise3g.order.definition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.order.dto.service.QueryOrderType;


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
 *         &lt;element name="OrderData" type="{http://mdsuk.com/ws/dise3g/order/dto/service}QueryOrderType"/>
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
    "orderData"
})
@XmlRootElement(name = "QueryOrder")
public class QueryOrder {

    @XmlElement(name = "OrderData", required = true)
    protected QueryOrderType orderData;

    /**
     * Gets the value of the orderData property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOrderType }
     *     
     */
    public QueryOrderType getOrderData() {
        return orderData;
    }

    /**
     * Sets the value of the orderData property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOrderType }
     *     
     */
    public void setOrderData(QueryOrderType value) {
        this.orderData = value;
    }

}
