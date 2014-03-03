
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure is returned as part of the Subscription Query response
 *                 when BASIC dataset is specified
 * 
 * <p>Java class for SubscriptionBasicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionBasicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SubscriptionNumber" type="{http://mdsuk.com/ws/dise3g/base}SubscriptionNumberType"/>
 *         &lt;element name="AgreementNumber" type="{http://mdsuk.com/ws/dise3g/base}AgreementNumberType"/>
 *         &lt;element name="AccountNumber" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="CorporateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyNumber" type="{http://mdsuk.com/ws/dise3g/base}CompanyNumberType" minOccurs="0"/>
 *         &lt;element name="SalesAccountCode" type="{http://mdsuk.com/ws/dise3g/base}AccountNumberType" minOccurs="0"/>
 *         &lt;element name="SubscriptionStatus" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SubscriptionStatusType" minOccurs="0"/>
 *         &lt;element name="TariffCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}TariffCodeType"/>
 *         &lt;element name="NetworkCode" type="{http://mdsuk.com/ws/dise3g/base}NetworkCodeType" minOccurs="0"/>
 *         &lt;element name="ConnectedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DisconnectedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TerminateOn" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ConnectionReason" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ConnectionReasonType" minOccurs="0"/>
 *         &lt;element name="AddressNumber" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressCodeType" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "SubscriptionBasicType", propOrder = {

})
public class SubscriptionBasicType {

    @XmlElement(name = "SubscriptionNumber")
    protected int subscriptionNumber;
    @XmlElement(name = "AgreementNumber")
    protected int agreementNumber;
    @XmlElement(name = "AccountNumber")
    protected Integer accountNumber;
    @XmlElement(name = "CorporateCode")
    protected String corporateCode;
    @XmlElement(name = "GroupCode")
    protected String groupCode;
    @XmlElement(name = "CompanyNumber")
    protected String companyNumber;
    @XmlElement(name = "SalesAccountCode")
    protected Integer salesAccountCode;
    @XmlElement(name = "SubscriptionStatus")
    protected String subscriptionStatus;
    @XmlElement(name = "TariffCode", required = true)
    protected String tariffCode;
    @XmlElement(name = "NetworkCode")
    protected String networkCode;
    @XmlElement(name = "ConnectedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar connectedDate;
    @XmlElement(name = "DisconnectedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar disconnectedDate;
    @XmlElement(name = "TerminateOn")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar terminateOn;
    @XmlElement(name = "ConnectionReason")
    protected String connectionReason;
    @XmlElement(name = "AddressNumber")
    protected Integer addressNumber;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the subscriptionNumber property.
     * 
     */
    public int getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /**
     * Sets the value of the subscriptionNumber property.
     * 
     */
    public void setSubscriptionNumber(int value) {
        this.subscriptionNumber = value;
    }

    /**
     * Gets the value of the agreementNumber property.
     * 
     */
    public int getAgreementNumber() {
        return agreementNumber;
    }

    /**
     * Sets the value of the agreementNumber property.
     * 
     */
    public void setAgreementNumber(int value) {
        this.agreementNumber = value;
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
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNumber(String value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the salesAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesAccountCode() {
        return salesAccountCode;
    }

    /**
     * Sets the value of the salesAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesAccountCode(Integer value) {
        this.salesAccountCode = value;
    }

    /**
     * Gets the value of the subscriptionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionStatus() {
        return subscriptionStatus;
    }

    /**
     * Sets the value of the subscriptionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionStatus(String value) {
        this.subscriptionStatus = value;
    }

    /**
     * Gets the value of the tariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffCode() {
        return tariffCode;
    }

    /**
     * Sets the value of the tariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

    /**
     * Gets the value of the networkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkCode() {
        return networkCode;
    }

    /**
     * Sets the value of the networkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkCode(String value) {
        this.networkCode = value;
    }

    /**
     * Gets the value of the connectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConnectedDate() {
        return connectedDate;
    }

    /**
     * Sets the value of the connectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConnectedDate(XMLGregorianCalendar value) {
        this.connectedDate = value;
    }

    /**
     * Gets the value of the disconnectedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisconnectedDate() {
        return disconnectedDate;
    }

    /**
     * Sets the value of the disconnectedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisconnectedDate(XMLGregorianCalendar value) {
        this.disconnectedDate = value;
    }

    /**
     * Gets the value of the terminateOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTerminateOn() {
        return terminateOn;
    }

    /**
     * Sets the value of the terminateOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTerminateOn(XMLGregorianCalendar value) {
        this.terminateOn = value;
    }

    /**
     * Gets the value of the connectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionReason() {
        return connectionReason;
    }

    /**
     * Sets the value of the connectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionReason(String value) {
        this.connectionReason = value;
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
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
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
