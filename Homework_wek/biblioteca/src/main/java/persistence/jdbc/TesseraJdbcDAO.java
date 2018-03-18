package persistence.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import model.Tessera;
import persistence.dao.TesseraDAO;
import util.JDBCManager;

public class TesseraJdbcDAO implements TesseraDAO {

	/*
	 *  Restituisce la lista di utenti della biblioteca
	 */
	public List<Tessera> doRetrieveAll() {
		Connection conn = null;
		List<Tessera> tessere = new Vector<Tessera>();
		
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM tessera";
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				Tessera tessera = new Tessera(rs.getInt("id"),rs.getString("nome"),rs.getString("cognome"),rs.getString("indirizzo"));
				tessere.add(tessera);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossibile trovare i driver per la connessione al database");
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return tessere;
	}

	/*
	 *  Restituisce l'utente associato ad un determinato id
	 */
	public Tessera doRetrieveById(int id) {
		Connection conn = null;
		Tessera tessera = null;
		
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM tessera WHERE id="+id;
			ResultSet rs = stm.executeQuery(query);
			if(rs.next()) {
				tessera = new Tessera(rs.getInt("id"),rs.getString("nome"),rs.getString("cognome"),rs.getString("indirizzo"));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossibile trovare i driver per la connessione al database");
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return tessera;
	}

	/*
	 *  Inserisce un nuovo utente all'interno del database
	 */
	public void save(Tessera tessera) {
		Connection conn = null;
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "INSERT INTO tessera(id,nome,cognome,indirizzo) VALUES("+
			tessera.getId()+",'"+tessera.getNome()+"','"+tessera.getCognome()+"','"+tessera.getIndirizzo()+"')";
			stm.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossibile trovare i driver per la connessione al database");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
