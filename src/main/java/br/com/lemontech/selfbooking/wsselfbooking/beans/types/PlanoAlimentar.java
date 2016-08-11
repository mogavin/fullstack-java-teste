
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de planoAlimentar.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="planoAlimentar">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CAFE_DA_MANHA"/>
 *     &lt;enumeration value="MEIA_PENSAO"/>
 *     &lt;enumeration value="PENSAO_COMPLETA"/>
 *     &lt;enumeration value="JANTAR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "planoAlimentar")
@XmlEnum
public enum PlanoAlimentar {

    CAFE_DA_MANHA,
    MEIA_PENSAO,
    PENSAO_COMPLETA,
    JANTAR;

    public String value() {
        return name();
    }

    public static PlanoAlimentar fromValue(String v) {
        return valueOf(v);
    }

}
