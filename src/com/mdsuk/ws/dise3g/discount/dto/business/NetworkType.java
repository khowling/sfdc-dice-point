
package com.mdsuk.ws.dise3g.discount.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkCode" type="{http://mdsuk.com/ws/dise3g/base}NetworkCodeType"/>
 *         &lt;element name="NetworkTypeCode" type="{http://mdsuk.com/ws/dise3g/base}NetworkCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkType", propOrder = {
    "networkCode",
    "networkTypeCode"
})
public class NetworkType {

    @XmlElement(name = "NetworkCode", required = true)
    protected String networkCode;
    @XmlElement(name = "NetworkTypeCode")
    protected String networkTypeCode;

    /**
     * Gets the value of the networkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkCode() {
        return networkCode;
    }

    /**
     * Sets the value of the networkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkCode(String value) {
        this.networkCode = value;
    }

    /**
     * Gets the value of the networkTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkTypeCode() {
        return networkTypeCode;
    }

    /**
     * Sets the value of the networkTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkTypeCode(String value) {
        this.networkTypeCode = value;
    }

}
