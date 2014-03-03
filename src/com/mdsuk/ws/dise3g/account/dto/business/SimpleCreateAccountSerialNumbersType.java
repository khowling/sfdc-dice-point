
package com.mdsuk.ws.dise3g.account.dto.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SimpleCreateAccountSerialNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleCreateAccountSerialNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountSerialNumber" type="{http://mdsuk.com/ws/dise3g/account/dto/business}SimpleCreateAccountSerialNumberType" maxOccurs="999"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleCreateAccountSerialNumbersType", propOrder = {
    "accountSerialNumber"
})
public class SimpleCreateAccountSerialNumbersType {

    @XmlElement(name = "AccountSerialNumber", required = true)
    protected List<SimpleCreateAccountSerialNumberType> accountSerialNumber;

    /**
     * Gets the value of the accountSerialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountSerialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimpleCreateAccountSerialNumberType }
     * 
     * 
     */
    public List<SimpleCreateAccountSerialNumberType> getAccountSerialNumber() {
        if (accountSerialNumber == null) {
            accountSerialNumber = new ArrayList<SimpleCreateAccountSerialNumberType>();
        }
        return this.accountSerialNumber;
    }

}
