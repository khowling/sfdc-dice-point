
package com.mdsuk.ws.dise3g.discount.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ServiceItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceCode" type="{http://mdsuk.com/ws/dise3g/base}ServiceCodeType"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="BandType" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}BandTypeType"/>
 *         &lt;element name="BasedOnValue" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}BasedOnValueType"/>
 *         &lt;element name="BasedOnVolume" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceItemType", propOrder = {
    "serviceCode",
    "effectiveDate",
    "bandType",
    "basedOnValue",
    "basedOnVolume"
})
public class ServiceItemType {

    @XmlElement(name = "ServiceCode", required = true)
    protected String serviceCode;
    @XmlElement(name = "EffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "BandType", required = true)
    protected BandTypeType bandType;
    @XmlElement(name = "BasedOnValue", required = true)
    protected BasedOnValueType basedOnValue;
    @XmlElement(name = "BasedOnVolume", defaultValue = "false")
    protected Boolean basedOnVolume;

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
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
     * Gets the value of the bandType property.
     * 
     * @return
     *     possible object is
     *     {@link BandTypeType }
     *     
     */
    public BandTypeType getBandType() {
        return bandType;
    }

    /**
     * Sets the value of the bandType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandTypeType }
     *     
     */
    public void setBandType(BandTypeType value) {
        this.bandType = value;
    }

    /**
     * Gets the value of the basedOnValue property.
     * 
     * @return
     *     possible object is
     *     {@link BasedOnValueType }
     *     
     */
    public BasedOnValueType getBasedOnValue() {
        return basedOnValue;
    }

    /**
     * Sets the value of the basedOnValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BasedOnValueType }
     *     
     */
    public void setBasedOnValue(BasedOnValueType value) {
        this.basedOnValue = value;
    }

    /**
     * Gets the value of the basedOnVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBasedOnVolume() {
        return basedOnVolume;
    }

    /**
     * Sets the value of the basedOnVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBasedOnVolume(Boolean value) {
        this.basedOnVolume = value;
    }

}
