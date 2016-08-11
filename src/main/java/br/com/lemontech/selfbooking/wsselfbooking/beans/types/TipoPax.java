
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoPax.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoPax">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ADT"/>
 *     &lt;enumeration value="CHD"/>
 *     &lt;enumeration value="INF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoPax")
@XmlEnum
public enum TipoPax {

    ADT,
    CHD,
    INF;

    public String value() {
        return name();
    }

    public static TipoPax fromValue(String v) {
        return valueOf(v);
    }

}
