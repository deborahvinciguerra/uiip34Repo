package it.sopra.git;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Farinaccio {

	public static void main(String[] args) {

		String nome = "Francesca";
		String cognome = "Farinaccio";

		System.out.println( nome + " " + cognome);
		
	}
	
	
	public static int calcolaEta() {
		
		 int annoNascita = 1993;
		    
		int year = Calendar.getInstance().get(Calendar.YEAR);
		
		return ( year - annoNascita);

}
}git 