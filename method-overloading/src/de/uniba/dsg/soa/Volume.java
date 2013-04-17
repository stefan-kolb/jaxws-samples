package de.uniba.dsg.soa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * Method overloading is not recommended when using Web Services!
 * This is just a proof of concept!
**/
@WebService
public class Volume {
	/**
	 * Volume of a cube
	**/
	@WebMethod(operationName="volumeCube")
	@RequestWrapper(className="de.uniba.dsg.soa.volumeCube")
	@ResponseWrapper(className="de.uniba.dsg.soa.volumeCubeResponse")
	@WebResult(name="volume")
	public int volume(@WebParam(name="side") int s) {
    return s*s*s;
	}
	
	/**
	 * Volume of a cylinder
	**/
 	@WebMethod(operationName="volumeCylinder")
	@RequestWrapper(className="de.uniba.dsg.soa.volumeCylinder")
	@ResponseWrapper(className="de.uniba.dsg.soa.volumeCylinderResponse")
	@WebResult(name="volume")
	public double volume(@WebParam(name="radius") double r, @WebParam(name="height") int h) {
    return 3.14*r*r*h;
	}

	/**
	 * Volume of a cuboid
	**/
 	@WebMethod(operationName="volumeCuboid")
	@RequestWrapper(className="de.uniba.dsg.soa.volumeCuboid")
	@ResponseWrapper(className="de.uniba.dsg.soa.volumeCuboidResponse")
	@WebResult(name="volume")
	public long volume(@WebParam(name="length") long l, @WebParam(name="width") int b, @WebParam(name="height") int h) {
    return l*b*h;
	}
}