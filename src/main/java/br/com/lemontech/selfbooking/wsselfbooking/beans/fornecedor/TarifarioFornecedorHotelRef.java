
package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.PerfilHospedagem;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.TipoApartamento;


/**
 * <p>Java class for tarifarioFornecedorHotelRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tarifarioFornecedorHotelRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificadorBackofficeFornecedor" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice"/>
 *         &lt;element name="identificadorBackofficeCliente" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}identificadorBackoffice" minOccurs="0"/>
 *         &lt;element name="categoriaApartamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}perfilHospedagem"/>
 *         &lt;element name="tipoApartamento" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoApartamento"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarifarioFornecedorHotelRef", propOrder = {
    "identificadorBackofficeFornecedor",
    "identificadorBackofficeCliente",
    "categoriaApartamento",
    "tipoApartamento"
})
@XmlSeeAlso({
    TarifarioFornecedorHotel.class
})
public class TarifarioFornecedorHotelRef {

    @XmlElement(required = true)
    protected String identificadorBackofficeFornecedor;
    protected String identificadorBackofficeCliente;
    @XmlElement(required = true)
    protected PerfilHospedagem categoriaApartamento;
    @XmlElement(required = true)
    protected TipoApartamento tipoApartamento;

    /**
     * Gets the value of the identificadorBackofficeFornecedor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeFornecedor() {
        return identificadorBackofficeFornecedor;
    }

    /**
     * Sets the value of the identificadorBackofficeFornecedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeFornecedor(String value) {
        this.identificadorBackofficeFornecedor = value;
    }

    /**
     * Gets the value of the identificadorBackofficeCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificadorBackofficeCliente() {
        return identificadorBackofficeCliente;
    }

    /**
     * Sets the value of the identificadorBackofficeCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificadorBackofficeCliente(String value) {
        this.identificadorBackofficeCliente = value;
    }

    /**
     * Gets the value of the categoriaApartamento property.
     * 
     * @return
     *     possible object is
     *     {@link PerfilHospedagem }
     *     
     */
    public PerfilHospedagem getCategoriaApartamento() {
        return categoriaApartamento;
    }

    /**
     * Sets the value of the categoriaApartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerfilHospedagem }
     *     
     */
    public void setCategoriaApartamento(PerfilHospedagem value) {
        this.categoriaApartamento = value;
    }

    /**
     * Gets the value of the tipoApartamento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoApartamento }
     *     
     */
    public TipoApartamento getTipoApartamento() {
        return tipoApartamento;
    }

    /**
     * Sets the value of the tipoApartamento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoApartamento }
     *     
     */
    public void setTipoApartamento(TipoApartamento value) {
        this.tipoApartamento = value;
    }

}
