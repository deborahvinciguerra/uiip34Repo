package it.sopra.git;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Franza {

	String nome = "Andrea";
	String cognome = "Franza";
	
	public static void main(String[] args)
	{
		System.out.println("Il mio nome è Andrea Franza");
	}
	
	public static String calcolaEta (int anno, int mese, int giorno)
	{
		Date oggi = new GregorianCalendar(anno, mese, anno).getTime();
		Date nascita = new GregorianCalendar(1991, 7, 23).getTime();
		Long eta = nascita.getTime() - oggi.getTime();
		eta = eta/(1000*60*60*24*365);
		return eta.toString();
	}
}
