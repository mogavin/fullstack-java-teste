
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoColetaMulta.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoColetaMulta">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DOCUMENTO"/>
 *     &lt;enumeration value="TAXA"/>
 *     &lt;enumeration value="TOTAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoColetaMulta")
@XmlEnum
public enum TipoColetaMulta {

    DOCUMENTO,
    TAXA,
    TOTAL;

    public String value() {
        return name();
    }

    public static TipoColetaMulta fromValue(String v) {
        return valueOf(v);
    }

}
