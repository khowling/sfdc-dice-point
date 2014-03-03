
package com.mdsuk.ws.dise3g.account.dto.business;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreditControlStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditControlStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="On Procedure"/>
 *     &lt;enumeration value="Ignored"/>
 *     &lt;enumeration value="Ignored Until"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditControlStatusType")
@XmlEnum
public enum CreditControlStatusType {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("On Procedure")
    ON_PROCEDURE("On Procedure"),
    @XmlEnumValue("Ignored")
    IGNORED("Ignored"),
    @XmlEnumValue("Ignored Until")
    IGNORED_UNTIL("Ignored Until");
    private final String value;

    CreditControlStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditControlStatusType fromValue(String v) {
        for (CreditControlStatusType c: CreditControlStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
