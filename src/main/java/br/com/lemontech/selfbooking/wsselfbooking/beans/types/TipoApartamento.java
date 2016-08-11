
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoApartamento.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoApartamento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INDIVIDUAL"/>
 *     &lt;enumeration value="DUPLO"/>
 *     &lt;enumeration value="TRIPO"/>
 *     &lt;enumeration value="QUADRUPLO"/>
 *     &lt;enumeration value="TWIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoApartamento")
@XmlEnum
public enum TipoApartamento {

    INDIVIDUAL,
    DUPLO,
    TRIPO,
    QUADRUPLO,
    TWIN;

    public String value() {
        return name();
    }

    public static TipoApartamento fromValue(String v) {
        return valueOf(v);
    }

}
