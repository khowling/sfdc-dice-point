
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for QueryCostCentreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCostCentreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="CostCentreCode" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}CostCenterCodeType"/>
 *         &lt;element name="CostCentreDescription" type="{http://mdsuk.com/ws/dise3g/base}StringMaxLength30Type"/>
 *         &lt;element name="LastAmendedDate" type="{http://mdsuk.com/ws/dise3g/base}LastAmendedDateType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCostCentreType", propOrder = {

})
public class QueryCostCentreType {

    @XmlElement(name = "CostCentreCode", required = true)
    protected String costCentreCode;
    @XmlElement(name = "CostCentreDescription", required = true)
    protected String costCentreDescription;
    @XmlElement(name = "LastAmendedDate")
    protected XMLGregorianCalendar lastAmendedDate;

    /**
     * Gets the value of the costCentreCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCentreCode() {
        return costCentreCode;
    }

    /**
     * Sets the value of the costCentreCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCentreCode(String value) {
        this.costCentreCode = value;
    }

    /**
     * Gets the value of the costCentreDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCentreDescription() {
        return costCentreDescription;
    }

    /**
     * Sets the value of the costCentreDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCentreDescription(String value) {
        this.costCentreDescription = value;
    }

    /**
     * Gets the value of the lastAmendedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAmendedDate() {
        return lastAmendedDate;
    }

    /**
     * Sets the value of the lastAmendedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAmendedDate(XMLGregorianCalendar value) {
        this.lastAmendedDate = value;
    }

}
