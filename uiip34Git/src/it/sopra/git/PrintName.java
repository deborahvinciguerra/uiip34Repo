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
	public static void main(String[] args) 
	{
		GregorianCalendar dataNascita = new GregorianCalendar(1988,6,28);
		LeoneG.calcolaeta(dataNascita);
		
	}
	

}
