
package com.mdsuk.ws.dise3g.address.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AddressQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressNumber" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressCodeType"/>
 *         &lt;choice>
 *           &lt;element name="PersonalAddress" type="{http://mdsuk.com/ws/dise3g/address/dto/business}PersonalAddressQueryType"/>
 *           &lt;element name="BusinessAddress" type="{http://mdsuk.com/ws/dise3g/address/dto/business}BusinessAddressQueryType"/>
 *         &lt;/choice>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressQueryType", propOrder = {
    "addressNumber",
    "personalAddress",
    "businessAddress",
    "lastAmendedDate"
})
public class AddressQueryType {

    @XmlElement(name = "AddressNumber")
    protected int addressNumber;
    @XmlElement(name = "PersonalAddress")
    protected PersonalAddressQueryType personalAddress;
    @XmlElement(name = "BusinessAddress")
    protected BusinessAddressQueryType businessAddress;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the addressNumber property.
     * 
     */
    public int getAddressNumber() {
        return addressNumber;
    }

    /**
     * Sets the value of the addressNumber property.
     * 
     */
    public void setAddressNumber(int value) {
        this.addressNumber = value;
    }

    /**
     * Gets the value of the personalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PersonalAddressQueryType }
     *     
     */
    public PersonalAddressQueryType getPersonalAddress() {
        return personalAddress;
    }

    /**
     * Sets the value of the personalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonalAddressQueryType }
     *     
     */
    public void setPersonalAddress(PersonalAddressQueryType value) {
        this.personalAddress = value;
    }

    /**
     * Gets the value of the businessAddress property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessAddressQueryType }
     *     
     */
    public BusinessAddressQueryType getBusinessAddress() {
        return businessAddress;
    }

    /**
     * Sets the value of the businessAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessAddressQueryType }
     *     
     */
    public void setBusinessAddress(BusinessAddressQueryType value) {
        this.businessAddress = value;
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
