
package com.mdsuk.ws.dise3g.order.dto.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderResponseProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderResponseProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ProductCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProductCodeType"/>
 *         &lt;element name="Comment" type="{http://mdsuk.com/ws/dise3g/order/dto/business}CommentType" minOccurs="0"/>
 *         &lt;element name="SubscriptionDetails" type="{http://mdsuk.com/ws/dise3g/order/dto/service}OrderResponseSubsDetailsType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderResponseProductType", propOrder = {

})
public class OrderResponseProductType {

    @XmlElement(name = "ProductCode", required = true)
    protected String productCode;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "SubscriptionDetails")
    protected OrderResponseSubsDetailsType subscriptionDetails;

    /**
     * Gets the value of the productCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCode() {
        return productCode;
    }

    /**
     * Sets the value of the productCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCode(String value) {
        this.productCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the subscriptionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponseSubsDetailsType }
     *     
     */
    public OrderResponseSubsDetailsType getSubscriptionDetails() {
        return subscriptionDetails;
    }

    /**
     * Sets the value of the subscriptionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponseSubsDetailsType }
     *     
     */
    public void setSubscriptionDetails(OrderResponseSubsDetailsType value) {
        this.subscriptionDetails = value;
    }

}
