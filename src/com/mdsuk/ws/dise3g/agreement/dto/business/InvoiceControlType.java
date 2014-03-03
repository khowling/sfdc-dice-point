
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Data structure  returned by Agreement Query Response when INVOICECONTROL dataset is specified
 * 
 * <p>Java class for InvoiceControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="OverrideBillingCycle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FirstInvoiceOnCycle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FinalInvoiceOnCycle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FirstInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NextExpectedInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "InvoiceControlType", propOrder = {

})
public class InvoiceControlType {

    @XmlElement(name = "OverrideBillingCycle")
    protected Boolean overrideBillingCycle;
    @XmlElement(name = "FirstInvoiceOnCycle")
    protected Boolean firstInvoiceOnCycle;
    @XmlElement(name = "FinalInvoiceOnCycle")
    protected Boolean finalInvoiceOnCycle;
    @XmlElement(name = "FirstInvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstInvoiceDate;
    @XmlElement(name = "NextExpectedInvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextExpectedInvoiceDate;
    @XmlElement(name = "LastInvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInvoiceDate;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

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
     * Gets the value of the firstInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstInvoiceDate() {
        return firstInvoiceDate;
    }

    /**
     * Sets the value of the firstInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstInvoiceDate(XMLGregorianCalendar value) {
        this.firstInvoiceDate = value;
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
     * Gets the value of the lastInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInvoiceDate() {
        return lastInvoiceDate;
    }

    /**
     * Sets the value of the lastInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInvoiceDate(XMLGregorianCalendar value) {
        this.lastInvoiceDate = value;
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
