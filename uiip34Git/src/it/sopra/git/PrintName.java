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
		System.out.println(myNameIs("Gianluca", "Cocco"));
		System.out.println(myNameIs("Angelo","Manganiello"));
		System.out.println(myNameIs("Eugenio","Trodella"));
		System.out.println(myNameIs("Deborah", "Vinciguerra"));

	}
	
	private static String myNameIs(String nome, String cognome){
		return cognome+" "+nome;
		
	}


}
