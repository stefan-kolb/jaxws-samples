package de.uniba.dsg.soa;

import javax.jws.WebService;

@WebService(serviceName = "GreetingsService", endpointInterface = "de.uniba.dsg.soa.GreetingsPortType", portName="GreetingsPort", targetNamespace="http://uniba.de/dsg/soa/")
public class GreetingsImpl implements GreetingsPortType {

  public String greet(String name) {
		return name + " says: Hello WebServices!";
	}
}