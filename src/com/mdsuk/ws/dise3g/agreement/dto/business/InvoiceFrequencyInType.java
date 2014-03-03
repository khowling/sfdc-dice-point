
package com.mdsuk.ws.dise3g.agreement.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceFrequencyInType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvoiceFrequencyInType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DAYS"/>
 *     &lt;enumeration value="MONTHS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvoiceFrequencyInType")
@XmlEnum
public enum InvoiceFrequencyInType {

    DAYS,
    MONTHS;

    public String value() {
        return name();
    }

    public static InvoiceFrequencyInType fromValue(String v) {
        return valueOf(v);
    }

}
