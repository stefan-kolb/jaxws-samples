package de.uniba.dsg.soa;

import java.io.IOException;

import javax.xml.ws.Endpoint;

public class GreetingsEndpoint {
    public static void main(String[] args) throws IOException {
        String url = "http://localhost:8080/document-literal/GreetingsService";

        System.out.println("Starting Web Service Endpoint...");
        Endpoint endpoint = Endpoint.publish(url, new GreetingsImpl());
        System.out.println("Endpoint available at " + url);
        System.out.println("Press any key to exit...");
        System.in.read();
        endpoint.stop();
    }
}
