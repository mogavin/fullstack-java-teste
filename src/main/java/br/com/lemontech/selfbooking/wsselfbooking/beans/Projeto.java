
package br.com.lemontech.selfbooking.wsselfbooking.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for projeto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="projeto">
 *   &lt;complexContent>
 *     &lt;extension base="{http://lemontech.com.br/selfbooking/wsselfbooking/beans}projetoRef">
 *       &lt;sequence>
 *         &lt;element name="descricao" type="{http://lemontech.com.br/selfbooking/wsselfbooking/common/types}descricaoElemento100"/>
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
@XmlType(name = "projeto", propOrder = {
    "descricao",
    "ativo"
})
public class Projeto
    extends ProjetoRef
{

    @XmlElement(required = true)
    protected String descricao;
    protected boolean ativo;

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
