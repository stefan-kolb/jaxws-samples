package de.uniba.dsg.jaxws;

import java.util.Date;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://uniba.de/dsg/jaxws/")
public interface History {
	@WebMethod
	@WebResult(name="chancellor")
	List<Chancellor> getChancellors(@WebParam(name="from") Date from, @WebParam(name="to") Date to) throws IllegalArgumentException;
}