
package com.mdsuk.ws.dise3g.address.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressUsageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="UsedByType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="UsedByNumber" type="{http://mdsuk.com/ws/dise3g/address/dto/business}NumberType" minOccurs="0"/>
 *         &lt;element name="Number" type="{http://mdsuk.com/ws/dise3g/address/dto/business}NumberType"/>
 *         &lt;element name="AddressText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AccountNumber" type="{http://mdsuk.com/ws/dise3g/address/dto/business}NumberType" minOccurs="0"/>
 *         &lt;element name="AccountUsage" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AccountUsageType" minOccurs="0"/>
 *         &lt;element name="Details" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UsedByCode" type="{http://mdsuk.com/ws/dise3g/address/dto/business}CodeType" minOccurs="0"/>
 *         &lt;element name="NetworkSerialNoDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountTypeDescription" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AccountTypeDescriptionType" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://mdsuk.com/ws/dise3g/base}PhoneNumberType" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://mdsuk.com/ws/dise3g/base}PhoneNumberType" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber2" type="{http://mdsuk.com/ws/dise3g/base}PhoneNumberType" minOccurs="0"/>
 *         &lt;element name="AddressTextHighlightedRegions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subset" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressUsageType", propOrder = {

})
public class AddressUsageType {

    @XmlElement(name = "UsedByType", required = true)
    protected String usedByType;
    @XmlElement(name = "UsedByNumber")
    protected Integer usedByNumber;
    @XmlElement(name = "Number")
    protected int number;
    @XmlElement(name = "AddressText", required = true)
    protected String addressText;
    @XmlElement(name = "AccountNumber")
    protected Integer accountNumber;
    @XmlElement(name = "AccountUsage")
    protected String accountUsage;
    @XmlElement(name = "Details")
    protected String details;
    @XmlElement(name = "UsedByCode")
    protected String usedByCode;
    @XmlElement(name = "NetworkSerialNoDescription")
    protected String networkSerialNoDescription;
    @XmlElement(name = "AccountTypeDescription")
    protected String accountTypeDescription;
    @XmlElement(name = "TelephoneNumber")
    protected String telephoneNumber;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;
    @XmlElement(name = "TelephoneNumber2")
    protected String telephoneNumber2;
    @XmlElement(name = "AddressTextHighlightedRegions")
    protected String addressTextHighlightedRegions;
    @XmlElement(name = "Subset")
    protected Boolean subset;

    /**
     * Gets the value of the usedByType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedByType() {
        return usedByType;
    }

    /**
     * Sets the value of the usedByType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedByType(String value) {
        this.usedByType = value;
    }

    /**
     * Gets the value of the usedByNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsedByNumber() {
        return usedByNumber;
    }

    /**
     * Sets the value of the usedByNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsedByNumber(Integer value) {
        this.usedByNumber = value;
    }

    /**
     * Gets the value of the number property.
     * 
     */
    public int getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     */
    public void setNumber(int value) {
        this.number = value;
    }

    /**
     * Gets the value of the addressText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressText() {
        return addressText;
    }

    /**
     * Sets the value of the addressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressText(String value) {
        this.addressText = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountNumber(Integer value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the accountUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountUsage() {
        return accountUsage;
    }

    /**
     * Sets the value of the accountUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountUsage(String value) {
        this.accountUsage = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetails(String value) {
        this.details = value;
    }

    /**
     * Gets the value of the usedByCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsedByCode() {
        return usedByCode;
    }

    /**
     * Sets the value of the usedByCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsedByCode(String value) {
        this.usedByCode = value;
    }

    /**
     * Gets the value of the networkSerialNoDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkSerialNoDescription() {
        return networkSerialNoDescription;
    }

    /**
     * Sets the value of the networkSerialNoDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkSerialNoDescription(String value) {
        this.networkSerialNoDescription = value;
    }

    /**
     * Gets the value of the accountTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountTypeDescription() {
        return accountTypeDescription;
    }

    /**
     * Sets the value of the accountTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountTypeDescription(String value) {
        this.accountTypeDescription = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the faxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFaxNumber() {
        return faxNumber;
    }

    /**
     * Sets the value of the faxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFaxNumber(String value) {
        this.faxNumber = value;
    }

    /**
     * Gets the value of the telephoneNumber2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber2() {
        return telephoneNumber2;
    }

    /**
     * Sets the value of the telephoneNumber2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber2(String value) {
        this.telephoneNumber2 = value;
    }

    /**
     * Gets the value of the addressTextHighlightedRegions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTextHighlightedRegions() {
        return addressTextHighlightedRegions;
    }

    /**
     * Sets the value of the addressTextHighlightedRegions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTextHighlightedRegions(String value) {
        this.addressTextHighlightedRegions = value;
    }

    /**
     * Gets the value of the subset property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubset() {
        return subset;
    }

    /**
     * Sets the value of the subset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubset(Boolean value) {
        this.subset = value;
    }

}
