package it.sopra.uiip.biblioteca.dao;
import java.sql.Connection;

public interface DAOLettore {
	
	public ArrayList<Lettore> getAllLettore(Connection c);
	public void addLettore(Connection c);
}
