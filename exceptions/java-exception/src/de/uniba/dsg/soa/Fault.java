package de.uniba.dsg.soa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import de.uniba.dsg.soa.VerificationException;

@WebService
public class Fault {
	
	@WebMethod
	public String verify(@WebParam(name="input") String input) throws VerificationException {
		throw new VerificationException("Cannot verify the input string!", new Exception("cause"));
	}
}