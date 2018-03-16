package it.sopra.uiip.viaggi.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import it.sopra.uiip.viaggi.model.Aereo;
import it.sopra.uiip.viaggi.model.Aeroporto;
import it.sopra.uiip.viaggi.model.Volo;

public interface DaoAereo {
	public Vector <Aereo> getAllAereo(Connection c);
	public void addAereo (Connection c);
	
}
