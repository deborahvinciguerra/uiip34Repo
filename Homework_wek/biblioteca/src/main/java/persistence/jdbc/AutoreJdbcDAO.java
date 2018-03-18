package persistence.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import model.Autore;
import persistence.dao.AutoreDAO;
import util.JDBCManager;

public class AutoreJdbcDAO implements AutoreDAO {
	
	/*
	 * Restituisce la lista di tutti gli autori presenti nel database
	*/
	public List<Autore> doRetrieveAll() {
		Connection conn = null;
		List<Autore> autori = new Vector<Autore>();
		
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM autore";
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				Autore autore = new Autore(rs.getInt("id"),rs.getString("nome"),rs.getString("cognome"));
				autori.add(autore);
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
		return autori;
	}

	/*
	 * Restituisce l'autore in base al suo identificativo
	*/
	public Autore doRetrieveById(int id) {
		Connection conn = null;
		Autore autore = null;
		
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM autore WHERE id="+id;
			ResultSet rs = stm.executeQuery(query);
			if(rs.next()) {
				autore = new Autore(rs.getInt("id"),rs.getString("nome"),rs.getString("cognome"));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossibile trovare i driver per la connessione al database");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();;
		}
		return autore;
	}
	
	/*
	 * Inserisce un nuovo autore all'interno del datbase
	*/
	public void save(Autore autore) {
		Connection conn = null;
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "INSERT INTO autore(id,nome,cognome) VALUES("+
			autore.getId()+",'"+autore.getNome()+"','"+autore.getCognome()+"')";
			stm.executeUpdate(query);
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossibile trovare i driver per la connessione al database");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * Restituisce la lista degli autori di un libro
	*/
	public List<Autore> doRetrieveByLibro(String codice) {
		Connection conn = null;
		List<Autore> autori = new Vector<Autore>();
		
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM autore INNER JOIN scrittura ON autore.id=scrittura.autore WHERE scrittura.libro='"+codice+"'";
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				Autore autore = new Autore(rs.getInt("id"),rs.getString("nome"),rs.getString("cognome"));
				autori.add(autore);
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossibile trovare i driver per la connessione al database");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();;
		}
		return autori;
	}
	
	/*
	 * Restituisce un autore in base a nome e cognome
	*/
	public Autore doRetrieveByName(String nome, String cognome) {
		Connection conn = null;
		Autore autore = null;
		
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM autore WHERE nome='"+nome+"' and cognome='"+cognome+"'";
			ResultSet rs = stm.executeQuery(query);
			if(rs.next()) {
				autore = new Autore(rs.getInt("id"),rs.getString("nome"),rs.getString("cognome"));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossibile trovare i driver per la connessione al database");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();;
		}
		return autore;
	}

}
