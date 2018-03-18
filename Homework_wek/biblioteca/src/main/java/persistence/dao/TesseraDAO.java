package persistence.dao;

import java.util.List;

/*
 * Interfaccia che definisce le query sulla tabella Tessera
 * 
 */

import model.Tessera;

public interface TesseraDAO  {

	public List<Tessera> doRetrieveAll();

	public Tessera doRetrieveById(int id);

	public void save(Tessera tessera);
}
