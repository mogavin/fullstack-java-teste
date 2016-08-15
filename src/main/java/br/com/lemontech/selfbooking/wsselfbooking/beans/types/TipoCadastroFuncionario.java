
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tipoCadastroFuncionario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoCadastroFuncionario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SELF_BOOKING"/>
 *     &lt;enumeration value="FRONT_OFFICE"/>
 *     &lt;enumeration value="FRONT_SELF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoCadastroFuncionario")
@XmlEnum
public enum TipoCadastroFuncionario {

    SELF_BOOKING,
    FRONT_OFFICE,
    FRONT_SELF;

    public String value() {
        return name();
    }

    public static TipoCadastroFuncionario fromValue(String v) {
        return valueOf(v);
    }

}
