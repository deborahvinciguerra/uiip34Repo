package it.sopra.git;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Maganiello {
	
	public static void main(String[] args) {
		System.out.println("Angelo Manganiello");
	}
	
	public static int calcolaEta(GregorianCalendar dataNascita) {
		Calendar calendar = new GregorianCalendar();
		int annoAttuale =calendar.get(Calendar.YEAR);		
		int annoNascita = dataNascita.get(dataNascita.YEAR);
		return annoAttuale-annoNascita;
	}

}
