
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoCadastroFuncionario.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
