
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.mdsuk.ws.dise3g.address.dto.business.AddressType;


/**
 * Data structure used in Account Creation
 * 
 * <p>Java class for AccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CompanyNumber" type="{http://mdsuk.com/ws/dise3g/base}CompanyNumberType"/>
 *         &lt;element name="Address" type="{http://mdsuk.com/ws/dise3g/address/dto/business}AddressType"/>
 *         &lt;element name="PaymentType" type="{http://mdsuk.com/ws/dise3g/base}PaymentTypeType" minOccurs="0"/>
 *         &lt;element name="PaymentTerm" type="{http://mdsuk.com/ws/dise3g/base}PaymentTermType" minOccurs="0"/>
 *         &lt;element name="AccountType" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountTypeType" minOccurs="0"/>
 *         &lt;element name="SubLedgerCode" type="{http://mdsuk.com/ws/dise3g/account/dto/business}SubLedgerCodeType" minOccurs="0"/>
 *         &lt;element name="CreditLimit" type="{http://mdsuk.com/ws/dise3g/account/dto/business}CreditLimitType" minOccurs="0"/>
 *         &lt;element name="HardwareCreditLimit" type="{http://mdsuk.com/ws/dise3g/account/dto/business}HardwareCreditLimitType" minOccurs="0"/>
 *         &lt;element name="AccountPassword" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountPasswordType" minOccurs="0"/>
 *         &lt;element name="AccountPIN" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountPINType" minOccurs="0"/>
 *         &lt;element name="AccountUsage" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AccountUsageType" minOccurs="0"/>
 *         &lt;element name="BankAccountNumber" type="{http://mdsuk.com/ws/dise3g/base}BankAccountNumberType" minOccurs="0"/>
 *         &lt;element name="BankSortCode" type="{http://mdsuk.com/ws/dise3g/base}BankSortCodeType" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://mdsuk.com/ws/dise3g/base}BankNameType" minOccurs="0"/>
 *         &lt;element name="ControlDigit" type="{http://mdsuk.com/ws/dise3g/base}ControlDigitType" minOccurs="0"/>
 *         &lt;element name="NameOfPayer" type="{http://mdsuk.com/ws/dise3g/base}NameOfPayerType" minOccurs="0"/>
 *         &lt;element name="DateMandateReceived" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="DDSetupMethodCode" type="{http://mdsuk.com/ws/dise3g/base}DDSetupMethodCodeType" minOccurs="0"/>
 *         &lt;element name="CCDCCardNumber" type="{http://mdsuk.com/ws/dise3g/base}CCDCCardNumberType" minOccurs="0"/>
 *         &lt;element name="NameOnCard" type="{http://mdsuk.com/ws/dise3g/base}NameOnCardType" minOccurs="0"/>
 *         &lt;element name="FriendlyName" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength70Type" minOccurs="0"/>
 *         &lt;element name="StartYear" type="{http://mdsuk.com/ws/dise3g/base}YearNumberType" minOccurs="0"/>
 *         &lt;element name="StartMonth" type="{http://mdsuk.com/ws/dise3g/base}MonthNumberType" minOccurs="0"/>
 *         &lt;element name="ExpiryYear" type="{http://mdsuk.com/ws/dise3g/base}YearNumberType" minOccurs="0"/>
 *         &lt;element name="ExpiryMonth" type="{http://mdsuk.com/ws/dise3g/base}MonthNumberType" minOccurs="0"/>
 *         &lt;element name="CreditSecurityCode" type="{http://mdsuk.com/ws/dise3g/base}CreditSecurityCodeType" minOccurs="0"/>
 *         &lt;element name="CorporateCode" type="{http://mdsuk.com/ws/dise3g/base}CorporateCodeType" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength70Type" minOccurs="0"/>
 *         &lt;element name="AccountSerialNumbers" type="{http://mdsuk.com/ws/dise3g/account/dto/business}SimpleCreateAccountSerialNumbersType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountType", propOrder = {

})
public class AccountType {

    @XmlElement(name = "CompanyNumber", required = true)
    protected String companyNumber;
    @XmlElement(name = "Address", required = true)
    protected AddressType address;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "PaymentTerm")
    protected String paymentTerm;
    @XmlElement(name = "AccountType")
    protected String accountType;
    @XmlElement(name = "SubLedgerCode")
    protected String subLedgerCode;
    @XmlElement(name = "CreditLimit")
    protected Integer creditLimit;
    @XmlElement(name = "HardwareCreditLimit")
    protected Integer hardwareCreditLimit;
    @XmlElement(name = "AccountPassword")
    protected String accountPassword;
    @XmlElement(name = "AccountPIN")
    protected Integer accountPIN;
    @XmlElement(name = "AccountUsage", defaultValue = "SubscriptionAndSales")
    protected AccountUsageType accountUsage;
    @XmlElement(name = "BankAccountNumber")
    protected String bankAccountNumber;
    @XmlElement(name = "BankSortCode")
    protected String bankSortCode;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "ControlDigit")
    protected String controlDigit;
    @XmlElement(name = "NameOfPayer")
    protected String nameOfPayer;
    @XmlElement(name = "DateMandateReceived")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateMandateReceived;
    @XmlElement(name = "DDSetupMethodCode")
    protected String ddSetupMethodCode;
    @XmlElement(name = "CCDCCardNumber")
    protected String ccdcCardNumber;
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
    @XmlElement(name = "CorporateCode")
    protected String corporateCode;
    @XmlElement(name = "EmailAddress")
    protected String emailAddress;
    @XmlElement(name = "AccountSerialNumbers")
    protected SimpleCreateAccountSerialNumbersType accountSerialNumbers;

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
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Sets the value of the paymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * Gets the value of the paymentTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Sets the value of the paymentTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTerm(String value) {
        this.paymentTerm = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the subLedgerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLedgerCode() {
        return subLedgerCode;
    }

    /**
     * Sets the value of the subLedgerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLedgerCode(String value) {
        this.subLedgerCode = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCreditLimit(Integer value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the hardwareCreditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getHardwareCreditLimit() {
        return hardwareCreditLimit;
    }

    /**
     * Sets the value of the hardwareCreditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setHardwareCreditLimit(Integer value) {
        this.hardwareCreditLimit = value;
    }

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
     * Gets the value of the accountUsage property.
     * 
     * @return
     *     possible object is
     *     {@link AccountUsageType }
     *     
     */
    public AccountUsageType getAccountUsage() {
        return accountUsage;
    }

    /**
     * Sets the value of the accountUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountUsageType }
     *     
     */
    public void setAccountUsage(AccountUsageType value) {
        this.accountUsage = value;
    }

    /**
     * Gets the value of the bankAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    /**
     * Sets the value of the bankAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccountNumber(String value) {
        this.bankAccountNumber = value;
    }

    /**
     * Gets the value of the bankSortCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankSortCode() {
        return bankSortCode;
    }

    /**
     * Sets the value of the bankSortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankSortCode(String value) {
        this.bankSortCode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the controlDigit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlDigit() {
        return controlDigit;
    }

    /**
     * Sets the value of the controlDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlDigit(String value) {
        this.controlDigit = value;
    }

    /**
     * Gets the value of the nameOfPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfPayer() {
        return nameOfPayer;
    }

    /**
     * Sets the value of the nameOfPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfPayer(String value) {
        this.nameOfPayer = value;
    }

    /**
     * Gets the value of the dateMandateReceived property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateMandateReceived() {
        return dateMandateReceived;
    }

    /**
     * Sets the value of the dateMandateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateMandateReceived(XMLGregorianCalendar value) {
        this.dateMandateReceived = value;
    }

    /**
     * Gets the value of the ddSetupMethodCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDSetupMethodCode() {
        return ddSetupMethodCode;
    }

    /**
     * Sets the value of the ddSetupMethodCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDSetupMethodCode(String value) {
        this.ddSetupMethodCode = value;
    }

    /**
     * Gets the value of the ccdcCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCDCCardNumber() {
        return ccdcCardNumber;
    }

    /**
     * Sets the value of the ccdcCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCDCCardNumber(String value) {
        this.ccdcCardNumber = value;
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
     * Gets the value of the accountSerialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCreateAccountSerialNumbersType }
     *     
     */
    public SimpleCreateAccountSerialNumbersType getAccountSerialNumbers() {
        return accountSerialNumbers;
    }

    /**
     * Sets the value of the accountSerialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCreateAccountSerialNumbersType }
     *     
     */
    public void setAccountSerialNumbers(SimpleCreateAccountSerialNumbersType value) {
        this.accountSerialNumbers = value;
    }

}
