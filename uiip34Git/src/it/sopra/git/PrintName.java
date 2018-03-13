/**
 * 
 */
package it.sopra.git;

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
		System.out.println(myNameIs("Daniele", "D'angela"));
		System.out.println(myNameIs("Deborah", "Vinciguerra"));
		System.out.println(myNameIs("Carla","Ventre"));
		
	}
	
	private static String myNameIs(String nome, String cognome){
		return cognome+" "+nome;
		
	}


}
