
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ContaContabil;


/**
 * <p>Java class for cadastrarContaContabilRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarContaContabilRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contaContabil" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}contaContabil"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarContaContabilRequest", propOrder = {
    "contaContabil"
})
public class CadastrarContaContabilRequest {

    @XmlElement(required = true)
    protected ContaContabil contaContabil;

    /**
     * Gets the value of the contaContabil property.
     * 
     * @return
     *     possible object is
     *     {@link ContaContabil }
     *     
     */
    public ContaContabil getContaContabil() {
        return contaContabil;
    }

    /**
     * Sets the value of the contaContabil property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContaContabil }
     *     
     */
    public void setContaContabil(ContaContabil value) {
        this.contaContabil = value;
    }

}
