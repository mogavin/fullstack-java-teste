
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de statusSolicitacao.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="statusSolicitacao">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CONCLUIDA"/>
 *     &lt;enumeration value="CANCELADA"/>
 *     &lt;enumeration value="PENDENTE_APROVACAO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "statusSolicitacao")
@XmlEnum
public enum StatusSolicitacao {

    CONCLUIDA,
    CANCELADA,
    PENDENTE_APROVACAO;

    public String value() {
        return name();
    }

    public static StatusSolicitacao fromValue(String v) {
        return valueOf(v);
    }

}
