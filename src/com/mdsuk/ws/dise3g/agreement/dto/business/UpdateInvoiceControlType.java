
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                 Agreement data which can be updated with an "UpdateInvoiceControl" dataset
 *             
 * 
 * <p>Java class for UpdateInvoiceControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInvoiceControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BillingCycle" type="{http://mdsuk.com/ws/dise3g/base}DayOfMonthIntType" minOccurs="0"/>
 *         &lt;element name="OverrideBillingCycle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FirstInvoiceOnCycle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinalInvoiceOnCycle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="NextExpectedInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastAmendedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInvoiceControlType", propOrder = {

})
public class UpdateInvoiceControlType {

    @XmlElement(name = "BillingCycle")
    protected Integer billingCycle;
    @XmlElement(name = "OverrideBillingCycle")
    protected Boolean overrideBillingCycle;
    @XmlElement(name = "FirstInvoiceOnCycle")
    protected Boolean firstInvoiceOnCycle;
    @XmlElement(name = "FinalInvoiceOnCycle")
    protected Boolean finalInvoiceOnCycle;
    @XmlElement(name = "NextExpectedInvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextExpectedInvoiceDate;
    @XmlElement(name = "LastAmendedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the billingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBillingCycle(Integer value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the overrideBillingCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverrideBillingCycle() {
        return overrideBillingCycle;
    }

    /**
     * Sets the value of the overrideBillingCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverrideBillingCycle(Boolean value) {
        this.overrideBillingCycle = value;
    }

    /**
     * Gets the value of the firstInvoiceOnCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFirstInvoiceOnCycle() {
        return firstInvoiceOnCycle;
    }

    /**
     * Sets the value of the firstInvoiceOnCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFirstInvoiceOnCycle(Boolean value) {
        this.firstInvoiceOnCycle = value;
    }

    /**
     * Gets the value of the finalInvoiceOnCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFinalInvoiceOnCycle() {
        return finalInvoiceOnCycle;
    }

    /**
     * Sets the value of the finalInvoiceOnCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinalInvoiceOnCycle(Boolean value) {
        this.finalInvoiceOnCycle = value;
    }

    /**
     * Gets the value of the nextExpectedInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextExpectedInvoiceDate() {
        return nextExpectedInvoiceDate;
    }

    /**
     * Sets the value of the nextExpectedInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextExpectedInvoiceDate(XMLGregorianCalendar value) {
        this.nextExpectedInvoiceDate = value;
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
