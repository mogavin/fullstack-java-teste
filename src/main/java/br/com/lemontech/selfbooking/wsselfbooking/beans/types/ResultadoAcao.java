
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultadoAcao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="resultadoAcao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCESSO"/>
 *     &lt;enumeration value="ERRO"/>
 *     &lt;enumeration value="ALERTA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "resultadoAcao")
@XmlEnum
public enum ResultadoAcao {

    SUCESSO,
    ERRO,
    ALERTA;

    public String value() {
        return name();
    }

    public static ResultadoAcao fromValue(String v) {
        return valueOf(v);
    }

}
