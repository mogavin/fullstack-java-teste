
package br.com.lemontech.selfbooking.wsselfbooking.beans.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de identificador complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="identificador">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipoIntegracao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}tipoIntegracao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "identificador", propOrder = {
    "conector",
    "codigo",
    "tipoIntegracao"
})
public class Identificador {

    protected String conector;
    protected String codigo;
    @XmlSchemaType(name = "string")
    protected TipoIntegracao tipoIntegracao;

    /**
     * Obtém o valor da propriedade conector.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConector() {
        return conector;
    }

    /**
     * Define o valor da propriedade conector.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConector(String value) {
        this.conector = value;
    }

    /**
     * Obtém o valor da propriedade codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define o valor da propriedade codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtém o valor da propriedade tipoIntegracao.
     * 
     * @return
     *     possible object is
     *     {@link TipoIntegracao }
     *     
     */
    public TipoIntegracao getTipoIntegracao() {
        return tipoIntegracao;
    }

    /**
     * Define o valor da propriedade tipoIntegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIntegracao }
     *     
     */
    public void setTipoIntegracao(TipoIntegracao value) {
        this.tipoIntegracao = value;
    }

}
