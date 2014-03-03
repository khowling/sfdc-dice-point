
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure optionally returned as part of the Account Query response
 * 
 * <p>Java class for NonSubscriptionInvoiceControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonSubscriptionInvoiceControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PrintStatement" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrintStatementBillingMediaCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type" minOccurs="0"/>
 *         &lt;element name="ConsolidateInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConsolidateInvoiceBillingMediaCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength6Type" minOccurs="0"/>
 *         &lt;element name="FirstInvoice" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastInvoice" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NextExpectedInvoice" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SubsequentInvoiceFrequency" type="{http://mdsuk.com/ws/dise3g/account/dto/business}SubsequentInvoiceFrequencyType" minOccurs="0"/>
 *         &lt;element name="DelayToCycle" type="{http://mdsuk.com/ws/dise3g/account/dto/business}DelayToCycleType" minOccurs="0"/>
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
@XmlType(name = "NonSubscriptionInvoiceControlType", propOrder = {

})
public class NonSubscriptionInvoiceControlType {

    @XmlElement(name = "PrintStatement")
    protected Boolean printStatement;
    @XmlElement(name = "PrintStatementBillingMediaCode")
    protected String printStatementBillingMediaCode;
    @XmlElement(name = "ConsolidateInvoice")
    protected Boolean consolidateInvoice;
    @XmlElement(name = "ConsolidateInvoiceBillingMediaCode")
    protected String consolidateInvoiceBillingMediaCode;
    @XmlElement(name = "FirstInvoice")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstInvoice;
    @XmlElement(name = "LastInvoice")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInvoice;
    @XmlElement(name = "NextExpectedInvoice")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextExpectedInvoice;
    @XmlElement(name = "SubsequentInvoiceFrequency")
    protected SubsequentInvoiceFrequencyType subsequentInvoiceFrequency;
    @XmlElement(name = "DelayToCycle")
    protected Integer delayToCycle;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the printStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintStatement() {
        return printStatement;
    }

    /**
     * Sets the value of the printStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintStatement(Boolean value) {
        this.printStatement = value;
    }

    /**
     * Gets the value of the printStatementBillingMediaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintStatementBillingMediaCode() {
        return printStatementBillingMediaCode;
    }

    /**
     * Sets the value of the printStatementBillingMediaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintStatementBillingMediaCode(String value) {
        this.printStatementBillingMediaCode = value;
    }

    /**
     * Gets the value of the consolidateInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidateInvoice() {
        return consolidateInvoice;
    }

    /**
     * Sets the value of the consolidateInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidateInvoice(Boolean value) {
        this.consolidateInvoice = value;
    }

    /**
     * Gets the value of the consolidateInvoiceBillingMediaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsolidateInvoiceBillingMediaCode() {
        return consolidateInvoiceBillingMediaCode;
    }

    /**
     * Sets the value of the consolidateInvoiceBillingMediaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsolidateInvoiceBillingMediaCode(String value) {
        this.consolidateInvoiceBillingMediaCode = value;
    }

    /**
     * Gets the value of the firstInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstInvoice() {
        return firstInvoice;
    }

    /**
     * Sets the value of the firstInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstInvoice(XMLGregorianCalendar value) {
        this.firstInvoice = value;
    }

    /**
     * Gets the value of the lastInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInvoice() {
        return lastInvoice;
    }

    /**
     * Sets the value of the lastInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInvoice(XMLGregorianCalendar value) {
        this.lastInvoice = value;
    }

    /**
     * Gets the value of the nextExpectedInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextExpectedInvoice() {
        return nextExpectedInvoice;
    }

    /**
     * Sets the value of the nextExpectedInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextExpectedInvoice(XMLGregorianCalendar value) {
        this.nextExpectedInvoice = value;
    }

    /**
     * Gets the value of the subsequentInvoiceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link SubsequentInvoiceFrequencyType }
     *     
     */
    public SubsequentInvoiceFrequencyType getSubsequentInvoiceFrequency() {
        return subsequentInvoiceFrequency;
    }

    /**
     * Sets the value of the subsequentInvoiceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsequentInvoiceFrequencyType }
     *     
     */
    public void setSubsequentInvoiceFrequency(SubsequentInvoiceFrequencyType value) {
        this.subsequentInvoiceFrequency = value;
    }

    /**
     * Gets the value of the delayToCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDelayToCycle() {
        return delayToCycle;
    }

    /**
     * Sets the value of the delayToCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDelayToCycle(Integer value) {
        this.delayToCycle = value;
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
