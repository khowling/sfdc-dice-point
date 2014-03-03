
package com.mdsuk.ws.dise3g.discount.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CrossProductLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CrossProductLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Account"/>
 *     &lt;enumeration value="Agreement"/>
 *     &lt;enumeration value="Corporate"/>
 *     &lt;enumeration value="Group"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CrossProductLevelType")
@XmlEnum
public enum CrossProductLevelType {

    @XmlEnumValue("Account")
    ACCOUNT("Account"),
    @XmlEnumValue("Agreement")
    AGREEMENT("Agreement"),
    @XmlEnumValue("Corporate")
    CORPORATE("Corporate"),
    @XmlEnumValue("Group")
    GROUP("Group");
    private final String value;

    CrossProductLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CrossProductLevelType fromValue(String v) {
        for (CrossProductLevelType c: CrossProductLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
