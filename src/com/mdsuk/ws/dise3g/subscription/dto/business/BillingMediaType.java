
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure is returned as part of the Subscription Query response
 *                 when BILLINGMEDIA dataset is specified
 * 
 * <p>Java class for BillingMediaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillingMediaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BillingMediaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingMediaCopyInvoiceMediaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingMediaOverrideInvoiceMediaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingMediaType", propOrder = {

})
public class BillingMediaType {

    @XmlElement(name = "BillingMediaCode")
    protected String billingMediaCode;
    @XmlElement(name = "BillingMediaCopyInvoiceMediaCode")
    protected String billingMediaCopyInvoiceMediaCode;
    @XmlElement(name = "BillingMediaOverrideInvoiceMediaCode")
    protected String billingMediaOverrideInvoiceMediaCode;
    @XmlElement(name = "LastAmendedDate")
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
     * Gets the value of the billingMediaCopyInvoiceMediaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMediaCopyInvoiceMediaCode() {
        return billingMediaCopyInvoiceMediaCode;
    }

    /**
     * Sets the value of the billingMediaCopyInvoiceMediaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMediaCopyInvoiceMediaCode(String value) {
        this.billingMediaCopyInvoiceMediaCode = value;
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
