
package br.com.lemontech.selfbooking.wsselfbooking.services.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorCarro;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorHotel;
import br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor.TarifarioFornecedorOutro;


/**
 * <p>Classe Java de cadastrarTarifarioRequest complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cadastrarTarifarioRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="tarifarioHotel" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorHotel"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="tarifarioCarro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorCarro"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="tarifarioOutro" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorOutro"/>
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
@XmlType(name = "cadastrarTarifarioRequest", propOrder = {
    "tarifarioHotel",
    "tarifarioCarro",
    "tarifarioOutro"
})
public class CadastrarTarifarioRequest {

    protected TarifarioFornecedorHotel tarifarioHotel;
    protected TarifarioFornecedorCarro tarifarioCarro;
    protected TarifarioFornecedorOutro tarifarioOutro;

    /**
     * Obtém o valor da propriedade tarifarioHotel.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorHotel }
     *     
     */
    public TarifarioFornecedorHotel getTarifarioHotel() {
        return tarifarioHotel;
    }

    /**
     * Define o valor da propriedade tarifarioHotel.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorHotel }
     *     
     */
    public void setTarifarioHotel(TarifarioFornecedorHotel value) {
        this.tarifarioHotel = value;
    }

    /**
     * Obtém o valor da propriedade tarifarioCarro.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorCarro }
     *     
     */
    public TarifarioFornecedorCarro getTarifarioCarro() {
        return tarifarioCarro;
    }

    /**
     * Define o valor da propriedade tarifarioCarro.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorCarro }
     *     
     */
    public void setTarifarioCarro(TarifarioFornecedorCarro value) {
        this.tarifarioCarro = value;
    }

    /**
     * Obtém o valor da propriedade tarifarioOutro.
     * 
     * @return
     *     possible object is
     *     {@link TarifarioFornecedorOutro }
     *     
     */
    public TarifarioFornecedorOutro getTarifarioOutro() {
        return tarifarioOutro;
    }

    /**
     * Define o valor da propriedade tarifarioOutro.
     * 
     * @param value
     *     allowed object is
     *     {@link TarifarioFornecedorOutro }
     *     
     */
    public void setTarifarioOutro(TarifarioFornecedorOutro value) {
        this.tarifarioOutro = value;
    }

}
