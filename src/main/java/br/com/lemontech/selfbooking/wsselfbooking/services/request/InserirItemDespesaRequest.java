
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Deslocamento;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda;


/**
 * <p>Java class for inserirItemDespesaRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inserirItemDespesaRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSolicitacaoRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoDespesa">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda"/>
 *         &lt;element name="imagem">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="deslocamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}deslocamento" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identificadorExterno" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirItemDespesaRequest", propOrder = {
    "idSolicitacaoRef",
    "tipoDespesa",
    "valor",
    "moeda",
    "imagem",
    "deslocamento",
    "observacao",
    "identificadorExterno"
})
public class InserirItemDespesaRequest {

    protected int idSolicitacaoRef;
    @XmlElement(required = true)
    protected String tipoDespesa;
    protected double valor;
    @XmlElement(required = true)
    protected Moeda moeda;
    @XmlElement(required = true)
    protected String imagem;
    protected Deslocamento deslocamento;
    protected String observacao;
    @XmlElement(required = true)
    protected String identificadorExterno;

    /**
     * Gets the value of the idSolicitacaoRef property.
     * 
     */
    public int getIdSolicitacaoRef() {
        return idSolicitacaoRef;
    }

    /**
     * Sets the value of the idSolicitacaoRef property.
     * 
     */
    public void setIdSolicitacaoRef(int value) {
        this.idSolicitacaoRef = value;
    }

    /**
     * Gets the value of the tipoDespesa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDespesa() {
        return tipoDespesa;
    }

    /**
     * Sets the value of the tipoDespesa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDespesa(String value) {
        this.tipoDespesa = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

    /**
     * Gets the value of the moeda property.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Sets the value of the moeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

    /**
     * Gets the value of the imagem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * Sets the value of the imagem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImagem(String value) {
        this.imagem = value;
    }

    /**
     * Gets the value of the deslocamento property.
     * 
     * @return
     *     possible object is
     *     {@link Deslocamento }
     *     
     */
    public Deslocamento getDeslocamento() {
        return deslocamento;
    }

    /**
     * Sets the value of the deslocamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Deslocamento }
     *     
     */
    public void setDeslocamento(Deslocamento value) {
        this.deslocamento = value;
    }

    /**
     * Gets the value of the observacao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Sets the value of the observacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Gets the value of the identificadorExterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorExterno() {
        return identificadorExterno;
    }

    /**
     * Sets the value of the identificadorExterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorExterno(String value) {
        this.identificadorExterno = value;
    }

}
