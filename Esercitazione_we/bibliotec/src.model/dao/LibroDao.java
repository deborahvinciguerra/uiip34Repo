package dao;

import java.util.Vector;

import model.Libro;

public interface LibroDao {

	public Vector <Libro> visualizzaLbiri ();
	public Libro cercaLbiriTitolo (String titolo);
	public Vector <Libro> cercaLbiriAutore (String autore);
	public void prestaLibro (String titolo, String nome,String cognome,String indirizzo);
}
