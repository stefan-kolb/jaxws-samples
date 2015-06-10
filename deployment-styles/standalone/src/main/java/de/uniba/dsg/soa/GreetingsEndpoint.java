package de.uniba.dsg.soa;

import javax.xml.ws.Endpoint;
import java.io.IOException;

public class GreetingsEndpoint {
	public static void main(String[] args) throws IOException {
		String url = "http://localhost:8080/standalone/GreetingsService";

		System.out.println("Starting Web Service Endpoint...");
		Endpoint endpoint = Endpoint.publish(url, new GreetingsImpl());
		System.out.println("Endpoint available at " + url);
		System.out.println("Press any key to exit...");
		System.in.read();
		endpoint.stop();
	}
}