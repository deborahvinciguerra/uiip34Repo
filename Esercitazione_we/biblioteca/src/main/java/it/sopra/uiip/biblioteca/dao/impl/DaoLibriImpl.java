package it.sopra.uiip.biblioteca.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import it.sopra.uiip.biblioteca.DbAccess;
import it.sopra.uiip.biblioteca.dao.DaoLibri;
import it.sopra.uiip.biblioteca.model.Libri;

public class DaoLibriImpl implements DaoLibri {

	public Libri ricercaLibroPerTitolo(String titolo) {
		DbAccess db = new DbAccess();
		Libri l = new Libri();
		try {
			Statement s = db.connect().createStatement();
			ResultSet rs = s.executeQuery("select * from libri where titolo = '"+titolo+"'");
			if(rs.next()) {
				l = new Libri(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return l;
		
	}

	public Vector<Libri> ricercaLibroPerAutore(String autore) {
		DbAccess db = new DbAccess();
		Vector<Libri> lista = new Vector<Libri>();
		try {
			Statement s = db.connect().createStatement();
			ResultSet rs = s.executeQuery("select * from libri where autori like '%"+autore+"%'");
			while(rs.next()) {
				lista.add(new Libri(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}
