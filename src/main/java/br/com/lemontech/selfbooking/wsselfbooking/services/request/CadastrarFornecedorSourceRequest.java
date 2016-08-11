
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef;


/**
 * <p>Classe Java de cadastrarFornecedorSourceRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarFornecedorSourceRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="idFornecedorSource" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fornecedorRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}fornecedorRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarFornecedorSourceRequest", propOrder = {
    "source",
    "idFornecedorSource",
    "fornecedorRef"
})
public class CadastrarFornecedorSourceRequest {

    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String idFornecedorSource;
    @XmlElement(required = true)
    protected FornecedorRef fornecedorRef;

    /**
     * Obtém o valor da propriedade source.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Define o valor da propriedade source.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Obtém o valor da propriedade idFornecedorSource.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdFornecedorSource() {
        return idFornecedorSource;
    }

    /**
     * Define o valor da propriedade idFornecedorSource.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdFornecedorSource(String value) {
        this.idFornecedorSource = value;
    }

    /**
     * Obtém o valor da propriedade fornecedorRef.
     * 
     * @return
     *     possible object is
     *     {@link FornecedorRef }
     *     
     */
    public FornecedorRef getFornecedorRef() {
        return fornecedorRef;
    }

    /**
     * Define o valor da propriedade fornecedorRef.
     * 
     * @param value
     *     allowed object is
     *     {@link FornecedorRef }
     *     
     */
    public void setFornecedorRef(FornecedorRef value) {
        this.fornecedorRef = value;
    }

}
