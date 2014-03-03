
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonManagedSerialNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonManagedSerialNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnumerationId" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NonManagedSerialNumberIDType"/>
 *         &lt;element name="NonManagedSerialNumber" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonManagedSerialNumberType", propOrder = {
    "enumerationId",
    "nonManagedSerialNumber"
})
@XmlSeeAlso({
    NonManagedSerialNumberResponseType.class
})
public class NonManagedSerialNumberType {

    @XmlElement(name = "EnumerationId")
    protected int enumerationId;
    @XmlElement(name = "NonManagedSerialNumber", required = true)
    protected String nonManagedSerialNumber;

    /**
     * Gets the value of the enumerationId property.
     * 
     */
    public int getEnumerationId() {
        return enumerationId;
    }

    /**
     * Sets the value of the enumerationId property.
     * 
     */
    public void setEnumerationId(int value) {
        this.enumerationId = value;
    }

    /**
     * Gets the value of the nonManagedSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonManagedSerialNumber() {
        return nonManagedSerialNumber;
    }

    /**
     * Sets the value of the nonManagedSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonManagedSerialNumber(String value) {
        this.nonManagedSerialNumber = value;
    }

}
