package it.sopra.git;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GianlucaCocco {

	public static void main(String[] args) {
		
			}
	public static int calcolaEta() {
		
		
	String nome = "Gianluca";
	String cognome = "Cocco";
    int annoNascita = 1991;
	
	
	/*GregorianCalendar calendar=new GregorianCalendar(TimeZone.getDefault());
	System.out.println(new SimpleDateFormat().format(Calendar.getInstance().getTime()));
	*/
	
	
    
	int year = Calendar.getInstance().get(Calendar.YEAR);
//	System.out.println("La mia età è \n" + (year - annoNascita) + " anni");
	
	return ( year - annoNascita);
	
	}
	
}
