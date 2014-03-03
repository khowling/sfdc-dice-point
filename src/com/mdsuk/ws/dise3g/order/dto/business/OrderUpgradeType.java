
package com.mdsuk.ws.dise3g.order.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderUpgradeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderUpgradeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Generate"/>
 *     &lt;enumeration value="Save"/>
 *     &lt;enumeration value="Cancel"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OrderUpgradeType")
@XmlEnum
public enum OrderUpgradeType {

    @XmlEnumValue("Generate")
    GENERATE("Generate"),
    @XmlEnumValue("Save")
    SAVE("Save"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel");
    private final String value;

    OrderUpgradeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderUpgradeType fromValue(String v) {
        for (OrderUpgradeType c: OrderUpgradeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
