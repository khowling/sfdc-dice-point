
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure optionally returned as part of the Account Query response
 * 
 * <p>Java class for AutoPaymentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AutoPaymentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="AutoPaymentCalcMethod" type="{http://mdsuk.com/ws/dise3g/account/dto/business}AutoPaymentCalcMethodType" minOccurs="0"/>
 *         &lt;element name="SuspendFromAutoPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SuspendUpToDueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SuspendDueDateUntil" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SuspensionReason" type="{http://mdsuk.com/ws/dise3g/account/dto/business}SuspensionReasonType" minOccurs="0"/>
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
@XmlType(name = "AutoPaymentsType", propOrder = {

})
public class AutoPaymentsType {

    @XmlElement(name = "AutoPaymentCalcMethod")
    protected AutoPaymentCalcMethodType autoPaymentCalcMethod;
    @XmlElement(name = "SuspendFromAutoPayment")
    protected Boolean suspendFromAutoPayment;
    @XmlElement(name = "SuspendUpToDueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspendUpToDueDate;
    @XmlElement(name = "SuspendDueDateUntil")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar suspendDueDateUntil;
    @XmlElement(name = "SuspensionReason")
    protected String suspensionReason;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the autoPaymentCalcMethod property.
     * 
     * @return
     *     possible object is
     *     {@link AutoPaymentCalcMethodType }
     *     
     */
    public AutoPaymentCalcMethodType getAutoPaymentCalcMethod() {
        return autoPaymentCalcMethod;
    }

    /**
     * Sets the value of the autoPaymentCalcMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoPaymentCalcMethodType }
     *     
     */
    public void setAutoPaymentCalcMethod(AutoPaymentCalcMethodType value) {
        this.autoPaymentCalcMethod = value;
    }

    /**
     * Gets the value of the suspendFromAutoPayment property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspendFromAutoPayment() {
        return suspendFromAutoPayment;
    }

    /**
     * Sets the value of the suspendFromAutoPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspendFromAutoPayment(Boolean value) {
        this.suspendFromAutoPayment = value;
    }

    /**
     * Gets the value of the suspendUpToDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendUpToDueDate() {
        return suspendUpToDueDate;
    }

    /**
     * Sets the value of the suspendUpToDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendUpToDueDate(XMLGregorianCalendar value) {
        this.suspendUpToDueDate = value;
    }

    /**
     * Gets the value of the suspendDueDateUntil property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSuspendDueDateUntil() {
        return suspendDueDateUntil;
    }

    /**
     * Sets the value of the suspendDueDateUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSuspendDueDateUntil(XMLGregorianCalendar value) {
        this.suspendDueDateUntil = value;
    }

    /**
     * Gets the value of the suspensionReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuspensionReason() {
        return suspensionReason;
    }

    /**
     * Sets the value of the suspensionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuspensionReason(String value) {
        this.suspensionReason = value;
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
