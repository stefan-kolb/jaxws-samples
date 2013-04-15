
package de.uniba.dsg.soa;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getCancellorsResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getCancellorsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cancellor" type="{http://uniba.de/dsg/soa/}cancellor" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCancellorsResponse", propOrder = {
    "cancellor"
})
public class GetCancellorsResponse {

    protected List<Cancellor> cancellor;

    /**
     * Gets the value of the cancellor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancellor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancellor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Cancellor }
     * 
     * 
     */
    public List<Cancellor> getCancellor() {
        if (cancellor == null) {
            cancellor = new ArrayList<Cancellor>();
        }
        return this.cancellor;
    }

}
