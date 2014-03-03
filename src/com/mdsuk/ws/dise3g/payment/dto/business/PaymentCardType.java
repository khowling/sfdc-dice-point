
package com.mdsuk.ws.dise3g.payment.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PaymentCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardNumber" type="{http://mdsuk.com/ws/dise3g/base}CCDCCardNumberType" minOccurs="0"/>
 *         &lt;element name="NameOnCard" type="{http://mdsuk.com/ws/dise3g/base}NameOnCardType" minOccurs="0"/>
 *         &lt;element name="FriendlyName" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength70Type" minOccurs="0"/>
 *         &lt;element name="StartYear" type="{http://mdsuk.com/ws/dise3g/base}YearNumberType" minOccurs="0"/>
 *         &lt;element name="StartMonth" type="{http://mdsuk.com/ws/dise3g/base}MonthNumberType" minOccurs="0"/>
 *         &lt;element name="ExpiryYear" type="{http://mdsuk.com/ws/dise3g/base}YearNumberType" minOccurs="0"/>
 *         &lt;element name="ExpiryMonth" type="{http://mdsuk.com/ws/dise3g/base}MonthNumberType" minOccurs="0"/>
 *         &lt;element name="CreditSecurityCode" type="{http://mdsuk.com/ws/dise3g/base}CreditSecurityCodeType" minOccurs="0"/>
 *         &lt;element name="PostCode" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength10Type" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{http://mdsuk.com/ws/dise3g/base}StringFixedLength2Type" minOccurs="0"/>
 *         &lt;element name="HouseStreetNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardType", propOrder = {
    "cardNumber",
    "nameOnCard",
    "friendlyName",
    "startYear",
    "startMonth",
    "expiryYear",
    "expiryMonth",
    "creditSecurityCode",
    "postCode",
    "countryCode",
    "houseStreetNumber"
})
public class PaymentCardType {

    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "NameOnCard")
    protected String nameOnCard;
    @XmlElement(name = "FriendlyName")
    protected String friendlyName;
    @XmlElement(name = "StartYear")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startYear;
    @XmlElement(name = "StartMonth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String startMonth;
    @XmlElement(name = "ExpiryYear")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String expiryYear;
    @XmlElement(name = "ExpiryMonth")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String expiryMonth;
    @XmlElement(name = "CreditSecurityCode")
    protected String creditSecurityCode;
    @XmlElement(name = "PostCode")
    protected String postCode;
    @XmlElement(name = "CountryCode")
    protected String countryCode;
    @XmlElement(name = "HouseStreetNumber")
    protected String houseStreetNumber;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the nameOnCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOnCard() {
        return nameOnCard;
    }

    /**
     * Sets the value of the nameOnCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOnCard(String value) {
        this.nameOnCard = value;
    }

    /**
     * Gets the value of the friendlyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * Sets the value of the friendlyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyName(String value) {
        this.friendlyName = value;
    }

    /**
     * Gets the value of the startYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartYear() {
        return startYear;
    }

    /**
     * Sets the value of the startYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartYear(String value) {
        this.startYear = value;
    }

    /**
     * Gets the value of the startMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartMonth() {
        return startMonth;
    }

    /**
     * Sets the value of the startMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartMonth(String value) {
        this.startMonth = value;
    }

    /**
     * Gets the value of the expiryYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryYear() {
        return expiryYear;
    }

    /**
     * Sets the value of the expiryYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryYear(String value) {
        this.expiryYear = value;
    }

    /**
     * Gets the value of the expiryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryMonth() {
        return expiryMonth;
    }

    /**
     * Sets the value of the expiryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryMonth(String value) {
        this.expiryMonth = value;
    }

    /**
     * Gets the value of the creditSecurityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditSecurityCode() {
        return creditSecurityCode;
    }

    /**
     * Sets the value of the creditSecurityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditSecurityCode(String value) {
        this.creditSecurityCode = value;
    }

    /**
     * Gets the value of the postCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Sets the value of the postCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCode(String value) {
        this.postCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the houseStreetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseStreetNumber() {
        return houseStreetNumber;
    }

    /**
     * Sets the value of the houseStreetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseStreetNumber(String value) {
        this.houseStreetNumber = value;
    }

}
