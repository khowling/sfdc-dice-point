
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.payment.dto.business.UpdateDirectDebitType;
import com.mdsuk.ws.dise3g.payment.dto.business.UpdatePaymentCardType;


/**
 * Data structure used to update the re-occurring payment type
 * 
 * <p>Java class for UpdatePaymentDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePaymentDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="PaymentCardDetails" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}UpdatePaymentCardType"/>
 *           &lt;element name="DirectDebitDetails" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}UpdateDirectDebitType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePaymentDetailsType", propOrder = {
    "paymentCardDetails",
    "directDebitDetails"
})
public class UpdatePaymentDetailsType {

    @XmlElement(name = "PaymentCardDetails")
    protected UpdatePaymentCardType paymentCardDetails;
    @XmlElement(name = "DirectDebitDetails")
    protected UpdateDirectDebitType directDebitDetails;

    /**
     * Gets the value of the paymentCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePaymentCardType }
     *     
     */
    public UpdatePaymentCardType getPaymentCardDetails() {
        return paymentCardDetails;
    }

    /**
     * Sets the value of the paymentCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePaymentCardType }
     *     
     */
    public void setPaymentCardDetails(UpdatePaymentCardType value) {
        this.paymentCardDetails = value;
    }

    /**
     * Gets the value of the directDebitDetails property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateDirectDebitType }
     *     
     */
    public UpdateDirectDebitType getDirectDebitDetails() {
        return directDebitDetails;
    }

    /**
     * Sets the value of the directDebitDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateDirectDebitType }
     *     
     */
    public void setDirectDebitDetails(UpdateDirectDebitType value) {
        this.directDebitDetails = value;
    }

}
