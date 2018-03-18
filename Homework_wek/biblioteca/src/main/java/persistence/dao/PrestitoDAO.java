package persistence.dao;

import java.util.List;

/*
 * Interfaccia che definisce le query sulla tabella Prestito
 * 
 */

import model.Prestito;

public interface PrestitoDAO {
	
	public List<Prestito> doRetrieveAll();
	
	public void save(Prestito prestito);
	
	public int countPrestati(String titolo);
	
	public void delete(Prestito prestito);

}
