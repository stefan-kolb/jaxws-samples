package de.uniba.dsg.soa;

import javax.xml.ws.Endpoint;
import java.io.IOException;

public class GreetingsEndpoint {
  public static void main(String[] args) throws IOException {
		System.out.println("Starting Web Service Endpoint...");
    Endpoint.publish("http://localhost:8080/greetings-standalone/GreetingsService", new GreetingsImpl()); 
		System.out.println("Press any key to exit...");		
		System.in.read();
		System.exit(0);
  }  
}