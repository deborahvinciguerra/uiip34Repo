/**
 * 
 */
package it.sopra.git;

import java.time.LocalDate;

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
	}
	
	private static String myNameIs(String nome, String cognome){
		return cognome+" "+nome;
		
	}
	
	


}
