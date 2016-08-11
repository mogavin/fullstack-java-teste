
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de garantiaNoShow.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="garantiaNoShow">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="GARANTIA_AGENCIA"/>
 *     &lt;enumeration value="GARANTIA_CARTAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "garantiaNoShow")
@XmlEnum
public enum GarantiaNoShow {

    GARANTIA_AGENCIA,
    GARANTIA_CARTAO;

    public String value() {
        return name();
    }

    public static GarantiaNoShow fromValue(String v) {
        return valueOf(v);
    }

}
