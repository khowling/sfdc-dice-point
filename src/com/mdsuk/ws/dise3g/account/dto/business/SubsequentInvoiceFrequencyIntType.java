
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubsequentInvoiceFrequencyIntType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubsequentInvoiceFrequencyIntType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SubsequentInvoiceFrequencyDays" type="{http://mdsuk.com/ws/dise3g/base}DayOfMonthIntType" minOccurs="0"/>
 *         &lt;element name="SubsequentInvoiceFrequencyMonths" type="{http://mdsuk.com/ws/dise3g/base}MonthOfYearIntType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsequentInvoiceFrequencyIntType", propOrder = {
    "subsequentInvoiceFrequencyDays",
    "subsequentInvoiceFrequencyMonths"
})
public class SubsequentInvoiceFrequencyIntType {

    @XmlElement(name = "SubsequentInvoiceFrequencyDays")
    protected Integer subsequentInvoiceFrequencyDays;
    @XmlElement(name = "SubsequentInvoiceFrequencyMonths")
    protected Integer subsequentInvoiceFrequencyMonths;

    /**
     * Gets the value of the subsequentInvoiceFrequencyDays property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubsequentInvoiceFrequencyDays() {
        return subsequentInvoiceFrequencyDays;
    }

    /**
     * Sets the value of the subsequentInvoiceFrequencyDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubsequentInvoiceFrequencyDays(Integer value) {
        this.subsequentInvoiceFrequencyDays = value;
    }

    /**
     * Gets the value of the subsequentInvoiceFrequencyMonths property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubsequentInvoiceFrequencyMonths() {
        return subsequentInvoiceFrequencyMonths;
    }

    /**
     * Sets the value of the subsequentInvoiceFrequencyMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubsequentInvoiceFrequencyMonths(Integer value) {
        this.subsequentInvoiceFrequencyMonths = value;
    }

}
