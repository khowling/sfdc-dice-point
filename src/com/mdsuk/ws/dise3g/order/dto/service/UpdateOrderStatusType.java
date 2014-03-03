
package com.mdsuk.ws.dise3g.order.dto.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.order.dto.business.OrderUpgradeType;


/**
 * <p>Java class for UpdateOrderStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderStatusType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExternalReference" type="{http://mdsuk.com/ws/dise3g/base}ExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderNumberType"/>
 *         &lt;element name="OrderStatus" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderUpgradeType"/>
 *         &lt;element name="overrideHardwareCreditLimit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderStatusType", propOrder = {

})
public class UpdateOrderStatusType {

    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "OrderNumber", required = true)
    protected String orderNumber;
    @XmlElement(name = "OrderStatus", required = true)
    protected OrderUpgradeType orderStatus;
    @XmlElement(defaultValue = "false")
    protected Boolean overrideHardwareCreditLimit;

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
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderUpgradeType }
     *     
     */
    public OrderUpgradeType getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderUpgradeType }
     *     
     */
    public void setOrderStatus(OrderUpgradeType value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the overrideHardwareCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideHardwareCreditLimit() {
        return overrideHardwareCreditLimit;
    }

    /**
     * Sets the value of the overrideHardwareCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideHardwareCreditLimit(Boolean value) {
        this.overrideHardwareCreditLimit = value;
    }

}
