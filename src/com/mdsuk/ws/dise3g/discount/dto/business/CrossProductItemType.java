
package com.mdsuk.ws.dise3g.discount.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossProductItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CrossProductItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SequenceNumber" type="{http://mdsuk.com/ws/dise3g/base}ThreeDigitNumberType"/>
 *         &lt;element name="AndOrOperator" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}AndOrOperatorType"/>
 *         &lt;element name="NetworkOrTariff" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}NetworkOrTariffType"/>
 *         &lt;element name="MinimumConnections" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}NumberOfConnectionsType" minOccurs="0"/>
 *         &lt;element name="MaximumConnections" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}NumberOfConnectionsType" minOccurs="0"/>
 *         &lt;element name="Level" type="{http://mdsuk.com/ws/dise3g/discount/dto/business}CrossProductLevelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CrossProductItemType", propOrder = {
    "sequenceNumber",
    "andOrOperator",
    "networkOrTariff",
    "minimumConnections",
    "maximumConnections",
    "level"
})
public class CrossProductItemType {

    @XmlElement(name = "SequenceNumber")
    protected int sequenceNumber;
    @XmlElement(name = "AndOrOperator", required = true)
    protected AndOrOperatorType andOrOperator;
    @XmlElement(name = "NetworkOrTariff", required = true)
    protected NetworkOrTariffType networkOrTariff;
    @XmlElement(name = "MinimumConnections")
    protected Integer minimumConnections;
    @XmlElement(name = "MaximumConnections")
    protected Integer maximumConnections;
    @XmlElement(name = "Level", required = true)
    protected CrossProductLevelType level;

    /**
     * Gets the value of the sequenceNumber property.
     * 
     */
    public int getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(int value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the andOrOperator property.
     * 
     * @return
     *     possible object is
     *     {@link AndOrOperatorType }
     *     
     */
    public AndOrOperatorType getAndOrOperator() {
        return andOrOperator;
    }

    /**
     * Sets the value of the andOrOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndOrOperatorType }
     *     
     */
    public void setAndOrOperator(AndOrOperatorType value) {
        this.andOrOperator = value;
    }

    /**
     * Gets the value of the networkOrTariff property.
     * 
     * @return
     *     possible object is
     *     {@link NetworkOrTariffType }
     *     
     */
    public NetworkOrTariffType getNetworkOrTariff() {
        return networkOrTariff;
    }

    /**
     * Sets the value of the networkOrTariff property.
     * 
     * @param value
     *     allowed object is
     *     {@link NetworkOrTariffType }
     *     
     */
    public void setNetworkOrTariff(NetworkOrTariffType value) {
        this.networkOrTariff = value;
    }

    /**
     * Gets the value of the minimumConnections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinimumConnections() {
        return minimumConnections;
    }

    /**
     * Sets the value of the minimumConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinimumConnections(Integer value) {
        this.minimumConnections = value;
    }

    /**
     * Gets the value of the maximumConnections property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaximumConnections() {
        return maximumConnections;
    }

    /**
     * Sets the value of the maximumConnections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaximumConnections(Integer value) {
        this.maximumConnections = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link CrossProductLevelType }
     *     
     */
    public CrossProductLevelType getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link CrossProductLevelType }
     *     
     */
    public void setLevel(CrossProductLevelType value) {
        this.level = value;
    }

}
