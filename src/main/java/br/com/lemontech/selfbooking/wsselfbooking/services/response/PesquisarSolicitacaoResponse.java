
package br.com.lemontech.selfbooking.wsselfbooking.services.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Solicitacao;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoAcao;


/**
 * <p>Java class for pesquisarSolicitacaoResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pesquisarSolicitacaoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoAcao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoAcao" minOccurs="0"/>
 *         &lt;element name="numeroSolicitacoes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="solicitacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}solicitacao" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mensagemRetorno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarSolicitacaoResponse", propOrder = {
    "resultadoAcao",
    "numeroSolicitacoes",
    "solicitacao",
    "mensagemRetorno"
})
public class PesquisarSolicitacaoResponse {

    protected ResultadoAcao resultadoAcao;
    protected Integer numeroSolicitacoes;
    protected List<Solicitacao> solicitacao;
    protected String mensagemRetorno;

    /**
     * Gets the value of the resultadoAcao property.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoAcao }
     *     
     */
    public ResultadoAcao getResultadoAcao() {
        return resultadoAcao;
    }

    /**
     * Sets the value of the resultadoAcao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoAcao }
     *     
     */
    public void setResultadoAcao(ResultadoAcao value) {
        this.resultadoAcao = value;
    }

    /**
     * Gets the value of the numeroSolicitacoes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroSolicitacoes() {
        return numeroSolicitacoes;
    }

    /**
     * Sets the value of the numeroSolicitacoes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroSolicitacoes(Integer value) {
        this.numeroSolicitacoes = value;
    }

    /**
     * Gets the value of the solicitacao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the solicitacao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSolicitacao().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Solicitacao }
     * 
     * 
     */
    public List<Solicitacao> getSolicitacao() {
        if (solicitacao == null) {
            solicitacao = new ArrayList<Solicitacao>();
        }
        return this.solicitacao;
    }

    /**
     * Gets the value of the mensagemRetorno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagemRetorno() {
        return mensagemRetorno;
    }

    /**
     * Sets the value of the mensagemRetorno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagemRetorno(String value) {
        this.mensagemRetorno = value;
    }

}
