/**
 * 
 */
package it.sopra.git;

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
		System.out.println(myNameIs("Angelo", "Manganiello"));
		System.out.println(Maganiello.calcolaEta(new GregorianCalendar(1986,11,8)));
		System.out.println(myNameIs("Eugenio", "Trodella") + " "+Trodella.calcolaEta());
		System.out.println(myNameIs("Deborah", "Vinciguerra"));
		

		

	}
	
	private static String myNameIs(String nome, String cognome){
		return cognome+" "+nome;
		
	}


}
