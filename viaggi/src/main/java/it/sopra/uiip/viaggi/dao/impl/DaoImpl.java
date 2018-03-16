package it.sopra.uiip.viaggi.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import it.sopra.uiip.viaggi.model.*;

public class DaoImpl {
	public static Vector<Aereo> getAereo(Connection conn) {
		
		Vector<Aereo> lista_aereo = new Vector<Aereo>(); 
		try {
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from aereo");
			
			while (rs.next()) {
				lista_aereo.add(new Aereo(rs.getString(1),rs.getInt(2),rs.getInt(3)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lista_aereo;
	}
}
