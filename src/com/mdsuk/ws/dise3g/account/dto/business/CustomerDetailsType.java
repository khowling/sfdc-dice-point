
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure optionally returned as part of the Account Query response
 * 
 * <p>Java class for CustomerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AccountPassword" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountPasswordType" minOccurs="0"/>
 *         &lt;element name="AccountPIN" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountPINType" minOccurs="0"/>
 *         &lt;element name="ForAttnOfName" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type" minOccurs="0"/>
 *         &lt;element name="AccountContactName" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type" minOccurs="0"/>
 *         &lt;element name="CustomerCostCentre" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength20NotRequiredType" minOccurs="0"/>
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
@XmlType(name = "CustomerDetailsType", propOrder = {

})
public class CustomerDetailsType {

    @XmlElement(name = "AccountPassword")
    protected String accountPassword;
    @XmlElement(name = "AccountPIN")
    protected Integer accountPIN;
    @XmlElement(name = "ForAttnOfName")
    protected String forAttnOfName;
    @XmlElement(name = "AccountContactName")
    protected String accountContactName;
    @XmlElement(name = "CustomerCostCentre")
    protected String customerCostCentre;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the accountPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountPassword() {
        return accountPassword;
    }

    /**
     * Sets the value of the accountPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountPassword(String value) {
        this.accountPassword = value;
    }

    /**
     * Gets the value of the accountPIN property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountPIN() {
        return accountPIN;
    }

    /**
     * Sets the value of the accountPIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountPIN(Integer value) {
        this.accountPIN = value;
    }

    /**
     * Gets the value of the forAttnOfName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForAttnOfName() {
        return forAttnOfName;
    }

    /**
     * Sets the value of the forAttnOfName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForAttnOfName(String value) {
        this.forAttnOfName = value;
    }

    /**
     * Gets the value of the accountContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountContactName() {
        return accountContactName;
    }

    /**
     * Sets the value of the accountContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountContactName(String value) {
        this.accountContactName = value;
    }

    /**
     * Gets the value of the customerCostCentre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCostCentre() {
        return customerCostCentre;
    }

    /**
     * Sets the value of the customerCostCentre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCostCentre(String value) {
        this.customerCostCentre = value;
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
