
package uddi;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uddi package. 
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

    private final static QName _Cuadrado_QNAME = new QName("http://UDDI/", "cuadrado");
    private final static QName _HelloResponse_QNAME = new QName("http://UDDI/", "helloResponse");
    private final static QName _Triangulo_QNAME = new QName("http://UDDI/", "triangulo");
    private final static QName _TrianguloResponse_QNAME = new QName("http://UDDI/", "trianguloResponse");
    private final static QName _Hello_QNAME = new QName("http://UDDI/", "hello");
    private final static QName _CuadradoResponse_QNAME = new QName("http://UDDI/", "cuadradoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uddi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TrianguloResponse }
     * 
     */
    public TrianguloResponse createTrianguloResponse() {
        return new TrianguloResponse();
    }

    /**
     * Create an instance of {@link Triangulo }
     * 
     */
    public Triangulo createTriangulo() {
        return new Triangulo();
    }

    /**
     * Create an instance of {@link Cuadrado }
     * 
     */
    public Cuadrado createCuadrado() {
        return new Cuadrado();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CuadradoResponse }
     * 
     */
    public CuadradoResponse createCuadradoResponse() {
        return new CuadradoResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cuadrado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "cuadrado")
    public JAXBElement<Cuadrado> createCuadrado(Cuadrado value) {
        return new JAXBElement<Cuadrado>(_Cuadrado_QNAME, Cuadrado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Triangulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "triangulo")
    public JAXBElement<Triangulo> createTriangulo(Triangulo value) {
        return new JAXBElement<Triangulo>(_Triangulo_QNAME, Triangulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TrianguloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "trianguloResponse")
    public JAXBElement<TrianguloResponse> createTrianguloResponse(TrianguloResponse value) {
        return new JAXBElement<TrianguloResponse>(_TrianguloResponse_QNAME, TrianguloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuadradoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://UDDI/", name = "cuadradoResponse")
    public JAXBElement<CuadradoResponse> createCuadradoResponse(CuadradoResponse value) {
        return new JAXBElement<CuadradoResponse>(_CuadradoResponse_QNAME, CuadradoResponse.class, null, value);
    }

}
