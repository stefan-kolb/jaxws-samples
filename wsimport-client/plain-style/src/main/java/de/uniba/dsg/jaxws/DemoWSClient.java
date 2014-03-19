package de.uniba.dsg.jaxws;

import de.uniba.dsg.jaxws.HistoryService;
import de.uniba.dsg.jaxws.History;
import de.uniba.dsg.jaxws.Cancellor;
import de.uniba.dsg.jaxws.GetCancellorsResponse;
import de.uniba.dsg.jaxws.GetCancellors;
import de.uniba.dsg.jaxws.ObjectFactory;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.GregorianCalendar;
import java.io.IOException;
import java.util.List;

public class DemoWSClient {
	public static void main(String[] args) throws DatatypeConfigurationException, IOException {
		// Parameters
		GregorianCalendar start = new GregorianCalendar(1949, 0, 1);
		GregorianCalendar end = new GregorianCalendar(2014, 0, 1);
		XMLGregorianCalendar from = DatatypeFactory.newInstance().newXMLGregorianCalendar(start);
		XMLGregorianCalendar to = DatatypeFactory.newInstance().newXMLGregorianCalendar(end);
		// Input message
		GetCancellors in = new ObjectFactory().createGetCancellors();
		in.setFrom(from);
		in.setTo(to);
		// Output message
		History historyService = new HistoryService().getHistoryPort();
		GetCancellorsResponse out = historyService.getCancellors(in);
		List<Cancellor> cancellors = out.getCancellor();

        System.out.println("Accessing Web service...");
        System.out.println("Getting cancellors from " + from.getYear() + " to " + to.getYear());
        System.out.println();

		for(Cancellor c : cancellors) {
			System.out.println("Name: " + c.getName());
			System.out.println("Party: " + c.getParty());
			System.out.println("Tenure: " + c.getFrom().getMonth() + "/" + c.getFrom().getYear() + "-" + c.getTo().getMonth() + "/" + c.getTo().getYear());
			System.out.println();
		}
	}
}