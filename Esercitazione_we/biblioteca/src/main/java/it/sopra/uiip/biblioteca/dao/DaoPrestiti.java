package it.sopra.uiip.biblioteca.dao;

import java.sql.ResultSet;
import java.util.Vector;

import it.sopra.uiip.biblioteca.model.Libri;

public interface DaoPrestiti {
	public ResultSet ElencoLibriDisponibili();
	public int NumeroLibriPrestati(String titolo);
	public int ControllaDisponibilita(String titolo);
	public boolean PrestaLibro(String codFisc, int idLibro);
	
}
