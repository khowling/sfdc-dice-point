
package com.mdsuk.ws.dise3g.subscription.dto.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkSubCodesValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkSubCodesValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NetworkSubCode" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkSubCodeValueType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkSubCodesValueType", propOrder = {
    "networkSubCode"
})
public class NetworkSubCodesValueType {

    @XmlElement(name = "NetworkSubCode")
    protected List<NetworkSubCodeValueType> networkSubCode;

    /**
     * Gets the value of the networkSubCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the networkSubCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNetworkSubCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NetworkSubCodeValueType }
     * 
     * 
     */
    public List<NetworkSubCodeValueType> getNetworkSubCode() {
        if (networkSubCode == null) {
            networkSubCode = new ArrayList<NetworkSubCodeValueType>();
        }
        return this.networkSubCode;
    }

}
