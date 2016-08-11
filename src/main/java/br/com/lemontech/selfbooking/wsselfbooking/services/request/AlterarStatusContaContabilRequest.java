
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ContaContabilRef;


/**
 * <p>Classe Java de alterarStatusContaContabilRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="alterarStatusContaContabilRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="contaContabilRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}contaContabilRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alterarStatusContaContabilRequest", propOrder = {
    "ativo",
    "contaContabilRef"
})
public class AlterarStatusContaContabilRequest {

    protected boolean ativo;
    @XmlElement(required = true)
    protected ContaContabilRef contaContabilRef;

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
     * Obtém o valor da propriedade contaContabilRef.
     * 
     * @return
     *     possible object is
     *     {@link ContaContabilRef }
     *     
     */
    public ContaContabilRef getContaContabilRef() {
        return contaContabilRef;
    }

    /**
     * Define o valor da propriedade contaContabilRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaContabilRef }
     *     
     */
    public void setContaContabilRef(ContaContabilRef value) {
        this.contaContabilRef = value;
    }

}
