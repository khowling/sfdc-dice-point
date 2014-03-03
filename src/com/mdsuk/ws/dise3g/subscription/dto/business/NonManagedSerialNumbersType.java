
package com.mdsuk.ws.dise3g.subscription.dto.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonManagedSerialNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonManagedSerialNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NonManagedSerialNumber" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}NonManagedSerialNumberType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonManagedSerialNumbersType", propOrder = {
    "nonManagedSerialNumber"
})
public class NonManagedSerialNumbersType {

    @XmlElement(name = "NonManagedSerialNumber")
    protected List<NonManagedSerialNumberType> nonManagedSerialNumber;

    /**
     * Gets the value of the nonManagedSerialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nonManagedSerialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNonManagedSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NonManagedSerialNumberType }
     * 
     * 
     */
    public List<NonManagedSerialNumberType> getNonManagedSerialNumber() {
        if (nonManagedSerialNumber == null) {
            nonManagedSerialNumber = new ArrayList<NonManagedSerialNumberType>();
        }
        return this.nonManagedSerialNumber;
    }

}
