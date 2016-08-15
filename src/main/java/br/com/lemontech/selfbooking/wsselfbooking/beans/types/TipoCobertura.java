
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCobertura.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoCobertura">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COBERTURA"/>
 *     &lt;enumeration value="ASSISTENCIA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoCobertura")
@XmlEnum
public enum TipoCobertura {

    COBERTURA,
    ASSISTENCIA;

    public String value() {
        return name();
    }

    public static TipoCobertura fromValue(String v) {
        return valueOf(v);
    }

}
