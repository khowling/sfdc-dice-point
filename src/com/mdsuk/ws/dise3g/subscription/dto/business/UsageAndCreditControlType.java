
package com.mdsuk.ws.dise3g.subscription.dto.business;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This structure is returned as part of the Subscription Query response
 *                 when USAGEANDCREDITCONTROL dataset is specified
 * 
 * <p>Java class for UsageAndCreditControlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageAndCreditControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="LowerUsageLimit" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="UpperUsageLimit" type="{http://mdsuk.com/ws/dise3g/base}Currency9_2NotRequiredType" minOccurs="0"/>
 *         &lt;element name="IgnoreUsageLimits" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AutoAdjust" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IgnoreCreditControlProcedures" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "UsageAndCreditControlType", propOrder = {

})
public class UsageAndCreditControlType {

    @XmlElement(name = "LowerUsageLimit")
    protected BigDecimal lowerUsageLimit;
    @XmlElement(name = "UpperUsageLimit")
    protected BigDecimal upperUsageLimit;
    @XmlElement(name = "IgnoreUsageLimits")
    protected Boolean ignoreUsageLimits;
    @XmlElement(name = "AutoAdjust")
    protected Boolean autoAdjust;
    @XmlElement(name = "IgnoreCreditControlProcedures")
    protected Boolean ignoreCreditControlProcedures;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the lowerUsageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLowerUsageLimit() {
        return lowerUsageLimit;
    }

    /**
     * Sets the value of the lowerUsageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLowerUsageLimit(BigDecimal value) {
        this.lowerUsageLimit = value;
    }

    /**
     * Gets the value of the upperUsageLimit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUpperUsageLimit() {
        return upperUsageLimit;
    }

    /**
     * Sets the value of the upperUsageLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUpperUsageLimit(BigDecimal value) {
        this.upperUsageLimit = value;
    }

    /**
     * Gets the value of the ignoreUsageLimits property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreUsageLimits() {
        return ignoreUsageLimits;
    }

    /**
     * Sets the value of the ignoreUsageLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreUsageLimits(Boolean value) {
        this.ignoreUsageLimits = value;
    }

    /**
     * Gets the value of the autoAdjust property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoAdjust() {
        return autoAdjust;
    }

    /**
     * Sets the value of the autoAdjust property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoAdjust(Boolean value) {
        this.autoAdjust = value;
    }

    /**
     * Gets the value of the ignoreCreditControlProcedures property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreCreditControlProcedures() {
        return ignoreCreditControlProcedures;
    }

    /**
     * Sets the value of the ignoreCreditControlProcedures property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreCreditControlProcedures(Boolean value) {
        this.ignoreCreditControlProcedures = value;
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
