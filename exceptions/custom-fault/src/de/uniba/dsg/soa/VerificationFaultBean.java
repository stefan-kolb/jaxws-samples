package de.uniba.dsg.soa;

/** Java type that goes as soapenv:Fault detail element. */
public class VerificationFaultBean {
    private String message;

    public VerificationFaultBean() { }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}