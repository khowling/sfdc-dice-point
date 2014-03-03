
package com.mdsuk.ws.dise3g.discount.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BandTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BandTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bands"/>
 *     &lt;enumeration value="Total"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BandTypeType")
@XmlEnum
public enum BandTypeType {

    @XmlEnumValue("Bands")
    BANDS("Bands"),
    @XmlEnumValue("Total")
    TOTAL("Total");
    private final String value;

    BandTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BandTypeType fromValue(String v) {
        for (BandTypeType c: BandTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
