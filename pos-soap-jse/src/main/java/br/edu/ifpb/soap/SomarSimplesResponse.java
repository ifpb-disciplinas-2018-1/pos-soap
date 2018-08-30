
package br.edu.ifpb.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somarSimplesResponse complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somarSimplesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resposta" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somarSimplesResponse", propOrder = {
    "resposta"
})
public class SomarSimplesResponse {

    protected int resposta;

    /**
     * Obtém o valor da propriedade resposta.
     * 
     */
    public int getResposta() {
        return resposta;
    }

    /**
     * Define o valor da propriedade resposta.
     * 
     */
    public void setResposta(int value) {
        this.resposta = value;
    }

}
