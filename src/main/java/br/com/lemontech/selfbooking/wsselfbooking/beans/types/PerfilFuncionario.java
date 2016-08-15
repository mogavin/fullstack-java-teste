
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for perfilFuncionario.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="perfilFuncionario">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GESTOR"/>
 *     &lt;enumeration value="APROVADOR"/>
 *     &lt;enumeration value="SOLICITANTE"/>
 *     &lt;enumeration value="PASSAGEIRO"/>
 *     &lt;enumeration value="APROVADOR_MASTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "perfilFuncionario")
@XmlEnum
public enum PerfilFuncionario {

    GESTOR,
    APROVADOR,
    SOLICITANTE,
    PASSAGEIRO,
    APROVADOR_MASTER;

    public String value() {
        return name();
    }

    public static PerfilFuncionario fromValue(String v) {
        return valueOf(v);
    }

}
