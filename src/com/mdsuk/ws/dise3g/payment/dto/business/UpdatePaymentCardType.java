
package com.mdsuk.ws.dise3g.payment.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdatePaymentCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePaymentCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PaymentCard" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}PaymentCardType"/>
 *         &lt;element name="CancellationInformation" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}CancellationPaymentType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePaymentCardType", propOrder = {
    "paymentCard",
    "cancellationInformation"
})
public class UpdatePaymentCardType {

    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "CancellationInformation")
    protected CancellationPaymentType cancellationInformation;

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the cancellationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationPaymentType }
     *     
     */
    public CancellationPaymentType getCancellationInformation() {
        return cancellationInformation;
    }

    /**
     * Sets the value of the cancellationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationPaymentType }
     *     
     */
    public void setCancellationInformation(CancellationPaymentType value) {
        this.cancellationInformation = value;
    }

}
