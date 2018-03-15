/**
 * 
 */
package it.sopra.git;

<<<<<<< HEAD
import java.time.LocalDate;
=======
import java.util.GregorianCalendar;
>>>>>>> 215b9b0a6839288be3cb57e46c00f0e6232e49fe

/**
 * @author dvinciguerra
 *
 */
public class PrintName extends Ventre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<<<<<ELENCO ISCRITTI IN ORDINE ALFABETICO>>>>>>");
		System.out.println(myNameIs("Carla", "Ventre"));
		LocalDate birthDate = LocalDate.of(1992,06,19);
		System.out.println(calcolaEta(birthDate,LocalDate.of(2018,03,15))+"anni");
		System.out.println(myNameIs("Angelo", "Manganiello"));
		System.out.println(Maganiello.calcolaEta(new GregorianCalendar(1986,11,8)));

	}
	
	private static String myNameIs(String nome, String cognome){
		return cognome+" "+nome;
		
	}
	
	


}
