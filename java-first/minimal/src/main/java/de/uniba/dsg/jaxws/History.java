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
	private List<Chancellor> chancellors;
	
	public History() {
		chancellors = new ArrayList<Chancellor>();
		
		chancellors.add(new Chancellor("Konrad Adenauer", "CDU", new LocalDate(1949, 9, 15).toDate(), new LocalDate(1963, 10, 16).toDate()));
		chancellors.add(new Chancellor("Ludwig Erhard", "CDU", new LocalDate(1963, 10, 16).toDate(), new LocalDate(1966, 12, 1).toDate()));
		chancellors.add(new Chancellor("Kurt Geord Kiesinger", "CDU", new LocalDate(1966, 12, 1).toDate(), new LocalDate(1969, 10, 21).toDate()));
		chancellors.add(new Chancellor("Willy Brandt", "SPD", new LocalDate(1969, 10, 21).toDate(), new LocalDate(1974, 5, 7).toDate()));
		chancellors.add(new Chancellor("Helmut Schmidt", "SPD", new LocalDate(1974, 5, 16).toDate(), new LocalDate(1982, 10, 1).toDate()));
		chancellors.add(new Chancellor("Helmut Kohl", "CDU", new LocalDate(1982, 10, 1).toDate(), new LocalDate(1998, 10, 27).toDate()));
		chancellors.add(new Chancellor("Gerhard Schroeder", "SPD", new LocalDate(1998, 10, 27).toDate(), new LocalDate(2005, 11, 22).toDate()));
		chancellors.add(new Chancellor("Angela Merkel", "CDU", new LocalDate(2005, 11, 22).toDate(), new LocalDate().toDate()));
	}
	
	@WebMethod
	public List<Chancellor> getChancellors(@WebParam(name="from") Date from, @WebParam(name="to") Date to) throws IllegalArgumentException {
		if(from == null || to == null) {
			throw new IllegalArgumentException("Dates should not be null!");
		}
		
		ArrayList<Chancellor> active = new ArrayList<Chancellor>();
		Interval interval = new Interval(new DateTime(from), new DateTime(to));
		
		for(Chancellor c : chancellors) {
			if(interval.overlap(new Interval(new DateTime(c.getFrom()), new DateTime(c.getTo()))) != null) {
				active.add(c);
			}
		}
		return active;
	}
	
	@WebMethod(exclude=true)
	public List<Chancellor> getAll() {
		return chancellors;
	}
}