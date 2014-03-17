package de.uniba.dsg.jaxws;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.joda.time.LocalDate;
import org.joda.time.DateTime;
import org.joda.time.Interval;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService
public class History {
	private List<Cancellor> cancellors;
	
	public History() {
		cancellors = new ArrayList<Cancellor>();
		
		cancellors.add(new Cancellor("Konrad Adenauer", "CDU", new LocalDate(1949, 9, 15).toDate(), new LocalDate(1963, 10, 16).toDate()));
		cancellors.add(new Cancellor("Ludwig Erhard", "CDU", new LocalDate(1963, 10, 16).toDate(), new LocalDate(1966, 12, 1).toDate()));
		cancellors.add(new Cancellor("Kurt Geord Kiesinger", "CDU", new LocalDate(1966, 12, 1).toDate(), new LocalDate(1969, 10, 21).toDate()));
		cancellors.add(new Cancellor("Willy Brandt", "SPD", new LocalDate(1969, 10, 21).toDate(), new LocalDate(1974, 5, 7).toDate()));
		cancellors.add(new Cancellor("Helmut Schmidt", "SPD", new LocalDate(1974, 5, 16).toDate(), new LocalDate(1982, 10, 1).toDate()));
		cancellors.add(new Cancellor("Helmut Kohl", "CDU", new LocalDate(1982, 10, 1).toDate(), new LocalDate(1998, 10, 27).toDate()));
		cancellors.add(new Cancellor("Gerhard Schröder", "SPD", new LocalDate(1998, 10, 27).toDate(), new LocalDate(2005, 11, 22).toDate()));
		cancellors.add(new Cancellor("Angela Merkel", "CDU", new LocalDate(2005, 11, 22).toDate(), new LocalDate().toDate()));
	}
	
	@WebMethod
	public List<Cancellor> getCancellors(@WebParam(name="from") Date from, @WebParam(name="to") Date to) throws IllegalArgumentException {
		if(from == null || to == null) {
			throw new IllegalArgumentException("Dates should not be null!");
		}
		
		ArrayList<Cancellor> active = new ArrayList<Cancellor>();
		Interval interval = new Interval(new DateTime(from), new DateTime(to));
		
		for(Cancellor c : cancellors) {
			if(interval.overlap(new Interval(new DateTime(c.getFrom()), new DateTime(c.getTo()))) != null) {
				active.add(c);
			}
		}
		return active;
	}
	
	@WebMethod(exclude=true)
	public List<Cancellor> getAll() {
		return cancellors;
	}
}