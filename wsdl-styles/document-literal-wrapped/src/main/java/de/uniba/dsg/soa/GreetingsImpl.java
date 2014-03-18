package de.uniba.dsg.soa;

import javax.jws.WebService;

@WebService(serviceName = "GreetingsService", portName="GreetingsPort", endpointInterface = "de.uniba.dsg.soa.GreetingsPortType", targetNamespace="http://uniba.de/dsg/soa/", wsdlLocation="WEB-INF/wsdl/greetings-document-literal-wrapped.wsdl")
public class GreetingsImpl implements GreetingsPortType {

  public String greet(String name) {
		return name + " says: Hello WebServices!";
	}
}