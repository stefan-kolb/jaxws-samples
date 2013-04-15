package de.uniba.dsg.soa;

import de.uniba.dsg.soa.HistoryService;
import de.uniba.dsg.soa.History;
import de.uniba.dsg.soa.Cancellor;
import de.uniba.dsg.soa.GetCancellorsResponse;
import de.uniba.dsg.soa.GetCancellors;
import de.uniba.dsg.soa.ObjectFactory;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.DatatypeConfigurationException;
import java.util.GregorianCalendar;
import java.io.IOException;
import java.util.List;

public class DemoWSClient {
	public static void main(String[] args) throws DatatypeConfigurationException, IOException {
		// Vars 
		GregorianCalendar start = new GregorianCalendar(1949, 1, 1);
		GregorianCalendar end = new GregorianCalendar(2013, 1, 1);
		XMLGregorianCalendar from = DatatypeFactory.newInstance().newXMLGregorianCalendar(start);
		XMLGregorianCalendar to = DatatypeFactory.newInstance().newXMLGregorianCalendar(end);
		// Input Message
		GetCancellors in = new ObjectFactory().createGetCancellors();
		in.setFrom(from);
		in.setTo(to);
		
		History historyService = new HistoryService().getHistoryPort();
		GetCancellorsResponse out = historyService.getCancellors(in);
		List<Cancellor> cancellors = out.getCancellor();
		
		for(Cancellor c : cancellors) {
			System.out.println("Name: " + c.getName());
			System.out.println("Party: " + c.getParty());
			System.out.println("Tenure: " + c.getFrom().getMonth() + "/" + c.getFrom().getYear() + "-" + c.getTo().getMonth() + "/" + c.getTo().getYear());
			System.out.println();
		}
		
		System.in.read();
		System.exit(0);
	}
}