
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Projeto;


/**
 * <p>Classe Java de cadastrarProjetoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
     * Obtém o valor da propriedade projeto.
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
     * Define o valor da propriedade projeto.
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
