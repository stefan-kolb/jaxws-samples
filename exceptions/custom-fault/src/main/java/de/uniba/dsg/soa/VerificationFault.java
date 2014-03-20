package de.uniba.dsg.soa;

import javax.xml.ws.WebFault;

/**
 * Custom Fault with methods as required by the JAX-WS specification.
 * If the Exception does not follow this style, JAX-WS will generate a wrapper class 
 * and the Exception will be put in the FaultBean class. See java-exception example.
 */
@WebFault(name = "VerificationFault")
public class VerificationFault extends Exception {
    /** Java type that goes as soapenv:Fault detail element. */
    private VerificationFaultBean faultInfo;

    public VerificationFault(String message, VerificationFaultBean faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    public VerificationFault(String message, VerificationFaultBean faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    public VerificationFaultBean getFaultInfo() {
        return faultInfo;
    }	
}