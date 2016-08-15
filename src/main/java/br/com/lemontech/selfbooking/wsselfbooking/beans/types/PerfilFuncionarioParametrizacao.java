
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for perfilFuncionarioParametrizacao.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="perfilFuncionarioParametrizacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="APROVADOR"/>
 *     &lt;enumeration value="SOLICITANTE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "perfilFuncionarioParametrizacao")
@XmlEnum
public enum PerfilFuncionarioParametrizacao {

    APROVADOR,
    SOLICITANTE;

    public String value() {
        return name();
    }

    public static PerfilFuncionarioParametrizacao fromValue(String v) {
        return valueOf(v);
    }

}
