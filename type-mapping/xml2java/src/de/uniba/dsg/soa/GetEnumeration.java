
package de.uniba.dsg.soa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getEnumeration complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getEnumeration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enumin" type="{http://uniba.de/dsg/soa/}rating" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getEnumeration", propOrder = {
    "enumin"
})
public class GetEnumeration {

    protected Rating enumin;

    /**
     * Ruft den Wert der enumin-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rating }
     *     
     */
    public Rating getEnumin() {
        return enumin;
    }

    /**
     * Legt den Wert der enumin-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rating }
     *     
     */
    public void setEnumin(Rating value) {
        this.enumin = value;
    }

}
