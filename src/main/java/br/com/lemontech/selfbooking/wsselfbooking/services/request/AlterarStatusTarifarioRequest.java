
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarroRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotelRef;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutroRef;


/**
 * <p>Java class for alterarStatusTarifarioRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="alterarStatusTarifarioRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="tarifarioHotelRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorHotelRef"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="tarifarioCarroRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorCarroRef"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="tarifarioOutroRef" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorOutroRef"/>
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
@XmlType(name = "alterarStatusTarifarioRequest", propOrder = {
    "ativo",
    "tarifarioHotelRef",
    "tarifarioCarroRef",
    "tarifarioOutroRef"
})
public class AlterarStatusTarifarioRequest {

    protected boolean ativo;
    protected TarifarioFornecedorHotelRef tarifarioHotelRef;
    protected TarifarioFornecedorCarroRef tarifarioCarroRef;
    protected TarifarioFornecedorOutroRef tarifarioOutroRef;

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
     * Gets the value of the tarifarioHotelRef property.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorHotelRef }
     *     
     */
    public TarifarioFornecedorHotelRef getTarifarioHotelRef() {
        return tarifarioHotelRef;
    }

    /**
     * Sets the value of the tarifarioHotelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorHotelRef }
     *     
     */
    public void setTarifarioHotelRef(TarifarioFornecedorHotelRef value) {
        this.tarifarioHotelRef = value;
    }

    /**
     * Gets the value of the tarifarioCarroRef property.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorCarroRef }
     *     
     */
    public TarifarioFornecedorCarroRef getTarifarioCarroRef() {
        return tarifarioCarroRef;
    }

    /**
     * Sets the value of the tarifarioCarroRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorCarroRef }
     *     
     */
    public void setTarifarioCarroRef(TarifarioFornecedorCarroRef value) {
        this.tarifarioCarroRef = value;
    }

    /**
     * Gets the value of the tarifarioOutroRef property.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorOutroRef }
     *     
     */
    public TarifarioFornecedorOutroRef getTarifarioOutroRef() {
        return tarifarioOutroRef;
    }

    /**
     * Sets the value of the tarifarioOutroRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorOutroRef }
     *     
     */
    public void setTarifarioOutroRef(TarifarioFornecedorOutroRef value) {
        this.tarifarioOutroRef = value;
    }

}
