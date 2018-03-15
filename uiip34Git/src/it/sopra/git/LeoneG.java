package it.sopra.git;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class LeoneG
{
	public static void calcolaeta(GregorianCalendar dataNascita)
	{
		GregorianCalendar dataOdierna=new GregorianCalendar();
		/*int giorno=dataOdierna.get(GregorianCalendar.DAY_OF_WEEK);
	    int giornoNascita=dataNascita.getTime().getDay();*/
		int mese=dataOdierna.get(GregorianCalendar.MONTH);
	    int meseNascita=dataNascita.getTime().getMonth();
		int anno=dataOdierna.get(GregorianCalendar.YEAR);
		int annoNascita=dataNascita.getTime().getYear();
		if(mese-meseNascita<0)
		{
		System.out.println("la mia eta è "+((anno-annoNascita)-1901)+" anni");
		}
		if(mese-meseNascita>=0)
		{
				System.out.println("la mia eta è "+((anno-annoNascita)-1900) +" anni");
		}
		

		
	}

}
