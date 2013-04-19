package de.uniba.dsg.soa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import de.uniba.dsg.soa.VerificationFault;
import de.uniba.dsg.soa.VerificationFaultBean;

@WebService
public class Fault {
	
	@WebMethod
	public String verify(@WebParam(name="input") String input) throws VerificationFault {
	    VerificationFaultBean faultBean = new VerificationFaultBean();
      faultBean.setMessage("Input String is too long.");
      throw new VerificationFault("An error occured while validating the input parameters.", faultBean);
	}
}