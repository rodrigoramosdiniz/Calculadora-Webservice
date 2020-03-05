
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculadoraWS", targetNamespace = "http://calculadorawebservice.ipli.tsi.ifms.br/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculadoraWS {


    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getMulti", targetNamespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", className = "ws.GetMulti")
    @ResponseWrapper(localName = "getMultiResponse", targetNamespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", className = "ws.GetMultiResponse")
    @Action(input = "http://calculadorawebservice.ipli.tsi.ifms.br/CalculadoraWS/getMultiRequest", output = "http://calculadorawebservice.ipli.tsi.ifms.br/CalculadoraWS/getMultiResponse")
    public double getMulti(
        @WebParam(name = "n1", targetNamespace = "")
        double n1,
        @WebParam(name = "n2", targetNamespace = "")
        double n2);

    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSoma", targetNamespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", className = "ws.GetSoma")
    @ResponseWrapper(localName = "getSomaResponse", targetNamespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", className = "ws.GetSomaResponse")
    @Action(input = "http://calculadorawebservice.ipli.tsi.ifms.br/CalculadoraWS/getSomaRequest", output = "http://calculadorawebservice.ipli.tsi.ifms.br/CalculadoraWS/getSomaResponse")
    public double getSoma(
        @WebParam(name = "n1", targetNamespace = "")
        double n1,
        @WebParam(name = "n2", targetNamespace = "")
        double n2);

    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getDivisao", targetNamespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", className = "ws.GetDivisao")
    @ResponseWrapper(localName = "getDivisaoResponse", targetNamespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", className = "ws.GetDivisaoResponse")
    @Action(input = "http://calculadorawebservice.ipli.tsi.ifms.br/CalculadoraWS/getDivisaoRequest", output = "http://calculadorawebservice.ipli.tsi.ifms.br/CalculadoraWS/getDivisaoResponse")
    public double getDivisao(
        @WebParam(name = "n1", targetNamespace = "")
        double n1,
        @WebParam(name = "n2", targetNamespace = "")
        double n2);

    /**
     * 
     * @param n1
     * @param n2
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getSub", targetNamespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", className = "ws.GetSub")
    @ResponseWrapper(localName = "getSubResponse", targetNamespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", className = "ws.GetSubResponse")
    @Action(input = "http://calculadorawebservice.ipli.tsi.ifms.br/CalculadoraWS/getSubRequest", output = "http://calculadorawebservice.ipli.tsi.ifms.br/CalculadoraWS/getSubResponse")
    public double getSub(
        @WebParam(name = "n1", targetNamespace = "")
        double n1,
        @WebParam(name = "n2", targetNamespace = "")
        double n2);

}