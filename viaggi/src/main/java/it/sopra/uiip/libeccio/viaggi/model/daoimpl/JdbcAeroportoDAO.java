package it.sopra.uiip.libeccio.viaggi.model.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.libeccio.viaggi.model.Aeroporto;
import it.sopra.uiip.libeccio.viaggi.model.dao.AeroportoDAO;

public class JdbcAeroportoDAO implements AeroportoDAO {

	public void insert(Aeroporto aeroporto) {
		Connection conn = null;
		Statement stm = null;
		try {
			conn = ConnectionManager.getConnection();
			stm = conn.createStatement();
			String query = "INSERT INTO aeroporto VALUE ("+aeroporto.getCitta()+","+
			aeroporto.getNazione()+","+aeroporto.getPiste()+")";			
			stm.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public Aeroporto selectByCitta(String citta) {
		Connection conn = null;
		Statement stm = null ;
		ResultSet rs = null;
		String query = "SELECT * FROM aeroporto WHERE citta="+citta;
		try {
			rs = stm.executeQuery(query);
			if (rs.next() ) {
				String cit = rs.getString("citta");
				String naz =rs.getString("nazione");
				int pis = rs.getInt("npiste");
				return new Aeroporto(cit,naz,pis) ;
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		

	}

	public void update(String citta, Aeroporto aeroporto) {
		Connection conn = null;
		Statement stm = null;
		try {
			conn = ConnectionManager.getConnection();
			stm = conn.createStatement();
			String query = "UPDATE aeroporto SET(citta="+aeroporto.getCitta()+
					",nazione="+aeroporto.getNazione()+
					",npiste="+aeroporto.getPiste()+"where citta="+aeroporto.getCitta();			
			stm.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
