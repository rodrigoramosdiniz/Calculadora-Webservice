
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getDivisao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getDivisao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="n1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="n2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDivisao", propOrder = {
    "n1",
    "n2"
})
public class GetDivisao {

    protected double n1;
    protected double n2;

    /**
     * Obtém o valor da propriedade n1.
     * 
     */
    public double getN1() {
        return n1;
    }

    /**
     * Define o valor da propriedade n1.
     * 
     */
    public void setN1(double value) {
        this.n1 = value;
    }

    /**
     * Obtém o valor da propriedade n2.
     * 
     */
    public double getN2() {
        return n2;
    }

    /**
     * Define o valor da propriedade n2.
     * 
     */
    public void setN2(double value) {
        this.n2 = value;
    }

}
