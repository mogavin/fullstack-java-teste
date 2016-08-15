
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.IdentificadorIntegracaoRef;


/**
 * <p>Java class for inserirIdentificadorIntegracaoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the identificadorIntegracaoRef property.
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
     * Sets the value of the identificadorIntegracaoRef property.
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
