
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for perfilAereo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="perfilAereo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ECONOMICA"/>
 *     &lt;enumeration value="EXECUTIVA"/>
 *     &lt;enumeration value="PRIMEIRA_CLASSE"/>
 *     &lt;enumeration value="ECONOMICA_PLUS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "perfilAereo")
@XmlEnum
public enum PerfilAereo {

    ECONOMICA,
    EXECUTIVA,
    PRIMEIRA_CLASSE,
    ECONOMICA_PLUS;

    public String value() {
        return name();
    }

    public static PerfilAereo fromValue(String v) {
        return valueOf(v);
    }

}
