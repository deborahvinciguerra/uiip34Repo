package it.sopra.uiip.viaggi.dao;

import java.sql.Connection;
import java.util.Vector;

import it.sopra.uiip.viaggi.model.Volo;

public interface DaoVolo {
	public void addVolo (Connection c);
	public Vector <Volo> getAllVolo();

}
