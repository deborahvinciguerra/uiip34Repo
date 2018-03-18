import java.sql.Connection;
import java.util.ArrayList;
package it.sopra.uiip.biblioteca.dao;
public interface DAOLibro {

	//restituisce tutti i libri presenti nel DB
	public ArrayList<Libro> getAllLibro(Connection c);
	//inserisce un libro nel DB
	public void addLibro(Connection c);
	public void visualizzaLibriDisponibili(Connection c);
	public void ricercaPerTitolo(Connection c);
	public void ricercaPerAutore(Connection c);
	public void prestitoLibro(Connection c);
}
