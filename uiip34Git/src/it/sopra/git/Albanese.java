package it.sopra.git;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Albanese {

	public static void main(String[] args) {
		
	}
	
	//GregorianCalendar dataDiNascita--da mettere come parametro del metodo
	public static int calcolaEta(GregorianCalendar dataDiNascita) {

		int annoNascita = dataDiNascita.get(dataDiNascita.YEAR);
		
		GregorianCalendar gc = new GregorianCalendar();
		int anno = gc.get(Calendar.YEAR) ;
		
		return anno - annoNascita;
	}
	
}
