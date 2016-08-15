
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for itenFaturamento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="itenFaturamento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ALIMENTOS_BEBIDAS_NAO_ALCOOLICAS"/>
 *     &lt;enumeration value="CAFE_DA_MANHA"/>
 *     &lt;enumeration value="DIARIAS"/>
 *     &lt;enumeration value="LAVANDERIA"/>
 *     &lt;enumeration value="LIGACOES_TELEFONICAS"/>
 *     &lt;enumeration value="TAXAS"/>
 *     &lt;enumeration value="TODAS_DESPESAS_EXCETO_BEBIDAS"/>
 *     &lt;enumeration value="TODAS_DESPESA"/>
 *     &lt;enumeration value="TAXA_TURISMO"/>
 *     &lt;enumeration value="AGUA"/>
 *     &lt;enumeration value="ESTACIONAMENTO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "itenFaturamento")
@XmlEnum
public enum ItenFaturamento {

    ALIMENTOS_BEBIDAS_NAO_ALCOOLICAS,
    CAFE_DA_MANHA,
    DIARIAS,
    LAVANDERIA,
    LIGACOES_TELEFONICAS,
    TAXAS,
    TODAS_DESPESAS_EXCETO_BEBIDAS,
    TODAS_DESPESA,
    TAXA_TURISMO,
    AGUA,
    ESTACIONAMENTO;

    public String value() {
        return name();
    }

    public static ItenFaturamento fromValue(String v) {
        return valueOf(v);
    }

}
