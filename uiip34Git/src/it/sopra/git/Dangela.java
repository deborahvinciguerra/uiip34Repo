package it.sopra.git;

import java.time.LocalDate;
import java.time.Period;


public class Dangela {
	
	
	public static int calcolaEta(LocalDate dataNascita) {
		LocalDate currentDate = LocalDate.now();
		
		return Period.between(dataNascita, currentDate).getYears();
	
	}

}
