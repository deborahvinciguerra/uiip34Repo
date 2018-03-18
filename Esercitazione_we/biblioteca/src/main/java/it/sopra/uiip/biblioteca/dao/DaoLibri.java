package it.sopra.uiip.biblioteca.dao;

import java.util.Vector;

import it.sopra.uiip.biblioteca.model.Libri;

public interface DaoLibri {
	public Libri ricercaLibroPerTitolo(String titolo);
	public Vector<Libri> ricercaLibroPerAutore(String autore);
}
