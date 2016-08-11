
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.IdentificadorIntegracaoRef;


/**
 * <p>Classe Java de inserirIdentificadorIntegracaoRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="inserirIdentificadorIntegracaoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorIntegracaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}identificadorIntegracaoRef"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inserirIdentificadorIntegracaoRequest", propOrder = {
    "identificadorIntegracaoRef"
})
public class InserirIdentificadorIntegracaoRequest {

    @XmlElement(required = true)
    protected IdentificadorIntegracaoRef identificadorIntegracaoRef;

    /**
     * Obtém o valor da propriedade identificadorIntegracaoRef.
     * 
     * @return
     *     possible object is
     *     {@link IdentificadorIntegracaoRef }
     *     
     */
    public IdentificadorIntegracaoRef getIdentificadorIntegracaoRef() {
        return identificadorIntegracaoRef;
    }

    /**
     * Define o valor da propriedade identificadorIntegracaoRef.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificadorIntegracaoRef }
     *     
     */
    public void setIdentificadorIntegracaoRef(IdentificadorIntegracaoRef value) {
        this.identificadorIntegracaoRef = value;
    }

}
