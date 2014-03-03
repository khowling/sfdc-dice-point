
package com.mdsuk.ws.dise3g.discount.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CommonDiscountDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonDiscountDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetIdentifier" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}TargetIdentifierType"/>
 *         &lt;element name="DiscountSchemeCode" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}DiscountSchemeCodeType"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://mdsuk.com/ws/dise3g/base}ThreeDigitNumberType" minOccurs="0"/>
 *         &lt;element name="Stop" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonDiscountDataType", propOrder = {
    "targetIdentifier",
    "discountSchemeCode",
    "effectiveDate",
    "expiryDate",
    "sequenceNumber",
    "stop"
})
public class CommonDiscountDataType {

    @XmlElement(name = "TargetIdentifier", required = true)
    protected TargetIdentifierType targetIdentifier;
    @XmlElement(name = "DiscountSchemeCode", required = true)
    protected String discountSchemeCode;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlElement(name = "Stop", defaultValue = "false")
    protected Boolean stop;

    /**
     * Gets the value of the targetIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TargetIdentifierType }
     *     
     */
    public TargetIdentifierType getTargetIdentifier() {
        return targetIdentifier;
    }

    /**
     * Sets the value of the targetIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetIdentifierType }
     *     
     */
    public void setTargetIdentifier(TargetIdentifierType value) {
        this.targetIdentifier = value;
    }

    /**
     * Gets the value of the discountSchemeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountSchemeCode() {
        return discountSchemeCode;
    }

    /**
     * Sets the value of the discountSchemeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountSchemeCode(String value) {
        this.discountSchemeCode = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the stop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStop() {
        return stop;
    }

    /**
     * Sets the value of the stop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStop(Boolean value) {
        this.stop = value;
    }

}
