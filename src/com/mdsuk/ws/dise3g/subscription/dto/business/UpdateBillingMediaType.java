
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Update the Billing Media data associated with a
 *             Subscription
 * 
 * <p>Java class for UpdateBillingMediaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateBillingMediaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BillingMediaCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}MediaCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="BilllingMediaCopyInvoiceMediaCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}MediaCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="BillingMediaOverrideInvoiceMediaCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}MediaCategoryCodeType" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateBillingMediaType", propOrder = {

})
public class UpdateBillingMediaType {

    @XmlElement(name = "BillingMediaCode")
    protected String billingMediaCode;
    @XmlElement(name = "BilllingMediaCopyInvoiceMediaCode")
    protected String billlingMediaCopyInvoiceMediaCode;
    @XmlElement(name = "BillingMediaOverrideInvoiceMediaCode")
    protected String billingMediaOverrideInvoiceMediaCode;
    @XmlElement(name = "LastAmendedDate", required = true)
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the billingMediaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMediaCode() {
        return billingMediaCode;
    }

    /**
     * Sets the value of the billingMediaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMediaCode(String value) {
        this.billingMediaCode = value;
    }

    /**
     * Gets the value of the billlingMediaCopyInvoiceMediaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBilllingMediaCopyInvoiceMediaCode() {
        return billlingMediaCopyInvoiceMediaCode;
    }

    /**
     * Sets the value of the billlingMediaCopyInvoiceMediaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBilllingMediaCopyInvoiceMediaCode(String value) {
        this.billlingMediaCopyInvoiceMediaCode = value;
    }

    /**
     * Gets the value of the billingMediaOverrideInvoiceMediaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMediaOverrideInvoiceMediaCode() {
        return billingMediaOverrideInvoiceMediaCode;
    }

    /**
     * Sets the value of the billingMediaOverrideInvoiceMediaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMediaOverrideInvoiceMediaCode(String value) {
        this.billingMediaOverrideInvoiceMediaCode = value;
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
