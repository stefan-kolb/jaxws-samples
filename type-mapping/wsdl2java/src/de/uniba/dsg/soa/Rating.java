
package de.uniba.dsg.soa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für rating.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="rating">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bad"/>
 *     &lt;enumeration value="Ok"/>
 *     &lt;enumeration value="Good"/>
 *     &lt;enumeration value="Super"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "rating")
@XmlEnum
public enum Rating {

    @XmlEnumValue("Bad")
    BAD("Bad"),
    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("Good")
    GOOD("Good"),
    @XmlEnumValue("Super")
    SUPER("Super");
    private final String value;

    Rating(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Rating fromValue(String v) {
        for (Rating c: Rating.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
