
package com.mdsuk.ws.dise3g.subscription.dto.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateManagedSerialNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateManagedSerialNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ManagedSerialNumber" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}UpdateManagedSerialNumberType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateManagedSerialNumbersType", propOrder = {
    "managedSerialNumber"
})
public class UpdateManagedSerialNumbersType {

    @XmlElement(name = "ManagedSerialNumber")
    protected List<UpdateManagedSerialNumberType> managedSerialNumber;

    /**
     * Gets the value of the managedSerialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managedSerialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagedSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateManagedSerialNumberType }
     * 
     * 
     */
    public List<UpdateManagedSerialNumberType> getManagedSerialNumber() {
        if (managedSerialNumber == null) {
            managedSerialNumber = new ArrayList<UpdateManagedSerialNumberType>();
        }
        return this.managedSerialNumber;
    }

}
