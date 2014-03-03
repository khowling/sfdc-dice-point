
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TariffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="ATEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Company" type="{http://mdsuk.com/ws/dise3g/base}CompanyCodeType" minOccurs="0"/>
 *         &lt;element name="TariffCode" type="{http://mdsuk.com/ws/dise3g/agreement/dto/business}TariffCodeType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffType", propOrder = {

})
public class TariffType {

    @XmlElement(name = "ATEffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar atEffectiveDate;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "TariffCode")
    protected String tariffCode;

    /**
     * Gets the value of the atEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getATEffectiveDate() {
        return atEffectiveDate;
    }

    /**
     * Sets the value of the atEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setATEffectiveDate(XMLGregorianCalendar value) {
        this.atEffectiveDate = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the tariffCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffCode() {
        return tariffCode;
    }

    /**
     * Sets the value of the tariffCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffCode(String value) {
        this.tariffCode = value;
    }

}
