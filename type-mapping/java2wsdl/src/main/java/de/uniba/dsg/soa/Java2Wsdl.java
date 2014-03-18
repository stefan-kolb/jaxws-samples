package de.uniba.dsg.soa;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

import de.uniba.dsg.soa.Rating;

import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Calendar;
import java.util.Date;
import java.util.Collection;

@WebService(targetNamespace="http://uniba.de/dsg/soa/")
public class Java2Wsdl {
	@WebMethod
	@WebResult(name="primitive")
	public byte getByte(@WebParam(name="primitive") byte b) {
		return b;
	}
	
	@WebMethod
	@WebResult(name="primitive")
	public short getShort(@WebParam(name="primitive") short s) {
		return s;
	}
	
	@WebMethod
	@WebResult(name="primitive")
	public int getInteger(@WebParam(name="primitive") int i) {
		return i;
	}
	
	@WebMethod
	@WebResult(name="primitive")
	public long getLong(@WebParam(name="primitive") long l) {
		return l;
	}
	
	@WebMethod
	@WebResult(name="primitive")
	public float getFloat(@WebParam(name="primitive") float f) {
		return f;
	}
	
	@WebMethod
	@WebResult(name="primitive")
	public double getDouble(@WebParam(name="primitive") double d) {
		return d;
	}
	
	@WebMethod
	@WebResult(name="primitive")
	public boolean getBoolean(@WebParam(name="primitive") boolean b) {
		return b;
	}
	
	@WebMethod
	@WebResult(name="primitive")
	public char getChar(@WebParam(name="primitive") char c) {
		return c;
	}
	
	@WebMethod
	@WebResult(name="standard")
	public String getString(@WebParam(name="standard") String s) {
		return s;
	}
	
	@WebMethod
	@WebResult(name="standard")
	public BigInteger getBigInteger(@WebParam(name="standard") BigInteger b) {
		return b;
	}
	
	@WebMethod
	@WebResult(name="standard")
	public BigDecimal getBigDecimal(@WebParam(name="standard") BigDecimal b) {
		return b;
	}
	
	@WebMethod
	@WebResult(name="standard")
	public Calendar getCalendar(@WebParam(name="standard") Calendar c) {
		return c;
	}
	
	@WebMethod
	@WebResult(name="standard")
	public Date getDate(@WebParam(name="standard") Date d) {
		return d;
	}
	
	@WebMethod
	@WebResult(name="standard")
	public Rating getEnumeration(@WebParam(name="standard") Rating r) {
		return r;
	}
	
	@WebMethod
	@WebResult(name="standard")
	public Collection<String> getCollection(@WebParam(name="standard") Collection<String> c) {
		return c;
	}
	
	@WebMethod
	@WebResult(name="standard")
	public Map<String, String> getMap(@WebParam(name="standard") Map<String, String> m) {
		return m;
	}
}