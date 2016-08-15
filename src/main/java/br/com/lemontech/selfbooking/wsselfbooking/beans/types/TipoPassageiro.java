
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoPassageiro.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoPassageiro">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TODOS"/>
 *     &lt;enumeration value="PASSAGEIRO"/>
 *     &lt;enumeration value="TERCEIRO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoPassageiro")
@XmlEnum
public enum TipoPassageiro {

    TODOS,
    PASSAGEIRO,
    TERCEIRO;

    public String value() {
        return name();
    }

    public static TipoPassageiro fromValue(String v) {
        return valueOf(v);
    }

}
