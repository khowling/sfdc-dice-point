
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure is returned as part of the Subscription Query response
 *                 when CONTRACTANDSALES dataset is specified
 * 
 * <p>Java class for ContractAndSalesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractAndSalesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PricePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LastInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NextInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ContractStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TermOfContract" type="{http://mdsuk.com/ws/dise3g/base}ThreeDigitNumberType" minOccurs="0"/>
 *         &lt;element name="TermsAndConditionsGroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TerminationInvoiceProduced" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "ContractAndSalesType", propOrder = {

})
public class ContractAndSalesType {

    @XmlElement(name = "ContractNumber")
    protected String contractNumber;
    @XmlElement(name = "PricePlanCode")
    protected String pricePlanCode;
    @XmlElement(name = "FirstInvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstInvoiceDate;
    @XmlElement(name = "LastInvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInvoiceDate;
    @XmlElement(name = "NextInvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextInvoiceDate;
    @XmlElement(name = "ContractStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractStartDate;
    @XmlElement(name = "TermOfContract")
    protected Integer termOfContract;
    @XmlElement(name = "TermsAndConditionsGroupCode")
    protected String termsAndConditionsGroupCode;
    @XmlElement(name = "TerminationInvoiceProduced")
    protected Boolean terminationInvoiceProduced;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the pricePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricePlanCode() {
        return pricePlanCode;
    }

    /**
     * Sets the value of the pricePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricePlanCode(String value) {
        this.pricePlanCode = value;
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
     * Gets the value of the nextInvoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNextInvoiceDate() {
        return nextInvoiceDate;
    }

    /**
     * Sets the value of the nextInvoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNextInvoiceDate(XMLGregorianCalendar value) {
        this.nextInvoiceDate = value;
    }

    /**
     * Gets the value of the contractStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractStartDate() {
        return contractStartDate;
    }

    /**
     * Sets the value of the contractStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractStartDate(XMLGregorianCalendar value) {
        this.contractStartDate = value;
    }

    /**
     * Gets the value of the termOfContract property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTermOfContract() {
        return termOfContract;
    }

    /**
     * Sets the value of the termOfContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTermOfContract(Integer value) {
        this.termOfContract = value;
    }

    /**
     * Gets the value of the termsAndConditionsGroupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsAndConditionsGroupCode() {
        return termsAndConditionsGroupCode;
    }

    /**
     * Sets the value of the termsAndConditionsGroupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsAndConditionsGroupCode(String value) {
        this.termsAndConditionsGroupCode = value;
    }

    /**
     * Gets the value of the terminationInvoiceProduced property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTerminationInvoiceProduced() {
        return terminationInvoiceProduced;
    }

    /**
     * Sets the value of the terminationInvoiceProduced property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTerminationInvoiceProduced(Boolean value) {
        this.terminationInvoiceProduced = value;
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
