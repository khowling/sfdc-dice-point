
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceFrequencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="InvoiceFrequencyIn" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}InvoiceFrequencyInType"/>
 *         &lt;element name="InvoiceEvery" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}InvoiceEveryType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFrequencyType", propOrder = {

})
public class InvoiceFrequencyType {

    @XmlElement(name = "InvoiceFrequencyIn", required = true)
    protected InvoiceFrequencyInType invoiceFrequencyIn;
    @XmlElement(name = "InvoiceEvery")
    protected int invoiceEvery;

    /**
     * Gets the value of the invoiceFrequencyIn property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFrequencyInType }
     *     
     */
    public InvoiceFrequencyInType getInvoiceFrequencyIn() {
        return invoiceFrequencyIn;
    }

    /**
     * Sets the value of the invoiceFrequencyIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFrequencyInType }
     *     
     */
    public void setInvoiceFrequencyIn(InvoiceFrequencyInType value) {
        this.invoiceFrequencyIn = value;
    }

    /**
     * Gets the value of the invoiceEvery property.
     * 
     */
    public int getInvoiceEvery() {
        return invoiceEvery;
    }

    /**
     * Sets the value of the invoiceEvery property.
     * 
     */
    public void setInvoiceEvery(int value) {
        this.invoiceEvery = value;
    }

}
