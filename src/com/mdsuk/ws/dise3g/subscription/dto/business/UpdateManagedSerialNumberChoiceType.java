
package com.mdsuk.ws.dise3g.subscription.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateManagedSerialNumberChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateManagedSerialNumberChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Value" type="{http://mdsuk.com/ws/dise3g/base}NetworkSerialNumberType" minOccurs="0"/>
 *         &lt;element name="AutoSelect" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}AutoSelectType" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateManagedSerialNumberChoiceType", propOrder = {
    "value",
    "autoSelect"
})
public class UpdateManagedSerialNumberChoiceType {

    @XmlElement(name = "Value")
    protected String value;
    @XmlElement(name = "AutoSelect")
    protected String autoSelect;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the autoSelect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutoSelect() {
        return autoSelect;
    }

    /**
     * Sets the value of the autoSelect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutoSelect(String value) {
        this.autoSelect = value;
    }

}
