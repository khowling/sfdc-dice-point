
package com.mdsuk.ws.dise3g.order.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubsOrderType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubsOrderType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NewConnection"/>
 *     &lt;enumeration value="OrderOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubsOrderType")
@XmlEnum
public enum SubsOrderType {

    @XmlEnumValue("NewConnection")
    NEW_CONNECTION("NewConnection"),
    @XmlEnumValue("OrderOnly")
    ORDER_ONLY("OrderOnly");
    private final String value;

    SubsOrderType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubsOrderType fromValue(String v) {
        for (SubsOrderType c: SubsOrderType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
