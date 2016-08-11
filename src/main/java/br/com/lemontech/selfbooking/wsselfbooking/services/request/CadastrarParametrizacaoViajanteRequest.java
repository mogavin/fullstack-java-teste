
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacao;


/**
 * <p>Classe Java de cadastrarParametrizacaoViajanteRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarParametrizacaoViajanteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametrizacaoViajanteAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacao"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarParametrizacaoViajanteRequest", propOrder = {
    "parametrizacaoViajanteAprovacao"
})
public class CadastrarParametrizacaoViajanteRequest {

    @XmlElement(required = true)
    protected ParametrizacaoViajanteAprovacao parametrizacaoViajanteAprovacao;

    /**
     * Obtém o valor da propriedade parametrizacaoViajanteAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoViajanteAprovacao }
     *     
     */
    public ParametrizacaoViajanteAprovacao getParametrizacaoViajanteAprovacao() {
        return parametrizacaoViajanteAprovacao;
    }

    /**
     * Define o valor da propriedade parametrizacaoViajanteAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoViajanteAprovacao }
     *     
     */
    public void setParametrizacaoViajanteAprovacao(ParametrizacaoViajanteAprovacao value) {
        this.parametrizacaoViajanteAprovacao = value;
    }

}
