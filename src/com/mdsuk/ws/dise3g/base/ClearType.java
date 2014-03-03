
package com.mdsuk.ws.dise3g.base;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ClearType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLEAR_FIELD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClearType")
@XmlEnum
public enum ClearType {

    CLEAR_FIELD;

    public String value() {
        return name();
    }

    public static ClearType fromValue(String v) {
        return valueOf(v);
    }

}
