
package com.mdsuk.ws.dise3g.payment.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateDirectDebitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateDirectDebitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="DirectDebit" type="{http://mdsuk.com/ws/dise3g/payment/dto/business}DirectDebitType"/>
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
@XmlType(name = "UpdateDirectDebitType", propOrder = {
    "directDebit",
    "cancellationInformation"
})
public class UpdateDirectDebitType {

    @XmlElement(name = "DirectDebit")
    protected DirectDebitType directDebit;
    @XmlElement(name = "CancellationInformation")
    protected CancellationPaymentType cancellationInformation;

    /**
     * Gets the value of the directDebit property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitType }
     *     
     */
    public DirectDebitType getDirectDebit() {
        return directDebit;
    }

    /**
     * Sets the value of the directDebit property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitType }
     *     
     */
    public void setDirectDebit(DirectDebitType value) {
        this.directDebit = value;
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
