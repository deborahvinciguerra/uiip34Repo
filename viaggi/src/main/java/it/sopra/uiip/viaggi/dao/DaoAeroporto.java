package it.sopra.uiip.viaggi.dao;

import java.sql.Connection;
import java.util.Vector;

import it.sopra.uiip.viaggi.model.Aeroporto;

public interface DaoAeroporto {
	public Vector <Aeroporto> getAllAeroporto();
	public void addAeroporto (Connection c);

}
