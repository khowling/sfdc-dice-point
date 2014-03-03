
package com.mdsuk.ws.dise3g.address.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="GroupIdentifier" type="{http://mdsuk.com/ws/dise3g/base}GroupCodeType"/>
 *         &lt;element name="CorporateIdentifier" type="{http://mdsuk.com/ws/dise3g/base}CorporateCodeType"/>
 *         &lt;element name="AccountIdentifier" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType"/>
 *         &lt;element name="SubscriptionIdentifier" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetIdentifierType", propOrder = {
    "groupIdentifier",
    "corporateIdentifier",
    "accountIdentifier",
    "subscriptionIdentifier"
})
public class TargetIdentifierType {

    @XmlElement(name = "GroupIdentifier")
    protected String groupIdentifier;
    @XmlElement(name = "CorporateIdentifier")
    protected String corporateIdentifier;
    @XmlElement(name = "AccountIdentifier")
    protected Integer accountIdentifier;
    @XmlElement(name = "SubscriptionIdentifier")
    protected Integer subscriptionIdentifier;

    /**
     * Gets the value of the groupIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIdentifier() {
        return groupIdentifier;
    }

    /**
     * Sets the value of the groupIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIdentifier(String value) {
        this.groupIdentifier = value;
    }

    /**
     * Gets the value of the corporateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateIdentifier() {
        return corporateIdentifier;
    }

    /**
     * Sets the value of the corporateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateIdentifier(String value) {
        this.corporateIdentifier = value;
    }

    /**
     * Gets the value of the accountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAccountIdentifier() {
        return accountIdentifier;
    }

    /**
     * Sets the value of the accountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAccountIdentifier(Integer value) {
        this.accountIdentifier = value;
    }

    /**
     * Gets the value of the subscriptionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionIdentifier() {
        return subscriptionIdentifier;
    }

    /**
     * Sets the value of the subscriptionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionIdentifier(Integer value) {
        this.subscriptionIdentifier = value;
    }

}
