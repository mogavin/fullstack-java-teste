
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bandeiraCartao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bandeiraCartao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="VISA"/>
 *     &lt;enumeration value="MASTERCARD"/>
 *     &lt;enumeration value="AMEX"/>
 *     &lt;enumeration value="HIPER_CARD"/>
 *     &lt;enumeration value="DINERS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bandeiraCartao")
@XmlEnum
public enum BandeiraCartao {

    VISA,
    MASTERCARD,
    AMEX,
    HIPER_CARD,
    DINERS;

    public String value() {
        return name();
    }

    public static BandeiraCartao fromValue(String v) {
        return valueOf(v);
    }

}
