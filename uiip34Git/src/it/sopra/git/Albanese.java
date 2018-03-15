package it.sopra.git;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Albanese {

	public static void main(String[] args) {
		System.out.println("Ciao, sono Natalia Albanese");
		GregorianCalendar gc = new GregorianCalendar(1995, 12, 25);
		System.out.println(calcolaEta(gc));
	}
	
	//GregorianCalendar dataDiNascita--da mettere come parametro del metodo
	public static int calcolaEta(GregorianCalendar dataDiNascita) {

		int annoNascita = dataDiNascita.get(dataDiNascita.YEAR);
		
		GregorianCalendar gc = new GregorianCalendar();
		int anno = gc.get(Calendar.YEAR) ;
		
		return anno - annoNascita;
	}
	
}
