
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Agreement data which can be updated with an "UpdateAgreementBasic" dataset 
 * 
 * <p>Java class for UpdateAgreementBasicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateAgreementBasicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="InvoiceFrequency" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}UpdateInvoiceFrequencyType" minOccurs="0"/>
 *         &lt;element name="InvoiceConsolidationLevel" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}UpdateInvoiceConsolidationLevelType" minOccurs="0"/>
 *         &lt;element name="InvoiceAddress" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}InvoiceAddressType" minOccurs="0"/>
 *         &lt;element name="BillingMedia" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}BillingMediaType" minOccurs="0"/>
 *         &lt;element name="AddressNumber" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}UpdateAddressNumberType" minOccurs="0"/>
 *         &lt;element name="AttachSubscriptionsOnCreation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "UpdateAgreementBasicType", propOrder = {

})
public class UpdateAgreementBasicType {

    @XmlElement(name = "InvoiceFrequency")
    protected UpdateInvoiceFrequencyType invoiceFrequency;
    @XmlElement(name = "InvoiceConsolidationLevel")
    protected UpdateInvoiceConsolidationLevelType invoiceConsolidationLevel;
    @XmlElement(name = "InvoiceAddress")
    protected InvoiceAddressType invoiceAddress;
    @XmlElement(name = "BillingMedia")
    protected String billingMedia;
    @XmlElement(name = "AddressNumber")
    protected Integer addressNumber;
    @XmlElement(name = "AttachSubscriptionsOnCreation")
    protected Boolean attachSubscriptionsOnCreation;
    @XmlElement(name = "LastAmendedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the invoiceFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateInvoiceFrequencyType }
     *     
     */
    public UpdateInvoiceFrequencyType getInvoiceFrequency() {
        return invoiceFrequency;
    }

    /**
     * Sets the value of the invoiceFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateInvoiceFrequencyType }
     *     
     */
    public void setInvoiceFrequency(UpdateInvoiceFrequencyType value) {
        this.invoiceFrequency = value;
    }

    /**
     * Gets the value of the invoiceConsolidationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateInvoiceConsolidationLevelType }
     *     
     */
    public UpdateInvoiceConsolidationLevelType getInvoiceConsolidationLevel() {
        return invoiceConsolidationLevel;
    }

    /**
     * Sets the value of the invoiceConsolidationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateInvoiceConsolidationLevelType }
     *     
     */
    public void setInvoiceConsolidationLevel(UpdateInvoiceConsolidationLevelType value) {
        this.invoiceConsolidationLevel = value;
    }

    /**
     * Gets the value of the invoiceAddress property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceAddressType }
     *     
     */
    public InvoiceAddressType getInvoiceAddress() {
        return invoiceAddress;
    }

    /**
     * Sets the value of the invoiceAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceAddressType }
     *     
     */
    public void setInvoiceAddress(InvoiceAddressType value) {
        this.invoiceAddress = value;
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

    /**
     * Gets the value of the addressNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAddressNumber(Integer value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the attachSubscriptionsOnCreation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachSubscriptionsOnCreation() {
        return attachSubscriptionsOnCreation;
    }

    /**
     * Sets the value of the attachSubscriptionsOnCreation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachSubscriptionsOnCreation(Boolean value) {
        this.attachSubscriptionsOnCreation = value;
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
