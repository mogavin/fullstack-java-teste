
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoViajanteAprovacaoRef;


/**
 * <p>Classe Java de deletarParametrizacaoViajanteRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="deletarParametrizacaoViajanteRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametrizacaoViajanteAprovacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoViajanteAprovacaoRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletarParametrizacaoViajanteRequest", propOrder = {
    "parametrizacaoViajanteAprovacaoRef"
})
public class DeletarParametrizacaoViajanteRequest {

    @XmlElement(required = true)
    protected ParametrizacaoViajanteAprovacaoRef parametrizacaoViajanteAprovacaoRef;

    /**
     * Obtém o valor da propriedade parametrizacaoViajanteAprovacaoRef.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoViajanteAprovacaoRef }
     *     
     */
    public ParametrizacaoViajanteAprovacaoRef getParametrizacaoViajanteAprovacaoRef() {
        return parametrizacaoViajanteAprovacaoRef;
    }

    /**
     * Define o valor da propriedade parametrizacaoViajanteAprovacaoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoViajanteAprovacaoRef }
     *     
     */
    public void setParametrizacaoViajanteAprovacaoRef(ParametrizacaoViajanteAprovacaoRef value) {
        this.parametrizacaoViajanteAprovacaoRef = value;
    }

}
