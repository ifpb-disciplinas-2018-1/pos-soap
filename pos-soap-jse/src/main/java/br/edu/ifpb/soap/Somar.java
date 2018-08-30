
package br.edu.ifpb.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="d" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somar", propOrder = {
    "c",
    "d"
})
public class Somar {

    protected int c;
    protected int d;

    /**
     * Obtém o valor da propriedade c.
     * 
     */
    public int getC() {
        return c;
    }

    /**
     * Define o valor da propriedade c.
     * 
     */
    public void setC(int value) {
        this.c = value;
    }

    /**
     * Obtém o valor da propriedade d.
     * 
     */
    public int getD() {
        return d;
    }

    /**
     * Define o valor da propriedade d.
     * 
     */
    public void setD(int value) {
        this.d = value;
    }

}
