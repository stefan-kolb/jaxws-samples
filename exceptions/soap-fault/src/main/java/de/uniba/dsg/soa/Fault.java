package de.uniba.dsg.soa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.soap.SOAPFactory;
import javax.xml.ws.soap.SOAPFaultException;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.namespace.QName;

@WebService
public class Fault {
    @WebMethod
    public String verify(@WebParam(name = "input") String input) throws SOAPFaultException, SOAPException {
        SOAPFactory factory = SOAPFactory.newInstance();
        SOAPFault fault = factory.createFault("New Error", new QName("http://uniba.de/dsg/soa/", "CustomFault"));
        throw new SOAPFaultException(fault);
    }
}