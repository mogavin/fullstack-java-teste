
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regime.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regime">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAFE_DA_MANHA"/>
 *     &lt;enumeration value="MEIA_PENSAO"/>
 *     &lt;enumeration value="PENSAO_COMPLETA"/>
 *     &lt;enumeration value="ALL_INCLUSIVE"/>
 *     &lt;enumeration value="SO_HOSPEDAGEM"/>
 *     &lt;enumeration value="JANTAR"/>
 *     &lt;enumeration value="NAO_INCLUI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regime")
@XmlEnum
public enum Regime {

    CAFE_DA_MANHA,
    MEIA_PENSAO,
    PENSAO_COMPLETA,
    ALL_INCLUSIVE,
    SO_HOSPEDAGEM,
    JANTAR,
    NAO_INCLUI;

    public String value() {
        return name();
    }

    public static Regime fromValue(String v) {
        return valueOf(v);
    }

}
