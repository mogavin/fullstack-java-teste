
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de bandeiraCartao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
