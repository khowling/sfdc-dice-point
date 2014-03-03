
package com.mdsuk.ws.dise3g.order.dto.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.order.dto.business.QueryOrderDatasetsType;


/**
 * <p>Java class for QueryOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExternalReference" type="{http://mdsuk.com/ws/dise3g/base}ExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="OrderNumber" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderNumberType"/>
 *         &lt;element name="QueryOrderDatasets" type="{http://mdsuk.com/ws/dise3g/order/dto/business}QueryOrderDatasetsType"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOrderType", propOrder = {

})
public class QueryOrderType {

    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "OrderNumber", required = true)
    protected String orderNumber;
    @XmlElement(name = "QueryOrderDatasets", required = true)
    protected QueryOrderDatasetsType queryOrderDatasets;

    /**
     * Gets the value of the externalReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalReference() {
        return externalReference;
    }

    /**
     * Sets the value of the externalReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalReference(String value) {
        this.externalReference = value;
    }

    /**
     * Gets the value of the orderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * Sets the value of the orderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNumber(String value) {
        this.orderNumber = value;
    }

    /**
     * Gets the value of the queryOrderDatasets property.
     * 
     * @return
     *     possible object is
     *     {@link QueryOrderDatasetsType }
     *     
     */
    public QueryOrderDatasetsType getQueryOrderDatasets() {
        return queryOrderDatasets;
    }

    /**
     * Sets the value of the queryOrderDatasets property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryOrderDatasetsType }
     *     
     */
    public void setQueryOrderDatasets(QueryOrderDatasetsType value) {
        this.queryOrderDatasets = value;
    }

}
