
package br.com.lemontech.selfbooking.wsselfbooking.services.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Passageiros;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Produtos;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.ResultadoOperacao;


/**
 * <p>Java class for pesquisarVendasConsolidadoraResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pesquisarVendasConsolidadoraResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultadoOperacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}resultadoOperacao" minOccurs="0"/>
 *         &lt;element name="numeroProdutos" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="passageiros" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}passageiros" minOccurs="0"/>
 *         &lt;element name="produtos" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}produtos" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pesquisarVendasConsolidadoraResponse", propOrder = {
    "resultadoOperacao",
    "numeroProdutos",
    "passageiros",
    "produtos"
})
public class PesquisarVendasConsolidadoraResponse {

    protected ResultadoOperacao resultadoOperacao;
    protected int numeroProdutos;
    protected Passageiros passageiros;
    protected Produtos produtos;

    /**
     * Gets the value of the resultadoOperacao property.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoOperacao }
     *     
     */
    public ResultadoOperacao getResultadoOperacao() {
        return resultadoOperacao;
    }

    /**
     * Sets the value of the resultadoOperacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoOperacao }
     *     
     */
    public void setResultadoOperacao(ResultadoOperacao value) {
        this.resultadoOperacao = value;
    }

    /**
     * Gets the value of the numeroProdutos property.
     * 
     */
    public int getNumeroProdutos() {
        return numeroProdutos;
    }

    /**
     * Sets the value of the numeroProdutos property.
     * 
     */
    public void setNumeroProdutos(int value) {
        this.numeroProdutos = value;
    }

    /**
     * Gets the value of the passageiros property.
     * 
     * @return
     *     possible object is
     *     {@link Passageiros }
     *     
     */
    public Passageiros getPassageiros() {
        return passageiros;
    }

    /**
     * Sets the value of the passageiros property.
     * 
     * @param value
     *     allowed object is
     *     {@link Passageiros }
     *     
     */
    public void setPassageiros(Passageiros value) {
        this.passageiros = value;
    }

    /**
     * Gets the value of the produtos property.
     * 
     * @return
     *     possible object is
     *     {@link Produtos }
     *     
     */
    public Produtos getProdutos() {
        return produtos;
    }

    /**
     * Sets the value of the produtos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Produtos }
     *     
     */
    public void setProdutos(Produtos value) {
        this.produtos = value;
    }

}
