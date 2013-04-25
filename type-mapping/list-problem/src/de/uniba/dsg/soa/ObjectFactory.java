
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

    private final static QName _GetCollectionResponse_QNAME = new QName("http://uniba.de/dsg/soa/", "getCollectionResponse");
    private final static QName _GetCollection_QNAME = new QName("http://uniba.de/dsg/soa/", "getCollection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.uniba.dsg.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCollectionResponse }
     * 
     */
    public GetCollectionResponse createGetCollectionResponse() {
        return new GetCollectionResponse();
    }

    /**
     * Create an instance of {@link GetCollection }
     * 
     */
    public GetCollection createGetCollection() {
        return new GetCollection();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getCollectionResponse")
    public JAXBElement<GetCollectionResponse> createGetCollectionResponse(GetCollectionResponse value) {
        return new JAXBElement<GetCollectionResponse>(_GetCollectionResponse_QNAME, GetCollectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getCollection")
    public JAXBElement<GetCollection> createGetCollection(GetCollection value) {
        return new JAXBElement<GetCollection>(_GetCollection_QNAME, GetCollection.class, null, value);
    }

}
