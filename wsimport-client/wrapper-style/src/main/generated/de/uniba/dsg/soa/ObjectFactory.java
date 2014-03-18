
package de.uniba.dsg.soa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.uniba.dsg.soa package. 
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

    private final static QName _GetCancellors_QNAME = new QName("http://uniba.de/dsg/soa/", "getCancellors");
    private final static QName _GetCancellorsResponse_QNAME = new QName("http://uniba.de/dsg/soa/", "getCancellorsResponse");
    private final static QName _Cancellor_QNAME = new QName("http://uniba.de/dsg/soa/", "Cancellor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.uniba.dsg.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCancellors }
     * 
     */
    public GetCancellors createGetCancellors() {
        return new GetCancellors();
    }

    /**
     * Create an instance of {@link GetCancellorsResponse }
     * 
     */
    public GetCancellorsResponse createGetCancellorsResponse() {
        return new GetCancellorsResponse();
    }

    /**
     * Create an instance of {@link Cancellor }
     * 
     */
    public Cancellor createCancellor() {
        return new Cancellor();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCancellors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getCancellors")
    public JAXBElement<GetCancellors> createGetCancellors(GetCancellors value) {
        return new JAXBElement<GetCancellors>(_GetCancellors_QNAME, GetCancellors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCancellorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getCancellorsResponse")
    public JAXBElement<GetCancellorsResponse> createGetCancellorsResponse(GetCancellorsResponse value) {
        return new JAXBElement<GetCancellorsResponse>(_GetCancellorsResponse_QNAME, GetCancellorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Cancellor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "Cancellor")
    public JAXBElement<Cancellor> createCancellor(Cancellor value) {
        return new JAXBElement<Cancellor>(_Cancellor_QNAME, Cancellor.class, null, value);
    }

}
