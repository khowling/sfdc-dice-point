
package com.mdsuk.ws.dise3g.address.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaritalStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaritalStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Married"/>
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Widowed"/>
 *     &lt;enumeration value="Divorced"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Separated"/>
 *     &lt;enumeration value="BLANK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaritalStatusType")
@XmlEnum
public enum MaritalStatusType {

    @XmlEnumValue("Married")
    MARRIED("Married"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Widowed")
    WIDOWED("Widowed"),
    @XmlEnumValue("Divorced")
    DIVORCED("Divorced"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Separated")
    SEPARATED("Separated"),
    BLANK("BLANK");
    private final String value;

    MaritalStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaritalStatusType fromValue(String v) {
        for (MaritalStatusType c: MaritalStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
