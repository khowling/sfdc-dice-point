
package com.mdsuk.ws.dise3g.order.definition;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.order.dto.service.StockEnquiryType;


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
 *         &lt;element name="QueryData" type="{http://mdsuk.com/ws/dise3g/order/dto/service}StockEnquiryType"/>
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
    "queryData"
})
@XmlRootElement(name = "QueryStock")
public class QueryStock {

    @XmlElement(name = "QueryData", required = true)
    protected StockEnquiryType queryData;

    /**
     * Gets the value of the queryData property.
     * 
     * @return
     *     possible object is
     *     {@link StockEnquiryType }
     *     
     */
    public StockEnquiryType getQueryData() {
        return queryData;
    }

    /**
     * Sets the value of the queryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockEnquiryType }
     *     
     */
    public void setQueryData(StockEnquiryType value) {
        this.queryData = value;
    }

}
