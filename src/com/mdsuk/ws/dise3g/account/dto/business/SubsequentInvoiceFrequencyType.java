
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SubsequentInvoiceFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubsequentInvoiceFrequencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SubsequentInvoiceFrequencyDays" type="{http://mdsuk.com/ws/dise3g/base}DayOfMonthType" minOccurs="0"/>
 *         &lt;element name="SubsequentInvoiceFrequencyMonths" type="{http://mdsuk.com/ws/dise3g/base}MonthOfYearType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubsequentInvoiceFrequencyType", propOrder = {
    "subsequentInvoiceFrequencyDays",
    "subsequentInvoiceFrequencyMonths"
})
public class SubsequentInvoiceFrequencyType {

    @XmlElement(name = "SubsequentInvoiceFrequencyDays")
    protected Integer subsequentInvoiceFrequencyDays;
    @XmlElement(name = "SubsequentInvoiceFrequencyMonths")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String subsequentInvoiceFrequencyMonths;

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
     *     {@link String }
     *     
     */
    public String getSubsequentInvoiceFrequencyMonths() {
        return subsequentInvoiceFrequencyMonths;
    }

    /**
     * Sets the value of the subsequentInvoiceFrequencyMonths property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubsequentInvoiceFrequencyMonths(String value) {
        this.subsequentInvoiceFrequencyMonths = value;
    }

}
