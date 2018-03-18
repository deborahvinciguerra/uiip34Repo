package persistence.dao;

import java.util.List;

/*
 * Interfaccia che definisce le query sulla tabella Libro
 * 
 */

import model.Libro;

public interface LibroDAO {

	public List<Libro> doRetrieveAll();
	
	public Libro doRetrieveByCodice(String codice);
	
	public List<Libro> doRetrieveByAutore (int id);
	
	public List<Libro> doRetrieveByTitolo (String titolo);
	
	public void updateCopie(String codice,int n);
	
	public void save(Libro libro);
}
