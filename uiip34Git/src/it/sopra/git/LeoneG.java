package it.sopra.git;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LeoneG
{
	public static String calcolaeta(GregorianCalendar dataNascita)
	{
		String result=null;
		GregorianCalendar dataOdierna=new GregorianCalendar();
		
		int mese=dataOdierna.get(GregorianCalendar.MONTH);
	    int meseNascita=dataNascita.getTime().getMonth();
		int anno=dataOdierna.get(GregorianCalendar.YEAR);
		int annoNascita=dataNascita.getTime().getYear();
		if(mese-meseNascita<0)
		{
		result="la mia eta è "+((anno-annoNascita)-1901)+" anni";
		}
		if(mese-meseNascita>=0)
		{
				result="la mia eta è "+((anno-annoNascita)-1900) +" anni";
		}
		return result;

		
	}

}
