package de.uniba.dsg.soa;

import java.io.IOException;

import javax.xml.ws.Endpoint;

public class Java2WsdlEndpoint {
    public static void main(String[] args) throws IOException {
        String url = "http://localhost:8080/wsdl2java/Wsdl2JavaService";

        System.out.println("Starting Web Service Endpoint...");
        Endpoint endpoint = Endpoint.publish(url, new Java2Wsdl());
        System.out.println("Endpoint available at " + url);
        System.out.println("Press any key to exit...");
        System.in.read();
        endpoint.stop();
    }
}
