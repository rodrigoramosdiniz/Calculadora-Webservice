
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetSubResponse_QNAME = new QName("http://calculadorawebservice.ipli.tsi.ifms.br/", "getSubResponse");
    private final static QName _GetSomaResponse_QNAME = new QName("http://calculadorawebservice.ipli.tsi.ifms.br/", "getSomaResponse");
    private final static QName _GetMultiResponse_QNAME = new QName("http://calculadorawebservice.ipli.tsi.ifms.br/", "getMultiResponse");
    private final static QName _GetDivisao_QNAME = new QName("http://calculadorawebservice.ipli.tsi.ifms.br/", "getDivisao");
    private final static QName _GetDivisaoResponse_QNAME = new QName("http://calculadorawebservice.ipli.tsi.ifms.br/", "getDivisaoResponse");
    private final static QName _GetMulti_QNAME = new QName("http://calculadorawebservice.ipli.tsi.ifms.br/", "getMulti");
    private final static QName _GetSoma_QNAME = new QName("http://calculadorawebservice.ipli.tsi.ifms.br/", "getSoma");
    private final static QName _GetSub_QNAME = new QName("http://calculadorawebservice.ipli.tsi.ifms.br/", "getSub");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSub }
     * 
     */
    public GetSub createGetSub() {
        return new GetSub();
    }

    /**
     * Create an instance of {@link GetSoma }
     * 
     */
    public GetSoma createGetSoma() {
        return new GetSoma();
    }

    /**
     * Create an instance of {@link GetMulti }
     * 
     */
    public GetMulti createGetMulti() {
        return new GetMulti();
    }

    /**
     * Create an instance of {@link GetSomaResponse }
     * 
     */
    public GetSomaResponse createGetSomaResponse() {
        return new GetSomaResponse();
    }

    /**
     * Create an instance of {@link GetDivisao }
     * 
     */
    public GetDivisao createGetDivisao() {
        return new GetDivisao();
    }

    /**
     * Create an instance of {@link GetDivisaoResponse }
     * 
     */
    public GetDivisaoResponse createGetDivisaoResponse() {
        return new GetDivisaoResponse();
    }

    /**
     * Create an instance of {@link GetMultiResponse }
     * 
     */
    public GetMultiResponse createGetMultiResponse() {
        return new GetMultiResponse();
    }

    /**
     * Create an instance of {@link GetSubResponse }
     * 
     */
    public GetSubResponse createGetSubResponse() {
        return new GetSubResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", name = "getSubResponse")
    public JAXBElement<GetSubResponse> createGetSubResponse(GetSubResponse value) {
        return new JAXBElement<GetSubResponse>(_GetSubResponse_QNAME, GetSubResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSomaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", name = "getSomaResponse")
    public JAXBElement<GetSomaResponse> createGetSomaResponse(GetSomaResponse value) {
        return new JAXBElement<GetSomaResponse>(_GetSomaResponse_QNAME, GetSomaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", name = "getMultiResponse")
    public JAXBElement<GetMultiResponse> createGetMultiResponse(GetMultiResponse value) {
        return new JAXBElement<GetMultiResponse>(_GetMultiResponse_QNAME, GetMultiResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDivisao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", name = "getDivisao")
    public JAXBElement<GetDivisao> createGetDivisao(GetDivisao value) {
        return new JAXBElement<GetDivisao>(_GetDivisao_QNAME, GetDivisao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDivisaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", name = "getDivisaoResponse")
    public JAXBElement<GetDivisaoResponse> createGetDivisaoResponse(GetDivisaoResponse value) {
        return new JAXBElement<GetDivisaoResponse>(_GetDivisaoResponse_QNAME, GetDivisaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMulti }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", name = "getMulti")
    public JAXBElement<GetMulti> createGetMulti(GetMulti value) {
        return new JAXBElement<GetMulti>(_GetMulti_QNAME, GetMulti.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSoma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", name = "getSoma")
    public JAXBElement<GetSoma> createGetSoma(GetSoma value) {
        return new JAXBElement<GetSoma>(_GetSoma_QNAME, GetSoma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSub }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://calculadorawebservice.ipli.tsi.ifms.br/", name = "getSub")
    public JAXBElement<GetSub> createGetSub(GetSub value) {
        return new JAXBElement<GetSub>(_GetSub_QNAME, GetSub.class, null, value);
    }

}
