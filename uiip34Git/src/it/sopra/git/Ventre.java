package it.sopra.git;

import java.time.LocalDate;
import java.time.Period;

public class Ventre {

	public static void main(String[] args) {
		System.out.println("Carla Ventre");

	}
	

	
	public static int calcolaEta(LocalDate birthDate, LocalDate currentDate) {
        if ((birthDate != null) && (currentDate != null)) {
            return Period.between(birthDate, currentDate).getYears();
        } else {
            return 0;
        }
}
}
