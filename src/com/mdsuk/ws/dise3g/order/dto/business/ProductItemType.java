
package com.mdsuk.ws.dise3g.order.dto.business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ProductItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemCode" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ItemCodeType" minOccurs="0"/>
 *         &lt;element name="ItemQuantityNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ItemQuantityNumberType" minOccurs="0"/>
 *         &lt;element name="ItemUnitPrice" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="SubscriptionRelated" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SubscriptionRelatedType" minOccurs="0"/>
 *         &lt;element name="TotalSubscriptionsNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}TotalSubscriptionsNumberType" minOccurs="0"/>
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
@XmlType(name = "ProductItemType", propOrder = {
    "itemCode",
    "itemQuantityNumber",
    "itemUnitPrice",
    "subscriptionRelated",
    "totalSubscriptionsNumber",
    "lastAmendedDate"
})
public class ProductItemType {

    @XmlElement(name = "ItemCode")
    protected String itemCode;
    @XmlElement(name = "ItemQuantityNumber")
    protected Integer itemQuantityNumber;
    @XmlElement(name = "ItemUnitPrice")
    protected BigDecimal itemUnitPrice;
    @XmlElement(name = "SubscriptionRelated")
    protected Boolean subscriptionRelated;
    @XmlElement(name = "TotalSubscriptionsNumber")
    protected Integer totalSubscriptionsNumber;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the itemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * Sets the value of the itemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCode(String value) {
        this.itemCode = value;
    }

    /**
     * Gets the value of the itemQuantityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getItemQuantityNumber() {
        return itemQuantityNumber;
    }

    /**
     * Sets the value of the itemQuantityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setItemQuantityNumber(Integer value) {
        this.itemQuantityNumber = value;
    }

    /**
     * Gets the value of the itemUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getItemUnitPrice() {
        return itemUnitPrice;
    }

    /**
     * Sets the value of the itemUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setItemUnitPrice(BigDecimal value) {
        this.itemUnitPrice = value;
    }

    /**
     * Gets the value of the subscriptionRelated property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubscriptionRelated() {
        return subscriptionRelated;
    }

    /**
     * Sets the value of the subscriptionRelated property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubscriptionRelated(Boolean value) {
        this.subscriptionRelated = value;
    }

    /**
     * Gets the value of the totalSubscriptionsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalSubscriptionsNumber() {
        return totalSubscriptionsNumber;
    }

    /**
     * Sets the value of the totalSubscriptionsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalSubscriptionsNumber(Integer value) {
        this.totalSubscriptionsNumber = value;
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
