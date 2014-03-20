package de.uniba.dsg.soa;

import javax.xml.ws.WebFault;

/**
 * The Exception does not follow the style defined by the JAX-WS specification (See custom-fault example).
 * JAX-WS will generate a wrapper class and the Exception will be put in the FaultBean class.
 */
@WebFault(name = "VerificationException")
public class VerificationException extends Exception {
  public VerificationException() { super(); }
  public VerificationException(String s) { super(s); }
  public VerificationException(String s, Throwable throwable) { super(s, throwable); }
  public VerificationException(Throwable throwable) { super(throwable); }
}