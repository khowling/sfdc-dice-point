
package com.mdsuk.ws.dise3g.order.dto.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.order.dto.business.OrderProductDataType;
import com.mdsuk.ws.dise3g.subscription.dto.business.SubscriptionConnectionType;


/**
 * <p>Java class for ProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderProductDataType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="Subscription" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SubscriptionConnectionType"/>
 *         &lt;element name="SubscriptionIdentifier" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", propOrder = {
    "subscription",
    "subscriptionIdentifier"
})
public class ProductType
    extends OrderProductDataType
{

    @XmlElement(name = "Subscription")
    protected SubscriptionConnectionType subscription;
    @XmlElement(name = "SubscriptionIdentifier")
    protected Integer subscriptionIdentifier;

    /**
     * Gets the value of the subscription property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionConnectionType }
     *     
     */
    public SubscriptionConnectionType getSubscription() {
        return subscription;
    }

    /**
     * Sets the value of the subscription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionConnectionType }
     *     
     */
    public void setSubscription(SubscriptionConnectionType value) {
        this.subscription = value;
    }

    /**
     * Gets the value of the subscriptionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionIdentifier() {
        return subscriptionIdentifier;
    }

    /**
     * Sets the value of the subscriptionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionIdentifier(Integer value) {
        this.subscriptionIdentifier = value;
    }

}
