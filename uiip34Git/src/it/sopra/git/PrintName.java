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
		System.out.println(myNameIs("Gianluca", "Cocco") + " "+ GianlucaCocco.calcolaEta() + " anni");
		System.out.println(myNameIs("Carla", "Ventre"));
		LocalDate birthDate = LocalDate.of(1992,06,19);
		System.out.println(myNameIs("Carla", "Ventre") + "," + Ventre.calcolaEta(birthDate,LocalDate.of(2018,03,15))+"anni");
		System.out.println(myNameIs("Daniele","D'angela") + "---" + Dangela.calcolaEta(LocalDate.of(1990, 9, 21)));
		System.out.println(myNameIs("Angelo", "Manganiello"));
		System.out.println(Maganiello.calcolaEta(new GregorianCalendar(1986,11,8)));
		System.out.println(myNameIs("Angelo", "Manganiello") + " " + Maganiello.calcolaEta(new GregorianCalendar(1986,11,8)));
		System.out.println(myNameIs("Eugenio", "Trodella") + " "+Trodella.calcolaEta());
		System.out.println(Ventre.calcolaEta(birthDate,LocalDate.of(2018,03,15))+"anni");
		System.out.println(myNameIs("Deborah", "Vinciguerra"));
	}
	
	private static String myNameIs(String nome, String cognome){
		return cognome+" "+nome;
		
	}
	
	


}
