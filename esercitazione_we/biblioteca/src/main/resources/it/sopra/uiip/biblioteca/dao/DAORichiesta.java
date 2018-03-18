import java.sql.Connection;
package it.sopra.uiip.biblioteca.dao;
public interface DAORichiesta {

	public ArrayList<Richiesta> getAllRichiesta(Connection c);
	public void addRichiesta(Connection c);
}
