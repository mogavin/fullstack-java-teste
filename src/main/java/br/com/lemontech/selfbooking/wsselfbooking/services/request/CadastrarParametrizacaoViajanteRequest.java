
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacao;


/**
 * <p>Java class for cadastrarParametrizacaoViajanteRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cadastrarParametrizacaoViajanteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametrizacaoViajanteAprovacao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacao"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarParametrizacaoViajanteRequest", propOrder = {
    "parametrizacaoViajanteAprovacao"
})
public class CadastrarParametrizacaoViajanteRequest {

    @XmlElement(required = true)
    protected ParametrizacaoViajanteAprovacao parametrizacaoViajanteAprovacao;

    /**
     * Gets the value of the parametrizacaoViajanteAprovacao property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoViajanteAprovacao }
     *     
     */
    public ParametrizacaoViajanteAprovacao getParametrizacaoViajanteAprovacao() {
        return parametrizacaoViajanteAprovacao;
    }

    /**
     * Sets the value of the parametrizacaoViajanteAprovacao property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoViajanteAprovacao }
     *     
     */
    public void setParametrizacaoViajanteAprovacao(ParametrizacaoViajanteAprovacao value) {
        this.parametrizacaoViajanteAprovacao = value;
    }

}
