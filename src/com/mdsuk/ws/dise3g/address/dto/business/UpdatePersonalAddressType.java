
package com.mdsuk.ws.dise3g.address.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.base.ClearableDateType;


/**
 * <p>Java class for UpdatePersonalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePersonalAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Title" type="{http://mdsuk.com/ws/dise3g/address/dto/business}TitleType"/>
 *         &lt;element name="Forename" type="{http://mdsuk.com/ws/dise3g/address/dto/business}ForenameType" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://mdsuk.com/ws/dise3g/address/dto/business}MiddlenameType" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://mdsuk.com/ws/dise3g/address/dto/business}SurnameType"/>
 *         &lt;element name="Address1" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressLineType"/>
 *         &lt;element name="Address2" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressLineType" minOccurs="0"/>
 *         &lt;element name="Address3" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressLineType" minOccurs="0"/>
 *         &lt;element name="Address4" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressLineType" minOccurs="0"/>
 *         &lt;element name="Address5" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressLineType" minOccurs="0"/>
 *         &lt;element name="Postcode" type="{http://mdsuk.com/ws/dise3g/address/dto/business}PostcodeType" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://mdsuk.com/ws/dise3g/base}ClearableDateType" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://mdsuk.com/ws/dise3g/address/dto/business}GenderType" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://mdsuk.com/ws/dise3g/address/dto/business}MaritalStatusType" minOccurs="0"/>
 *         &lt;element name="DateOfResidence" type="{http://mdsuk.com/ws/dise3g/base}ClearableDateType" minOccurs="0"/>
 *         &lt;element name="CustomerType" type="{http://mdsuk.com/ws/dise3g/address/dto/business}CustomerType" minOccurs="0"/>
 *         &lt;element name="AddressType" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressOwnershipType" minOccurs="0"/>
 *         &lt;element name="AddressCategory" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressCategoryType" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://mdsuk.com/ws/dise3g/address/dto/business}OccupationType" minOccurs="0"/>
 *         &lt;element name="IDType" type="{http://mdsuk.com/ws/dise3g/address/dto/business}IdType" minOccurs="0"/>
 *         &lt;element name="IDNumber" type="{http://mdsuk.com/ws/dise3g/address/dto/business}IdNumberType" minOccurs="0"/>
 *         &lt;element name="TelephoneNumber" type="{http://mdsuk.com/ws/dise3g/base}PhoneNumberType" minOccurs="0"/>
 *         &lt;element name="EveningTelephoneNumber" type="{http://mdsuk.com/ws/dise3g/base}PhoneNumberType" minOccurs="0"/>
 *         &lt;element name="FaxNumber" type="{http://mdsuk.com/ws/dise3g/base}PhoneNumberType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePersonalAddressType", propOrder = {

})
public class UpdatePersonalAddressType {

    @XmlElement(name = "Title", required = true)
    protected String title;
    @XmlElement(name = "Forename")
    protected String forename;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "Surname", required = true)
    protected String surname;
    @XmlElement(name = "Address1", required = true)
    protected String address1;
    @XmlElement(name = "Address2")
    protected String address2;
    @XmlElement(name = "Address3")
    protected String address3;
    @XmlElement(name = "Address4")
    protected String address4;
    @XmlElement(name = "Address5")
    protected String address5;
    @XmlElement(name = "Postcode")
    protected String postcode;
    @XmlElement(name = "DateOfBirth")
    protected ClearableDateType dateOfBirth;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "MaritalStatus")
    protected MaritalStatusType maritalStatus;
    @XmlElement(name = "DateOfResidence")
    protected ClearableDateType dateOfResidence;
    @XmlElement(name = "CustomerType")
    protected String customerType;
    @XmlElement(name = "AddressType")
    protected String addressType;
    @XmlElement(name = "AddressCategory")
    protected String addressCategory;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "IDNumber")
    protected String idNumber;
    @XmlElement(name = "TelephoneNumber")
    protected String telephoneNumber;
    @XmlElement(name = "EveningTelephoneNumber")
    protected String eveningTelephoneNumber;
    @XmlElement(name = "FaxNumber")
    protected String faxNumber;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForename(String value) {
        this.forename = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the address3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress3() {
        return address3;
    }

    /**
     * Sets the value of the address3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress3(String value) {
        this.address3 = value;
    }

    /**
     * Gets the value of the address4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress4() {
        return address4;
    }

    /**
     * Sets the value of the address4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress4(String value) {
        this.address4 = value;
    }

    /**
     * Gets the value of the address5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress5() {
        return address5;
    }

    /**
     * Sets the value of the address5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress5(String value) {
        this.address5 = value;
    }

    /**
     * Gets the value of the postcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * Sets the value of the postcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostcode(String value) {
        this.postcode = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link ClearableDateType }
     *     
     */
    public ClearableDateType getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearableDateType }
     *     
     */
    public void setDateOfBirth(ClearableDateType value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusType }
     *     
     */
    public MaritalStatusType getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusType }
     *     
     */
    public void setMaritalStatus(MaritalStatusType value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the dateOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link ClearableDateType }
     *     
     */
    public ClearableDateType getDateOfResidence() {
        return dateOfResidence;
    }

    /**
     * Sets the value of the dateOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearableDateType }
     *     
     */
    public void setDateOfResidence(ClearableDateType value) {
        this.dateOfResidence = value;
    }

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the addressCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressCategory() {
        return addressCategory;
    }

    /**
     * Sets the value of the addressCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressCategory(String value) {
        this.addressCategory = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
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
     * Gets the value of the eveningTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEveningTelephoneNumber() {
        return eveningTelephoneNumber;
    }

    /**
     * Sets the value of the eveningTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEveningTelephoneNumber(String value) {
        this.eveningTelephoneNumber = value;
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

}
