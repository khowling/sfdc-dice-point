
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This structure is returned as part of the Subscription Query response
 *                 when SERIALNUMBERS dataset is specified
 * 
 * <p>Java class for SerialNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SerialNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SerialNumbers" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}ManagedSerialNumbersResponseType" minOccurs="0"/>
 *         &lt;element name="NonManagedSerialNumbers" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NonManagedSerialNumbersResponseType" minOccurs="0"/>
 *         &lt;element name="NetworkSubCodes" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkSubCodesResponseType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SerialNumbersType", propOrder = {

})
public class SerialNumbersType {

    @XmlElement(name = "SerialNumbers")
    protected ManagedSerialNumbersResponseType serialNumbers;
    @XmlElement(name = "NonManagedSerialNumbers")
    protected NonManagedSerialNumbersResponseType nonManagedSerialNumbers;
    @XmlElement(name = "NetworkSubCodes")
    protected NetworkSubCodesResponseType networkSubCodes;

    /**
     * Gets the value of the serialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link ManagedSerialNumbersResponseType }
     *     
     */
    public ManagedSerialNumbersResponseType getSerialNumbers() {
        return serialNumbers;
    }

    /**
     * Sets the value of the serialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManagedSerialNumbersResponseType }
     *     
     */
    public void setSerialNumbers(ManagedSerialNumbersResponseType value) {
        this.serialNumbers = value;
    }

    /**
     * Gets the value of the nonManagedSerialNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link NonManagedSerialNumbersResponseType }
     *     
     */
    public NonManagedSerialNumbersResponseType getNonManagedSerialNumbers() {
        return nonManagedSerialNumbers;
    }

    /**
     * Sets the value of the nonManagedSerialNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonManagedSerialNumbersResponseType }
     *     
     */
    public void setNonManagedSerialNumbers(NonManagedSerialNumbersResponseType value) {
        this.nonManagedSerialNumbers = value;
    }

    /**
     * Gets the value of the networkSubCodes property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkSubCodesResponseType }
     *     
     */
    public NetworkSubCodesResponseType getNetworkSubCodes() {
        return networkSubCodes;
    }

    /**
     * Sets the value of the networkSubCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkSubCodesResponseType }
     *     
     */
    public void setNetworkSubCodes(NetworkSubCodesResponseType value) {
        this.networkSubCodes = value;
    }

}
