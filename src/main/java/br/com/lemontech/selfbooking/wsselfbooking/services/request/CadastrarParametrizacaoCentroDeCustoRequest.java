
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebito;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacao;


/**
 * <p>Java class for cadastrarParametrizacaoCentroDeCustoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the parametrizacaoCentroDeCustoAprovacao property.
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
     * Sets the value of the parametrizacaoCentroDeCustoAprovacao property.
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
     * Gets the value of the parametrizacaoCentroDeCustoSolicitacao property.
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
     * Sets the value of the parametrizacaoCentroDeCustoSolicitacao property.
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
     * Gets the value of the parametrizacaoCentroDeCustoDebito property.
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
     * Sets the value of the parametrizacaoCentroDeCustoDebito property.
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
