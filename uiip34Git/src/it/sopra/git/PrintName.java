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

		System.out.println(myNameIs("Natalia", "Albanese"));
		System.out.println(myNameIs("Daniele", "D'angela"));
		System.out.println(myNameIs("Francesca","Farinaccio"));
		System.out.println(myNameIs("Andrea", "Franza"));
		System.out.println(myNameIs("Gian Luigi", "Leone"));
		System.out.println(myNameIs("Carla","Ventre"));
		System.out.println(myNameIs("Deborah", "Vinciguerra"));
	}
	
	private static String myNameIs(String nome, String cognome){
		return cognome+" "+nome;
		
	}


}
