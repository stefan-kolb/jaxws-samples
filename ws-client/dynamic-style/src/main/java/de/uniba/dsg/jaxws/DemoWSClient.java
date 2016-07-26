package de.uniba.dsg.jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.joda.time.LocalDate;

public class DemoWSClient {
	private static final String wsdlLocation = "http://localhost:8080/custom/HistoryService?wsdl";

	public static void main(String[] args) throws MalformedURLException {
		URL location = new URL(wsdlLocation);
		String namespace = "http://uniba.de/dsg/jaxws/";
		QName serviceName = new QName(namespace, "HistoryService");
		Service service = Service.create(location, serviceName);
		QName portName = new QName(namespace, "HistoryPort");

		History proxy = service.getPort(portName, History.class);

		LocalDate start = new LocalDate(1949, 1, 1);
		LocalDate end = new LocalDate(2014, 1, 1);
		List<Chancellor> chancellors = proxy.getCancellors(start.toDate(), end.toDate());

        System.out.println("Accessing Web service...");
        System.out.println("Getting chancellors from " + start.getYear() + " to " + end.getYear());
        System.out.println();

		for(Chancellor c : chancellors) {
			System.out.println("Name: " + c.getName());
			System.out.println("Party: " + c.getParty());
			System.out.println("Tenure: " + c.getFrom() + " - " + c.getTo());
			System.out.println();
		}
	}
}