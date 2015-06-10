package de.uniba.dsg.jaxws;

import org.joda.time.DateTime;
import org.joda.time.Interval;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebService(targetNamespace = "http://uniba.de/dsg/jaxws/")
public class History {
	private final List<Cancellor> cancellors = getCancellors();

	private List<Cancellor> getCancellors() {
		return Arrays.asList(
				new Cancellor("Konrad Adenauer", "CDU", toDate(java.time.LocalDate.of(1949, 9, 15)), toDate(java.time.LocalDate.of(1963, 10, 16))),
				new Cancellor("Ludwig Erhard", "CDU", toDate(java.time.LocalDate.of(1963, 10, 16)), toDate(java.time.LocalDate.of(1966, 12, 1))),
				new Cancellor("Kurt Geord Kiesinger", "CDU", toDate(java.time.LocalDate.of(1966, 12, 1)), toDate(java.time.LocalDate.of(1969, 10, 21))),
				new Cancellor("Willy Brandt", "SPD", toDate(java.time.LocalDate.of(1969, 10, 21)), toDate(java.time.LocalDate.of(1974, 5, 7))),
				new Cancellor("Helmut Schmidt", "SPD", toDate(java.time.LocalDate.of(1974, 5, 16)), toDate(java.time.LocalDate.of(1982, 10, 1))),
				new Cancellor("Helmut Kohl", "CDU", toDate(java.time.LocalDate.of(1982, 10, 1)), toDate(java.time.LocalDate.of(1998, 10, 27))),
				new Cancellor("Gerhard Schroeder", "SPD", toDate(java.time.LocalDate.of(1998, 10, 27)), toDate(java.time.LocalDate.of(2005, 11, 22))),
				new Cancellor("Angela Merkel", "CDU", toDate(java.time.LocalDate.of(2005, 11, 22)), toDate(java.time.LocalDate.now()))
		);
	}

	private Date toDate(java.time.LocalDate ld) {
		Instant instant = ld.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant();
		return Date.from(instant);
	}

	@WebMethod
	@WebResult(name = "cancellor")
	public List<Cancellor> getCancellors(@WebParam(name = "from") Date from, @WebParam(name = "to") Date to) throws IllegalArgumentException {
		if (from == null || to == null) {
			throw new IllegalArgumentException("Dates should not be null!");
		}

		ArrayList<Cancellor> active = new ArrayList<>();
		Interval interval = new Interval(new DateTime(from), new DateTime(to));

		for (Cancellor c : cancellors) {
			if (interval.overlap(new Interval(new DateTime(c.getFrom()), new DateTime(c.getTo()))) != null) {
				active.add(c);
			}
		}
		return active;
	}

	@WebMethod(exclude = true)
	public List<Cancellor> getAll() {
		return cancellors;
	}
}