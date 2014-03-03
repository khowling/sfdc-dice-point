
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UpdateNonSubscriptionInvoiceControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateNonSubscriptionInvoiceControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="PrintStatementInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrintStatementInvoiceFormat" type="{http://mdsuk.com/ws/dise3g/account/dto/business}PrintStatementInvoiceFormatType" minOccurs="0"/>
 *         &lt;element name="StatementFormatInvoiceFormat" type="{http://mdsuk.com/ws/dise3g/account/dto/business}StatementFormatInvoiceFormatType" minOccurs="0"/>
 *         &lt;element name="FirstInvoice" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SubsequentInvoiceFrequency" type="{http://mdsuk.com/ws/dise3g/account/dto/business}SubsequentInvoiceFrequencyIntType" minOccurs="0"/>
 *         &lt;element name="DelayToCycle" type="{http://mdsuk.com/ws/dise3g/account/dto/business}DelayToCycleType" minOccurs="0"/>
 *         &lt;element name="ConsolidateNonSubscriptionInvoice" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "UpdateNonSubscriptionInvoiceControlType", propOrder = {

})
public class UpdateNonSubscriptionInvoiceControlType {

    @XmlElement(name = "PrintStatementInvoice")
    protected Boolean printStatementInvoice;
    @XmlElement(name = "PrintStatementInvoiceFormat")
    protected String printStatementInvoiceFormat;
    @XmlElement(name = "StatementFormatInvoiceFormat")
    protected String statementFormatInvoiceFormat;
    @XmlElement(name = "FirstInvoice")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstInvoice;
    @XmlElement(name = "SubsequentInvoiceFrequency")
    protected SubsequentInvoiceFrequencyIntType subsequentInvoiceFrequency;
    @XmlElement(name = "DelayToCycle")
    protected Integer delayToCycle;
    @XmlElement(name = "ConsolidateNonSubscriptionInvoice")
    protected Boolean consolidateNonSubscriptionInvoice;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the printStatementInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrintStatementInvoice() {
        return printStatementInvoice;
    }

    /**
     * Sets the value of the printStatementInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrintStatementInvoice(Boolean value) {
        this.printStatementInvoice = value;
    }

    /**
     * Gets the value of the printStatementInvoiceFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintStatementInvoiceFormat() {
        return printStatementInvoiceFormat;
    }

    /**
     * Sets the value of the printStatementInvoiceFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintStatementInvoiceFormat(String value) {
        this.printStatementInvoiceFormat = value;
    }

    /**
     * Gets the value of the statementFormatInvoiceFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatementFormatInvoiceFormat() {
        return statementFormatInvoiceFormat;
    }

    /**
     * Sets the value of the statementFormatInvoiceFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatementFormatInvoiceFormat(String value) {
        this.statementFormatInvoiceFormat = value;
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
     * Gets the value of the subsequentInvoiceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link SubsequentInvoiceFrequencyIntType }
     *     
     */
    public SubsequentInvoiceFrequencyIntType getSubsequentInvoiceFrequency() {
        return subsequentInvoiceFrequency;
    }

    /**
     * Sets the value of the subsequentInvoiceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsequentInvoiceFrequencyIntType }
     *     
     */
    public void setSubsequentInvoiceFrequency(SubsequentInvoiceFrequencyIntType value) {
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
     * Gets the value of the consolidateNonSubscriptionInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsolidateNonSubscriptionInvoice() {
        return consolidateNonSubscriptionInvoice;
    }

    /**
     * Sets the value of the consolidateNonSubscriptionInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsolidateNonSubscriptionInvoice(Boolean value) {
        this.consolidateNonSubscriptionInvoice = value;
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
