
package de.uniba.dsg.soa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
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
    private final static QName _GetDurationResponse_QNAME = new QName("http://uniba.de/dsg/soa/", "getDurationResponse");
    private final static QName _GetEnumerationResponse_QNAME = new QName("http://uniba.de/dsg/soa/", "getEnumerationResponse");
    private final static QName _GetDateTimeResponse_QNAME = new QName("http://uniba.de/dsg/soa/", "getDateTimeResponse");
    private final static QName _GetEnumeration_QNAME = new QName("http://uniba.de/dsg/soa/", "getEnumeration");
    private final static QName _GetCollection_QNAME = new QName("http://uniba.de/dsg/soa/", "getCollection");
    private final static QName _GetDateTime_QNAME = new QName("http://uniba.de/dsg/soa/", "getDateTime");
    private final static QName _GetDuration_QNAME = new QName("http://uniba.de/dsg/soa/", "getDuration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.uniba.dsg.soa
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetMapResponse }
     * 
     */
    public GetMapResponse createGetMapResponse() {
        return new GetMapResponse();
    }

    /**
     * Create an instance of {@link GetMap }
     * 
     */
    public GetMap createGetMap() {
        return new GetMap();
    }

    /**
     * Create an instance of {@link GetMapResponse.Entry }
     * 
     */
    public GetMapResponse.Entry createGetMapResponseEntry() {
        return new GetMapResponse.Entry();
    }

    /**
     * Create an instance of {@link GetCollectionResponse }
     * 
     */
    public GetCollectionResponse createGetCollectionResponse() {
        return new GetCollectionResponse();
    }

    /**
     * Create an instance of {@link GetEnumerationResponse }
     * 
     */
    public GetEnumerationResponse createGetEnumerationResponse() {
        return new GetEnumerationResponse();
    }

    /**
     * Create an instance of {@link GetEnumeration }
     * 
     */
    public GetEnumeration createGetEnumeration() {
        return new GetEnumeration();
    }

    /**
     * Create an instance of {@link GetMap.Entry }
     * 
     */
    public GetMap.Entry createGetMapEntry() {
        return new GetMap.Entry();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getDurationResponse")
    public JAXBElement<Duration> createGetDurationResponse(Duration value) {
        return new JAXBElement<Duration>(_GetDurationResponse_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnumerationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getEnumerationResponse")
    public JAXBElement<GetEnumerationResponse> createGetEnumerationResponse(GetEnumerationResponse value) {
        return new JAXBElement<GetEnumerationResponse>(_GetEnumerationResponse_QNAME, GetEnumerationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getDateTimeResponse")
    public JAXBElement<XMLGregorianCalendar> createGetDateTimeResponse(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetDateTimeResponse_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getEnumeration")
    public JAXBElement<GetEnumeration> createGetEnumeration(GetEnumeration value) {
        return new JAXBElement<GetEnumeration>(_GetEnumeration_QNAME, GetEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getCollection")
    public JAXBElement<GetCollection> createGetCollection(GetCollection value) {
        return new JAXBElement<GetCollection>(_GetCollection_QNAME, GetCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getDateTime")
    public JAXBElement<XMLGregorianCalendar> createGetDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getDuration")
    public JAXBElement<Duration> createGetDuration(Duration value) {
        return new JAXBElement<Duration>(_GetDuration_QNAME, Duration.class, null, value);
    }

}
