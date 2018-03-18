package persistence.dao;

import java.util.List;

/*
 * Interfaccia che definisce le query sulla tabella Autore
 * 
 */

import model.Autore;

public interface AutoreDAO {

	public List<Autore> doRetrieveAll();

	public Autore doRetrieveById(int id);
	
	public Autore doRetrieveByName(String nome,String cognome);

	public void save(Autore autore);
	
	public List<Autore> doRetrieveByLibro(String codice);
}
