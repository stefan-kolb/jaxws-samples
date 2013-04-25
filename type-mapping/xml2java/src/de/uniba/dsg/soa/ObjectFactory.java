
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
    private final static QName _GetDateTimeResponse_QNAME = new QName("http://uniba.de/dsg/soa/", "getDateTimeResponse");
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
     * Create an instance of {@link GetMap }
     * 
     */
    public GetMap createGetMap() {
        return new GetMap();
    }

    /**
     * Create an instance of {@link GetMap.Standard }
     * 
     */
    public GetMap.Standard createGetMapStandard() {
        return new GetMap.Standard();
    }

    /**
     * Create an instance of {@link GetMapResponse }
     * 
     */
    public GetMapResponse createGetMapResponse() {
        return new GetMapResponse();
    }

    /**
     * Create an instance of {@link GetMapResponse.Standard }
     * 
     */
    public GetMapResponse.Standard createGetMapResponseStandard() {
        return new GetMapResponse.Standard();
    }

    /**
     * Create an instance of {@link List }
     * 
     */
    public List createList() {
        return new List();
    }

    /**
     * Create an instance of {@link GetEnumerationResponse }
     * 
     */
    public GetEnumerationResponse createGetEnumerationResponse() {
        return new GetEnumerationResponse();
    }

    /**
     * Create an instance of {@link Cancellor }
     * 
     */
    public Cancellor createCancellor() {
        return new Cancellor();
    }

    /**
     * Create an instance of {@link GetEnumeration }
     * 
     */
    public GetEnumeration createGetEnumeration() {
        return new GetEnumeration();
    }

    /**
     * Create an instance of {@link GetMap.Standard.Entry }
     * 
     */
    public GetMap.Standard.Entry createGetMapStandardEntry() {
        return new GetMap.Standard.Entry();
    }

    /**
     * Create an instance of {@link GetMapResponse.Standard.Entry }
     * 
     */
    public GetMapResponse.Standard.Entry createGetMapResponseStandardEntry() {
        return new GetMapResponse.Standard.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getCollectionResponse")
    public JAXBElement<List> createGetCollectionResponse(List value) {
        return new JAXBElement<List>(_GetCollectionResponse_QNAME, List.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getDateTimeResponse")
    public JAXBElement<XMLGregorianCalendar> createGetDateTimeResponse(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_GetDateTimeResponse_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://uniba.de/dsg/soa/", name = "getCollection")
    public JAXBElement<List> createGetCollection(List value) {
        return new JAXBElement<List>(_GetCollection_QNAME, List.class, null, value);
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
