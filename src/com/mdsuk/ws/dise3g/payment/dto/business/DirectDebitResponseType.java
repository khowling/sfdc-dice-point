
package com.mdsuk.ws.dise3g.payment.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DirectDebitResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PaymentType" type="{http://mdsuk.com/ws/dise3g/base}PaymentTypeType"/>
 *         &lt;element name="BankAccountNumber" type="{http://mdsuk.com/ws/dise3g/base}BankAccountNumberType" minOccurs="0"/>
 *         &lt;element name="BankSortCode" type="{http://mdsuk.com/ws/dise3g/base}BankSortCodeType" minOccurs="0"/>
 *         &lt;element name="BankName" type="{http://mdsuk.com/ws/dise3g/base}BankNameType" minOccurs="0"/>
 *         &lt;element name="ControlDigit" type="{http://mdsuk.com/ws/dise3g/base}ControlDigitType" minOccurs="0"/>
 *         &lt;element name="NameOfPayer" type="{http://mdsuk.com/ws/dise3g/base}NameOfPayerType" minOccurs="0"/>
 *         &lt;element name="DateMandateReceived" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DirectDebitPaymentStatus" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}DirectDebitPaymentStatusType" minOccurs="0"/>
 *         &lt;element name="DDSetupMethodCode" type="{http://mdsuk.com/ws/dise3g/base}DDSetupMethodCodeType" minOccurs="0"/>
 *         &lt;element name="DDAccountName" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength60Type" minOccurs="0"/>
 *         &lt;element name="ConfirmationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitResponseType", propOrder = {
    "paymentType",
    "bankAccountNumber",
    "bankSortCode",
    "bankName",
    "controlDigit",
    "nameOfPayer",
    "dateMandateReceived",
    "directDebitPaymentStatus",
    "ddSetupMethodCode",
    "ddAccountName",
    "confirmationDate"
})
public class DirectDebitResponseType {

    @XmlElement(name = "PaymentType", required = true)
    protected String paymentType;
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
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateMandateReceived;
    @XmlElement(name = "DirectDebitPaymentStatus")
    protected String directDebitPaymentStatus;
    @XmlElement(name = "DDSetupMethodCode")
    protected String ddSetupMethodCode;
    @XmlElement(name = "DDAccountName")
    protected String ddAccountName;
    @XmlElement(name = "ConfirmationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar confirmationDate;

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
     * Gets the value of the directDebitPaymentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectDebitPaymentStatus() {
        return directDebitPaymentStatus;
    }

    /**
     * Sets the value of the directDebitPaymentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectDebitPaymentStatus(String value) {
        this.directDebitPaymentStatus = value;
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
     * Gets the value of the ddAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDDAccountName() {
        return ddAccountName;
    }

    /**
     * Sets the value of the ddAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDDAccountName(String value) {
        this.ddAccountName = value;
    }

    /**
     * Gets the value of the confirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmationDate() {
        return confirmationDate;
    }

    /**
     * Sets the value of the confirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmationDate(XMLGregorianCalendar value) {
        this.confirmationDate = value;
    }

}
