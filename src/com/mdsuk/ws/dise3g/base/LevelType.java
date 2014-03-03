
package com.mdsuk.ws.dise3g.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Group"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Subscription"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LevelType")
@XmlEnum
public enum LevelType {

    @XmlEnumValue("Group")
    GROUP("Group"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Subscription")
    SUBSCRIPTION("Subscription");
    private final String value;

    LevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LevelType fromValue(String v) {
        for (LevelType c: LevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
