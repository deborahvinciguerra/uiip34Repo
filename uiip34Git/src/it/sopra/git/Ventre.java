package it.sopra.git;

import java.time.LocalDate;
import java.time.Period;

public class Ventre {

	public static void main(String[] args) {
		System.out.println("Carla Ventre");

	}
	
	
	/*public static void calcolaEta (GregorianCalendar dataNascita) {
		int eta=0;
		int giorno =19;
		int mese=06;
		int anno=1992;
		dataNascita = new GregorianCalendar(giorno,mese,anno);
		GregorianCalendar now = new GregorianCalendar();
		eta=(now.get(GregorianCalendar.YEAR) - dataNascita.get(GregorianCalendar.YEAR));
	}*/

	
	public static int calcolaEta(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
}
}
