
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef;


/**
 * <p>Classe Java de alterarStatusFornecedorRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterarStatusFornecedorRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
@XmlType(name = "alterarStatusFornecedorRequest", propOrder = {
    "ativo",
    "fornecedorRef"
})
public class AlterarStatusFornecedorRequest {

    protected boolean ativo;
    @XmlElement(required = true)
    protected FornecedorRef fornecedorRef;

    /**
     * Obtém o valor da propriedade ativo.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Define o valor da propriedade ativo.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
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
