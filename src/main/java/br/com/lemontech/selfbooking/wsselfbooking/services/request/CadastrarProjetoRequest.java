
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Projeto;


/**
 * <p>Java class for cadastrarProjetoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarProjetoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="projeto" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}projeto"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarProjetoRequest", propOrder = {
    "projeto"
})
public class CadastrarProjetoRequest {

    @XmlElement(required = true)
    protected Projeto projeto;

    /**
     * Gets the value of the projeto property.
     * 
     * @return
     *     possible object is
     *     {@link Projeto }
     *     
     */
    public Projeto getProjeto() {
        return projeto;
    }

    /**
     * Sets the value of the projeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Projeto }
     *     
     */
    public void setProjeto(Projeto value) {
        this.projeto = value;
    }

}
