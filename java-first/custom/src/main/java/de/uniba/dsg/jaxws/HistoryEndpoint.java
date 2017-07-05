package de.uniba.dsg.jaxws;

import java.io.IOException;

import javax.xml.ws.Endpoint;

public class HistoryEndpoint {
	public static void main(String[] args) throws IOException {
		String url = "http://localhost:8080/custom/HistoryService";

		System.out.println("Starting Web Service Endpoint...");
		Endpoint endpoint = Endpoint.publish(url, new History());
		System.out.println("Endpoint available at " + url);
		System.out.println("Press any key to exit...");
		System.in.read();
		endpoint.stop();
	}
}