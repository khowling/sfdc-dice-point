
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkSubCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkSubCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EnumerationId" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkCodeIDType"/>
 *         &lt;element name="NetworkSubCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkSubCodeBase"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSubCodeType", propOrder = {
    "enumerationId",
    "networkSubCode"
})
@XmlSeeAlso({
    NetworkSubCodeResponseType.class
})
public class NetworkSubCodeType {

    @XmlElement(name = "EnumerationId")
    protected int enumerationId;
    @XmlElement(name = "NetworkSubCode", required = true)
    protected String networkSubCode;

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
     * Gets the value of the networkSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkSubCode() {
        return networkSubCode;
    }

    /**
     * Sets the value of the networkSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkSubCode(String value) {
        this.networkSubCode = value;
    }

}
