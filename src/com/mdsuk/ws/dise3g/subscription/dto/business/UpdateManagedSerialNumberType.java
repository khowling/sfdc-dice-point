
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateManagedSerialNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateManagedSerialNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NetworkSerialNumberIDType"/>
 *         &lt;element name="SerialNumber" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}UpdateManagedSerialNumberChoiceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateManagedSerialNumberType", propOrder = {
    "id",
    "serialNumber"
})
public class UpdateManagedSerialNumberType {

    @XmlElement(name = "Id")
    protected int id;
    @XmlElement(name = "SerialNumber", required = true)
    protected UpdateManagedSerialNumberChoiceType serialNumber;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateManagedSerialNumberChoiceType }
     *     
     */
    public UpdateManagedSerialNumberChoiceType getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateManagedSerialNumberChoiceType }
     *     
     */
    public void setSerialNumber(UpdateManagedSerialNumberChoiceType value) {
        this.serialNumber = value;
    }

}
