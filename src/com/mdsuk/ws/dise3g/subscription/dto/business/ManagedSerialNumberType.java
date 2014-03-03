
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedSerialNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedSerialNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnumerationId" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkSerialNumberIDType"/>
 *         &lt;element name="NetworkSerialNumber" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedSerialNumberType", propOrder = {
    "enumerationId",
    "networkSerialNumber"
})
@XmlSeeAlso({
    ManagedSerialNumberResponseType.class
})
public class ManagedSerialNumberType {

    @XmlElement(name = "EnumerationId")
    protected int enumerationId;
    @XmlElement(name = "NetworkSerialNumber", required = true)
    protected String networkSerialNumber;

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
     * Gets the value of the networkSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkSerialNumber() {
        return networkSerialNumber;
    }

    /**
     * Sets the value of the networkSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkSerialNumber(String value) {
        this.networkSerialNumber = value;
    }

}
