package it.sopra.uiip.viaggi.dao;

import java.sql.Connection;
import java.util.Vector;

import it.sopra.uiip.viaggi.model.Aereo;
import it.sopra.uiip.viaggi.model.Aeroporto;
import it.sopra.uiip.viaggi.model.Volo;

public interface Dao {
	public Vector <Aereo> getAllAereo();
	public Vector <Volo> getAllVolo();
	public Vector <Aeroporto> getAllAeroporto();
	public void addAereo (Connection c);
	public void addVolo (Connection c);
	public void addAeroporto (Connection c);
	
}
