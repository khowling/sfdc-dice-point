
package com.mdsuk.ws.dise3g.payment.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.base.ClearableDateType;


/**
 * <p>Java class for DirectDebitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectDebitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DDAccountName" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength60Type" minOccurs="0"/>
 *         &lt;element name="BankAccountNumber" type="{http://mdsuk.com/ws/dise3g/base}BankAccountNumberType" minOccurs="0"/>
 *         &lt;element name="BankSortCode" type="{http://mdsuk.com/ws/dise3g/base}BankSortCodeType" minOccurs="0"/>
 *         &lt;element name="ControlDigit" type="{http://mdsuk.com/ws/dise3g/base}ControlDigitType" minOccurs="0"/>
 *         &lt;element name="NameOfPayer" type="{http://mdsuk.com/ws/dise3g/base}NameOfPayerType" minOccurs="0"/>
 *         &lt;element name="DateMandateReceived" type="{http://mdsuk.com/ws/dise3g/base}ClearableDateType" minOccurs="0"/>
 *         &lt;element name="DirectDebitPaymentStatus" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}DirectDebitPaymentStatusType" minOccurs="0"/>
 *         &lt;element name="DDSetupMethodCode" type="{http://mdsuk.com/ws/dise3g/base}DDSetupMethodCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitType", propOrder = {
    "ddAccountName",
    "bankAccountNumber",
    "bankSortCode",
    "controlDigit",
    "nameOfPayer",
    "dateMandateReceived",
    "directDebitPaymentStatus",
    "ddSetupMethodCode"
})
public class DirectDebitType {

    @XmlElement(name = "DDAccountName")
    protected String ddAccountName;
    @XmlElement(name = "BankAccountNumber")
    protected String bankAccountNumber;
    @XmlElement(name = "BankSortCode")
    protected String bankSortCode;
    @XmlElement(name = "ControlDigit")
    protected String controlDigit;
    @XmlElement(name = "NameOfPayer")
    protected String nameOfPayer;
    @XmlElement(name = "DateMandateReceived")
    protected ClearableDateType dateMandateReceived;
    @XmlElement(name = "DirectDebitPaymentStatus")
    protected String directDebitPaymentStatus;
    @XmlElement(name = "DDSetupMethodCode")
    protected String ddSetupMethodCode;

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
     *     {@link ClearableDateType }
     *     
     */
    public ClearableDateType getDateMandateReceived() {
        return dateMandateReceived;
    }

    /**
     * Sets the value of the dateMandateReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearableDateType }
     *     
     */
    public void setDateMandateReceived(ClearableDateType value) {
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

}
