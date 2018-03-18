package it.sopra.uiip.biblioteca.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.biblioteca.DbAccess;
import it.sopra.uiip.biblioteca.dao.DaoLettori;

public class DaoLettoriImpl implements DaoLettori{

	@Override
	public boolean ControllaLettore(String codiceFiscale) {
		boolean found = false;
		DbAccess db = new DbAccess();
		try {
			Statement s = db.connect().createStatement();
			ResultSet rs = s.executeQuery("select codiceFiscale from lettori where codiceFiscale ='" +codiceFiscale+"'");
			if (rs.next())
				found = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return found;
	}
	
}
