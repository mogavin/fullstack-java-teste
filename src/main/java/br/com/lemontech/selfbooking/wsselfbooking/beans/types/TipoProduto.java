
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de tipoProduto.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipoProduto">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AEREO"/>
 *     &lt;enumeration value="HOTEL"/>
 *     &lt;enumeration value="CARRO"/>
 *     &lt;enumeration value="OUTRO"/>
 *     &lt;enumeration value="SEGURO"/>
 *     &lt;enumeration value="TRASLADO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipoProduto")
@XmlEnum
public enum TipoProduto {

    AEREO,
    HOTEL,
    CARRO,
    OUTRO,
    SEGURO,
    TRASLADO;

    public String value() {
        return name();
    }

    public static TipoProduto fromValue(String v) {
        return valueOf(v);
    }

}
