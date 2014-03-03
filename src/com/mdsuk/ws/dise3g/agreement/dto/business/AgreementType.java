
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.mdsuk.ws.dise3g.base.LevelType;


/**
 * Data structure used by Create Agreement.
 * 
 * <p>Java class for AgreementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgreementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="BillingCycle" type="{http://mdsuk.com/ws/dise3g/base}DayOfMonthType" minOccurs="0"/>
 *         &lt;element name="InvoiceConsolidationLevel" type="{http://mdsuk.com/ws/dise3g/base}LevelType" minOccurs="0"/>
 *         &lt;element name="InvoiceReceiptAddress" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}InvoiceAddressType" minOccurs="0"/>
 *         &lt;element name="NextExpectedInvoiceDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CorporateCode" type="{http://mdsuk.com/ws/dise3g/base}CorporateCodeType" minOccurs="0"/>
 *         &lt;element name="GroupCode" type="{http://mdsuk.com/ws/dise3g/base}GroupCodeType" minOccurs="0"/>
 *         &lt;element name="AccountCode" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="AutoContractRenewal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ContractTemplateID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillingMedia" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}BillingMediaType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgreementType", propOrder = {

})
public class AgreementType {

    @XmlElement(name = "BillingCycle")
    protected Integer billingCycle;
    @XmlElement(name = "InvoiceConsolidationLevel")
    protected LevelType invoiceConsolidationLevel;
    @XmlElement(name = "InvoiceReceiptAddress")
    protected InvoiceAddressType invoiceReceiptAddress;
    @XmlElement(name = "NextExpectedInvoiceDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar nextExpectedInvoiceDate;
    @XmlElement(name = "CorporateCode")
    protected String corporateCode;
    @XmlElement(name = "GroupCode")
    protected String groupCode;
    @XmlElement(name = "AccountCode")
    protected Integer accountCode;
    @XmlElement(name = "AutoContractRenewal")
    protected Boolean autoContractRenewal;
    @XmlElement(name = "ContractTemplateID")
    protected String contractTemplateID;
    @XmlElement(name = "BillingMedia")
    protected String billingMedia;

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
     * Gets the value of the invoiceConsolidationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getInvoiceConsolidationLevel() {
        return invoiceConsolidationLevel;
    }

    /**
     * Sets the value of the invoiceConsolidationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setInvoiceConsolidationLevel(LevelType value) {
        this.invoiceConsolidationLevel = value;
    }

    /**
     * Gets the value of the invoiceReceiptAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAddressType }
     *     
     */
    public InvoiceAddressType getInvoiceReceiptAddress() {
        return invoiceReceiptAddress;
    }

    /**
     * Sets the value of the invoiceReceiptAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAddressType }
     *     
     */
    public void setInvoiceReceiptAddress(InvoiceAddressType value) {
        this.invoiceReceiptAddress = value;
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
     * Gets the value of the corporateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateCode() {
        return corporateCode;
    }

    /**
     * Sets the value of the corporateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateCode(String value) {
        this.corporateCode = value;
    }

    /**
     * Gets the value of the groupCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * Sets the value of the groupCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountCode(Integer value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the autoContractRenewal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoContractRenewal() {
        return autoContractRenewal;
    }

    /**
     * Sets the value of the autoContractRenewal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoContractRenewal(Boolean value) {
        this.autoContractRenewal = value;
    }

    /**
     * Gets the value of the contractTemplateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTemplateID() {
        return contractTemplateID;
    }

    /**
     * Sets the value of the contractTemplateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTemplateID(String value) {
        this.contractTemplateID = value;
    }

    /**
     * Gets the value of the billingMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingMedia() {
        return billingMedia;
    }

    /**
     * Sets the value of the billingMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingMedia(String value) {
        this.billingMedia = value;
    }

}
