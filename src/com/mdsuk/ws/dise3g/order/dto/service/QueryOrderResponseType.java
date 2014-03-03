
package com.mdsuk.ws.dise3g.order.dto.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.mdsuk.ws.dise3g.order.dto.business.OrderBasicType;
import com.mdsuk.ws.dise3g.order.dto.business.ProductsType;
import com.mdsuk.ws.dise3g.order.dto.business.SalesType;
import com.mdsuk.ws.dise3g.order.dto.business.SubscriptionsType;


/**
 * <p>Java class for QueryOrderResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryOrderResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ExternalReference" type="{http://mdsuk.com/ws/dise3g/base}ExternalReferenceType" minOccurs="0"/>
 *         &lt;element name="OrderBasic" type="{http://mdsuk.com/ws/dise3g/order/dto/business}OrderBasicType" minOccurs="0"/>
 *         &lt;element name="Sales" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SalesType" minOccurs="0"/>
 *         &lt;element name="Subscriptions" type="{http://mdsuk.com/ws/dise3g/order/dto/business}SubscriptionsType" minOccurs="0"/>
 *         &lt;element name="Products" type="{http://mdsuk.com/ws/dise3g/order/dto/business}ProductsType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryOrderResponseType", propOrder = {

})
public class QueryOrderResponseType {

    @XmlElement(name = "ExternalReference")
    protected String externalReference;
    @XmlElement(name = "OrderBasic")
    protected OrderBasicType orderBasic;
    @XmlElement(name = "Sales")
    protected SalesType sales;
    @XmlElement(name = "Subscriptions")
    protected SubscriptionsType subscriptions;
    @XmlElement(name = "Products")
    protected ProductsType products;

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
     * Gets the value of the orderBasic property.
     * 
     * @return
     *     possible object is
     *     {@link OrderBasicType }
     *     
     */
    public OrderBasicType getOrderBasic() {
        return orderBasic;
    }

    /**
     * Sets the value of the orderBasic property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderBasicType }
     *     
     */
    public void setOrderBasic(OrderBasicType value) {
        this.orderBasic = value;
    }

    /**
     * Gets the value of the sales property.
     * 
     * @return
     *     possible object is
     *     {@link SalesType }
     *     
     */
    public SalesType getSales() {
        return sales;
    }

    /**
     * Sets the value of the sales property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesType }
     *     
     */
    public void setSales(SalesType value) {
        this.sales = value;
    }

    /**
     * Gets the value of the subscriptions property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionsType }
     *     
     */
    public SubscriptionsType getSubscriptions() {
        return subscriptions;
    }

    /**
     * Sets the value of the subscriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionsType }
     *     
     */
    public void setSubscriptions(SubscriptionsType value) {
        this.subscriptions = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsType }
     *     
     */
    public ProductsType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsType }
     *     
     */
    public void setProducts(ProductsType value) {
        this.products = value;
    }

}
