
package br.com.lemontech.selfbooking.wsselfbooking.beans.fornecedor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import br.com.lemontech.selfbooking.wsselfbooking.beans.types.Moeda;


/**
 * <p>Java class for tarifarioFornecedorCarro complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tarifarioFornecedorCarro">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/fornecedor}tarifarioFornecedorCarroRef">
 *       &lt;sequence>
 *         &lt;element name="vencimento" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="descricao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento255" minOccurs="0"/>
 *         &lt;element name="tarifa" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="seguro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tarifaDiariaAdicional" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="tarifaHoraAdicional" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="moeda" type="{http://lemontech.com.br/selfbooking/wsselfbooking/beans/types}moeda"/>
 *         &lt;element name="ativo" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarifarioFornecedorCarro", propOrder = {
    "vencimento",
    "descricao",
    "tarifa",
    "seguro",
    "tarifaDiariaAdicional",
    "tarifaHoraAdicional",
    "moeda",
    "ativo"
})
public class TarifarioFornecedorCarro
    extends TarifarioFornecedorCarroRef
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar vencimento;
    protected String descricao;
    protected double tarifa;
    protected double seguro;
    protected double tarifaDiariaAdicional;
    protected double tarifaHoraAdicional;
    @XmlElement(required = true)
    protected Moeda moeda;
    protected boolean ativo;

    /**
     * Gets the value of the vencimento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVencimento() {
        return vencimento;
    }

    /**
     * Sets the value of the vencimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVencimento(XMLGregorianCalendar value) {
        this.vencimento = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
    }

    /**
     * Gets the value of the tarifa property.
     * 
     */
    public double getTarifa() {
        return tarifa;
    }

    /**
     * Sets the value of the tarifa property.
     * 
     */
    public void setTarifa(double value) {
        this.tarifa = value;
    }

    /**
     * Gets the value of the seguro property.
     * 
     */
    public double getSeguro() {
        return seguro;
    }

    /**
     * Sets the value of the seguro property.
     * 
     */
    public void setSeguro(double value) {
        this.seguro = value;
    }

    /**
     * Gets the value of the tarifaDiariaAdicional property.
     * 
     */
    public double getTarifaDiariaAdicional() {
        return tarifaDiariaAdicional;
    }

    /**
     * Sets the value of the tarifaDiariaAdicional property.
     * 
     */
    public void setTarifaDiariaAdicional(double value) {
        this.tarifaDiariaAdicional = value;
    }

    /**
     * Gets the value of the tarifaHoraAdicional property.
     * 
     */
    public double getTarifaHoraAdicional() {
        return tarifaHoraAdicional;
    }

    /**
     * Sets the value of the tarifaHoraAdicional property.
     * 
     */
    public void setTarifaHoraAdicional(double value) {
        this.tarifaHoraAdicional = value;
    }

    /**
     * Gets the value of the moeda property.
     * 
     * @return
     *     possible object is
     *     {@link Moeda }
     *     
     */
    public Moeda getMoeda() {
        return moeda;
    }

    /**
     * Sets the value of the moeda property.
     * 
     * @param value
     *     allowed object is
     *     {@link Moeda }
     *     
     */
    public void setMoeda(Moeda value) {
        this.moeda = value;
    }

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

}
