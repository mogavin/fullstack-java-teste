package br.com.mogav.lemontech.fixture;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public final class XMLCalendarFixture {

	/**
	 * Método auxiliar para converter um timestamp em uma instância de XMLGregorianCalendar.
	 * 
	 */
	public static final XMLGregorianCalendar converterParaXMLGregorianCalendar(Long timestamp){	
		try {
			GregorianCalendar data = new GregorianCalendar(); data.setTimeInMillis(timestamp);
			return DatatypeFactory.newInstance().newXMLGregorianCalendar(data);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
