
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoTarifa.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoTarifa">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DIARIA"/>
 *     &lt;enumeration value="FIM_DE_SEMANA"/>
 *     &lt;enumeration value="MENSAL"/>
 *     &lt;enumeration value="PACOTE"/>
 *     &lt;enumeration value="SEMANAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoTarifa")
@XmlEnum
public enum TipoTarifa {

    DIARIA,
    FIM_DE_SEMANA,
    MENSAL,
    PACOTE,
    SEMANAL;

    public String value() {
        return name();
    }

    public static TipoTarifa fromValue(String v) {
        return valueOf(v);
    }

}
