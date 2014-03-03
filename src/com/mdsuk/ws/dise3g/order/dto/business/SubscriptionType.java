
package com.mdsuk.ws.dise3g.order.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SubscriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType" minOccurs="0"/>
 *         &lt;element name="SubscriptionOrderStatus" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderStatusType" minOccurs="0"/>
 *         &lt;element name="ActivationType" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SubscriptionOrderActivationType" minOccurs="0"/>
 *         &lt;element name="SubscriptionOrderType" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SubscriptionOrderTType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionType", propOrder = {
    "subscriptionNumber",
    "subscriptionOrderStatus",
    "activationType",
    "subscriptionOrderType",
    "lastAmendedDate"
})
public class SubscriptionType {

    @XmlElement(name = "SubscriptionNumber")
    protected Integer subscriptionNumber;
    @XmlElement(name = "SubscriptionOrderStatus")
    protected String subscriptionOrderStatus;
    @XmlElement(name = "ActivationType")
    protected String activationType;
    @XmlElement(name = "SubscriptionOrderType")
    protected String subscriptionOrderType;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionNumber(Integer value) {
        this.subscriptionNumber = value;
    }

    /**
     * Gets the value of the subscriptionOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionOrderStatus() {
        return subscriptionOrderStatus;
    }

    /**
     * Sets the value of the subscriptionOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionOrderStatus(String value) {
        this.subscriptionOrderStatus = value;
    }

    /**
     * Gets the value of the activationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationType() {
        return activationType;
    }

    /**
     * Sets the value of the activationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationType(String value) {
        this.activationType = value;
    }

    /**
     * Gets the value of the subscriptionOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionOrderType() {
        return subscriptionOrderType;
    }

    /**
     * Sets the value of the subscriptionOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionOrderType(String value) {
        this.subscriptionOrderType = value;
    }

    /**
     * Gets the value of the lastAmendedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAmendedDate() {
        return lastAmendedDate;
    }

    /**
     * Sets the value of the lastAmendedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAmendedDate(XMLGregorianCalendar value) {
        this.lastAmendedDate = value;
    }

}
