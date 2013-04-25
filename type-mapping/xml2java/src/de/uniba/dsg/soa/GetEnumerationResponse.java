
package de.uniba.dsg.soa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getEnumerationResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getEnumerationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enumout" type="{http://uniba.de/dsg/soa/}rating" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEnumerationResponse", propOrder = {
    "enumout"
})
public class GetEnumerationResponse {

    protected Rating enumout;

    /**
     * Ruft den Wert der enumout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rating }
     *     
     */
    public Rating getEnumout() {
        return enumout;
    }

    /**
     * Legt den Wert der enumout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rating }
     *     
     */
    public void setEnumout(Rating value) {
        this.enumout = value;
    }

}
