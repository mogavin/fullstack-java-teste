
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de formaPagamentoHotelConfig.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="formaPagamentoHotelConfig">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FATURADO"/>
 *     &lt;enumeration value="CARTAO"/>
 *     &lt;enumeration value="DIRETO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "formaPagamentoHotelConfig")
@XmlEnum
public enum FormaPagamentoHotelConfig {

    FATURADO,
    CARTAO,
    DIRETO;

    public String value() {
        return name();
    }

    public static FormaPagamentoHotelConfig fromValue(String v) {
        return valueOf(v);
    }

}
