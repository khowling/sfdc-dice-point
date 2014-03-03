
package com.mdsuk.ws.dise3g.order.dto.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.base.MessageListType;


/**
 * <p>Java class for OrderResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExternalReference" type="{http://mdsuk.com/ws/dise3g/base}ExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderNumberType"/>
 *         &lt;element name="Products" type="{http://mdsuk.com/ws/dise3g/order/dto/service}OrderResponseProductsType"/>
 *         &lt;element name="WarningMessages" type="{http://mdsuk.com/ws/dise3g/base}MessageListType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderResponseType", propOrder = {

})
public class OrderResponseType {

    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "OrderNumber", required = true)
    protected String orderNumber;
    @XmlElement(name = "Products", required = true)
    protected OrderResponseProductsType products;
    @XmlElement(name = "WarningMessages")
    protected MessageListType warningMessages;

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link OrderResponseProductsType }
     *     
     */
    public OrderResponseProductsType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderResponseProductsType }
     *     
     */
    public void setProducts(OrderResponseProductsType value) {
        this.products = value;
    }

    /**
     * Gets the value of the warningMessages property.
     * 
     * @return
     *     possible object is
     *     {@link MessageListType }
     *     
     */
    public MessageListType getWarningMessages() {
        return warningMessages;
    }

    /**
     * Sets the value of the warningMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageListType }
     *     
     */
    public void setWarningMessages(MessageListType value) {
        this.warningMessages = value;
    }

}
