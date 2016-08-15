
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for perfilHospedagem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="perfilHospedagem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SIMPLES"/>
 *     &lt;enumeration value="MEDIO_CONFORTO"/>
 *     &lt;enumeration value="CONFORTAVEL"/>
 *     &lt;enumeration value="MUITO_CONFORTAVEL"/>
 *     &lt;enumeration value="LUXO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "perfilHospedagem")
@XmlEnum
public enum PerfilHospedagem {

    SIMPLES,
    MEDIO_CONFORTO,
    CONFORTAVEL,
    MUITO_CONFORTAVEL,
    LUXO;

    public String value() {
        return name();
    }

    public static PerfilHospedagem fromValue(String v) {
        return valueOf(v);
    }

}
