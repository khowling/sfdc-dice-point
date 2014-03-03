
package com.mdsuk.ws.dise3g.order.definition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.order.dto.service.UpdateOrderStatusType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UpdateData" type="{http://mdsuk.com/ws/dise3g/order/dto/service}UpdateOrderStatusType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "updateData"
})
@XmlRootElement(name = "UpdateOrderStatus")
public class UpdateOrderStatus {

    @XmlElement(name = "UpdateData", required = true)
    protected UpdateOrderStatusType updateData;

    /**
     * Gets the value of the updateData property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderStatusType }
     *     
     */
    public UpdateOrderStatusType getUpdateData() {
        return updateData;
    }

    /**
     * Sets the value of the updateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderStatusType }
     *     
     */
    public void setUpdateData(UpdateOrderStatusType value) {
        this.updateData = value;
    }

}
