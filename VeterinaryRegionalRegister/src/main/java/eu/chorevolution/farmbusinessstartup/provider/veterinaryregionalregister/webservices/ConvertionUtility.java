package eu.chorevolution.farmbusinessstartup.provider.veterinaryregionalregister.webservices;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class ConvertionUtility {

	public static XMLGregorianCalendar date2XMLGregorianCalendar(Date date) {

		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(date.getTime());
		XMLGregorianCalendar xmlGregorianCalendar;
		try {
			xmlGregorianCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gc);
			return xmlGregorianCalendar;
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}

		return null;
	}

}
