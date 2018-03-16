package it.sopra.git;

import java.time.*;
import java.util.*;

public class Franza {

	String nome = "Andrea";
	String cognome = "Franza";
	
	public static void main(String[] args)
	{
		System.out.println("Il mio nome è Andrea Franza");
	}
	
	public static int calcolaEta (int anno, int mese, int giorno)
	{
		Date date = new Date();
		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int year = localDate.getYear();
		int month = localDate.getMonthValue();
		int day = localDate.getDayOfMonth();
		
		int eta = (year+(month-1+day/30)/10) - (anno+(mese-1+giorno/30)/10); 
		
		return eta;
	}
}
