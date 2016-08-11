
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebito;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacao;


/**
 * <p>Classe Java de cadastrarParametrizacaoCentroDeCustoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarParametrizacaoCentroDeCustoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="parametrizacaoCentroDeCustoAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoAprovacao"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="parametrizacaoCentroDeCustoSolicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoSolicitacao"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="parametrizacaoCentroDeCustoDebito" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoDebito"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarParametrizacaoCentroDeCustoRequest", propOrder = {
    "parametrizacaoCentroDeCustoAprovacao",
    "parametrizacaoCentroDeCustoSolicitacao",
    "parametrizacaoCentroDeCustoDebito"
})
public class CadastrarParametrizacaoCentroDeCustoRequest {

    protected ParametrizacaoCentroDeCustoAprovacao parametrizacaoCentroDeCustoAprovacao;
    protected ParametrizacaoCentroDeCustoSolicitacao parametrizacaoCentroDeCustoSolicitacao;
    protected ParametrizacaoCentroDeCustoDebito parametrizacaoCentroDeCustoDebito;

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoAprovacao.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoAprovacao }
     *     
     */
    public ParametrizacaoCentroDeCustoAprovacao getParametrizacaoCentroDeCustoAprovacao() {
        return parametrizacaoCentroDeCustoAprovacao;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoAprovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoAprovacao }
     *     
     */
    public void setParametrizacaoCentroDeCustoAprovacao(ParametrizacaoCentroDeCustoAprovacao value) {
        this.parametrizacaoCentroDeCustoAprovacao = value;
    }

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoSolicitacao }
     *     
     */
    public ParametrizacaoCentroDeCustoSolicitacao getParametrizacaoCentroDeCustoSolicitacao() {
        return parametrizacaoCentroDeCustoSolicitacao;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoSolicitacao }
     *     
     */
    public void setParametrizacaoCentroDeCustoSolicitacao(ParametrizacaoCentroDeCustoSolicitacao value) {
        this.parametrizacaoCentroDeCustoSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade parametrizacaoCentroDeCustoDebito.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoDebito }
     *     
     */
    public ParametrizacaoCentroDeCustoDebito getParametrizacaoCentroDeCustoDebito() {
        return parametrizacaoCentroDeCustoDebito;
    }

    /**
     * Define o valor da propriedade parametrizacaoCentroDeCustoDebito.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoDebito }
     *     
     */
    public void setParametrizacaoCentroDeCustoDebito(ParametrizacaoCentroDeCustoDebito value) {
        this.parametrizacaoCentroDeCustoDebito = value;
    }

}
