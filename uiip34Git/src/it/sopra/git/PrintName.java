/**
 * 
 */
package it.sopra.git;

import java.time.LocalDate;

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
		System.out.println(myNameIs("Daniele","D'angela") + "---" + Dangela.calcolaEta(LocalDate.of(1990, 9, 21)));
		System.out.println(myNameIs("Deborah", "Vinciguerra"));
		
		
	}
	
	private static String myNameIs(String nome, String cognome){
		return cognome+" "+nome;
		
	}


}
