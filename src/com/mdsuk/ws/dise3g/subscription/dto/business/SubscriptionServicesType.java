
package com.mdsuk.ws.dise3g.subscription.dto.business;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This structure is returned as part of the some Query responses
 *                 when SERVICES dataset is specified
 * 
 * <p>Java class for SubscriptionServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubscriptionServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionService" type="{http://mdsuk.com/ws/dise3g/subscription/dto/business}SubscriptionServiceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubscriptionServicesType", propOrder = {
    "subscriptionService"
})
public class SubscriptionServicesType {

    @XmlElement(name = "SubscriptionService", required = true)
    protected List<SubscriptionServiceType> subscriptionService;

    /**
     * Gets the value of the subscriptionService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubscriptionServiceType }
     * 
     * 
     */
    public List<SubscriptionServiceType> getSubscriptionService() {
        if (subscriptionService == null) {
            subscriptionService = new ArrayList<SubscriptionServiceType>();
        }
        return this.subscriptionService;
    }

}
