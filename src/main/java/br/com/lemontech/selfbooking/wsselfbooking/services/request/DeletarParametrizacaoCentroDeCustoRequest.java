
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoAprovacaoRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoDebitoRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.ParametrizacaoCentroDeCustoSolicitacaoRef;


/**
 * <p>Java class for deletarParametrizacaoCentroDeCustoRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deletarParametrizacaoCentroDeCustoRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="parametrizacaoCentroDeCustoAprovacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoAprovacaoRef"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="parametrizacaoCentroDeCustoSolicitacaoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoSolicitacaoRef"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="parametrizacaoCentroDeCustoDebitoRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}parametrizacaoCentroDeCustoDebitoRef"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deletarParametrizacaoCentroDeCustoRequest", propOrder = {
    "parametrizacaoCentroDeCustoAprovacaoRef",
    "parametrizacaoCentroDeCustoSolicitacaoRef",
    "parametrizacaoCentroDeCustoDebitoRef"
})
public class DeletarParametrizacaoCentroDeCustoRequest {

    protected ParametrizacaoCentroDeCustoAprovacaoRef parametrizacaoCentroDeCustoAprovacaoRef;
    protected ParametrizacaoCentroDeCustoSolicitacaoRef parametrizacaoCentroDeCustoSolicitacaoRef;
    protected ParametrizacaoCentroDeCustoDebitoRef parametrizacaoCentroDeCustoDebitoRef;

    /**
     * Gets the value of the parametrizacaoCentroDeCustoAprovacaoRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoAprovacaoRef }
     *     
     */
    public ParametrizacaoCentroDeCustoAprovacaoRef getParametrizacaoCentroDeCustoAprovacaoRef() {
        return parametrizacaoCentroDeCustoAprovacaoRef;
    }

    /**
     * Sets the value of the parametrizacaoCentroDeCustoAprovacaoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoAprovacaoRef }
     *     
     */
    public void setParametrizacaoCentroDeCustoAprovacaoRef(ParametrizacaoCentroDeCustoAprovacaoRef value) {
        this.parametrizacaoCentroDeCustoAprovacaoRef = value;
    }

    /**
     * Gets the value of the parametrizacaoCentroDeCustoSolicitacaoRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoSolicitacaoRef }
     *     
     */
    public ParametrizacaoCentroDeCustoSolicitacaoRef getParametrizacaoCentroDeCustoSolicitacaoRef() {
        return parametrizacaoCentroDeCustoSolicitacaoRef;
    }

    /**
     * Sets the value of the parametrizacaoCentroDeCustoSolicitacaoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoSolicitacaoRef }
     *     
     */
    public void setParametrizacaoCentroDeCustoSolicitacaoRef(ParametrizacaoCentroDeCustoSolicitacaoRef value) {
        this.parametrizacaoCentroDeCustoSolicitacaoRef = value;
    }

    /**
     * Gets the value of the parametrizacaoCentroDeCustoDebitoRef property.
     * 
     * @return
     *     possible object is
     *     {@link ParametrizacaoCentroDeCustoDebitoRef }
     *     
     */
    public ParametrizacaoCentroDeCustoDebitoRef getParametrizacaoCentroDeCustoDebitoRef() {
        return parametrizacaoCentroDeCustoDebitoRef;
    }

    /**
     * Sets the value of the parametrizacaoCentroDeCustoDebitoRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametrizacaoCentroDeCustoDebitoRef }
     *     
     */
    public void setParametrizacaoCentroDeCustoDebitoRef(ParametrizacaoCentroDeCustoDebitoRef value) {
        this.parametrizacaoCentroDeCustoDebitoRef = value;
    }

}
