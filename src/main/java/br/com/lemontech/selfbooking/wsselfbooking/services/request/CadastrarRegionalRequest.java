
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.Regional;


/**
 * <p>Classe Java de cadastrarRegionalRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarRegionalRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="regional" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}regional"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cadastrarRegionalRequest", propOrder = {
    "regional"
})
public class CadastrarRegionalRequest {

    @XmlElement(required = true)
    protected Regional regional;

    /**
     * Obtém o valor da propriedade regional.
     * 
     * @return
     *     possible object is
     *     {@link Regional }
     *     
     */
    public Regional getRegional() {
        return regional;
    }

    /**
     * Define o valor da propriedade regional.
     * 
     * @param value
     *     allowed object is
     *     {@link Regional }
     *     
     */
    public void setRegional(Regional value) {
        this.regional = value;
    }

}
