/**
 * 
 */
package it.sopra.git;

import java.time.LocalDate;
import java.util.GregorianCalendar;

/**
 * @author dvinciguerra
 *
 */
public class PrintName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<<<<ELENCO ISCRITTI IN ORDINE ALFABETICO>>>>>>");
		System.out.println(myNameIs("Carla", "Ventre"));
		LocalDate birthDate = LocalDate.of(1992,06,19);
		System.out.println(Ventre.calcolaEta(birthDate,LocalDate.of(2018,03,15))+"anni");
		System.out.println(myNameIs("Angelo", "Manganiello"));
		System.out.println(Maganiello.calcolaEta(new GregorianCalendar(1986,11,8)));
<<<<<<< HEAD
<<<<<<< HEAD
		System.out.println(myNameIs("Eugenio", "Trodella") + " "+Trodella.calcolaEta());
		System.out.println(myNameIs("Deborah", "Vinciguerra"));
		

		
=======
>>>>>>> 73095fd923fbb8d291a704356aeb1afb42dc7a28

=======
>>>>>>> 868dc1700073263195f7e15474dfd4ff646de466
	}
	
	private static String myNameIs(String nome, String cognome){
		return cognome+" "+nome;
		
	}
	
	


}
