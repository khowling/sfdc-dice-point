
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.mdsuk.ws.dise3g.payment.dto.business.ChequeType;
import com.mdsuk.ws.dise3g.payment.dto.business.DirectDebitResponseType;
import com.mdsuk.ws.dise3g.payment.dto.business.PaymentCardQueryType;


/**
 * Data structure optionally returned as part of Account Query
 * 
 * <p>Java class for PaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Cheque" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}ChequeType"/>
 *           &lt;element name="PaymentCard" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}PaymentCardQueryType"/>
 *           &lt;element name="DirectDebit" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}DirectDebitResponseType"/>
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
@XmlType(name = "PaymentDetailsType", propOrder = {
    "cheque",
    "paymentCard",
    "directDebit",
    "lastAmendedDate"
})
public class PaymentDetailsType {

    @XmlElement(name = "Cheque")
    protected ChequeType cheque;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardQueryType paymentCard;
    @XmlElement(name = "DirectDebit")
    protected DirectDebitResponseType directDebit;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the cheque property.
     * 
     * @return
     *     possible object is
     *     {@link ChequeType }
     *     
     */
    public ChequeType getCheque() {
        return cheque;
    }

    /**
     * Sets the value of the cheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChequeType }
     *     
     */
    public void setCheque(ChequeType value) {
        this.cheque = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardQueryType }
     *     
     */
    public PaymentCardQueryType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardQueryType }
     *     
     */
    public void setPaymentCard(PaymentCardQueryType value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the directDebit property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitResponseType }
     *     
     */
    public DirectDebitResponseType getDirectDebit() {
        return directDebit;
    }

    /**
     * Sets the value of the directDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitResponseType }
     *     
     */
    public void setDirectDebit(DirectDebitResponseType value) {
        this.directDebit = value;
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
