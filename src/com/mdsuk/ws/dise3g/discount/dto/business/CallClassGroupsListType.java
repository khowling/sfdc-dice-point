
package com.mdsuk.ws.dise3g.discount.dto.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CallClassGroupsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CallClassGroupsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CallClassGroup" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}CallClassGroupItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CallClassGroupsListType", propOrder = {
    "callClassGroup"
})
public class CallClassGroupsListType {

    @XmlElement(name = "CallClassGroup", required = true)
    protected List<CallClassGroupItemType> callClassGroup;

    /**
     * Gets the value of the callClassGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callClassGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallClassGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CallClassGroupItemType }
     * 
     * 
     */
    public List<CallClassGroupItemType> getCallClassGroup() {
        if (callClassGroup == null) {
            callClassGroup = new ArrayList<CallClassGroupItemType>();
        }
        return this.callClassGroup;
    }

}
