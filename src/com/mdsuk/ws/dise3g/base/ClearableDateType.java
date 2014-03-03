
package com.mdsuk.ws.dise3g.base;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ClearableDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearableDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Clear" type="{http://mdsuk.com/ws/dise3g/base}ClearType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearableDateType", propOrder = {
    "value",
    "clear"
})
public class ClearableDateType {

    @XmlElement(name = "Value")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar value;
    @XmlElement(name = "Clear")
    protected ClearType clear;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValue(XMLGregorianCalendar value) {
        this.value = value;
    }

    /**
     * Gets the value of the clear property.
     * 
     * @return
     *     possible object is
     *     {@link ClearType }
     *     
     */
    public ClearType getClear() {
        return clear;
    }

    /**
     * Sets the value of the clear property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearType }
     *     
     */
    public void setClear(ClearType value) {
        this.clear = value;
    }

}
