package it.sopra.uiip.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAO {
	public static void insertAereo(Connection conn) {
		try {
			Statement s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from aereo");
			
			while (rs.next()) {
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
