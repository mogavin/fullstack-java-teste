
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ContaContabilRef;


/**
 * <p>Java class for alterarStatusContaContabilRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the contaContabilRef property.
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
     * Sets the value of the contaContabilRef property.
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
