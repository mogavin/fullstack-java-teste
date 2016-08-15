
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.FornecedorRef;


/**
 * <p>Java class for alterarStatusFornecedorRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the ativo property.
     * 
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * Sets the value of the ativo property.
     * 
     */
    public void setAtivo(boolean value) {
        this.ativo = value;
    }

    /**
     * Gets the value of the fornecedorRef property.
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
     * Sets the value of the fornecedorRef property.
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
