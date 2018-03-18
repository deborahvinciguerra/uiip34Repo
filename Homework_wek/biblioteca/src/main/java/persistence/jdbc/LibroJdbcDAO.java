package persistence.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import model.Libro;
import persistence.dao.LibroDAO;
import util.JDBCManager;

public class LibroJdbcDAO implements LibroDAO {

	/*
	 * Restituisce la lista dei libri presenti nel database
	*/
	public List<Libro> doRetrieveAll() {
		Connection conn = null;
		List<Libro> libri = new Vector<Libro>();

		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM libro";
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				Libro libro = new Libro(rs.getString("codice"),rs.getString("titolo"),rs.getInt("nCopie"));
				libri.add(libro);
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
		return libri;
	}

	/*
	 * Restituisce la lista dei libri di un determinato autore
	*/
	public List<Libro> doRetrieveByAutore(int idAutore) {
		Connection conn = null;
		List<Libro> libri = new Vector<Libro>();

		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT l.codice,l.titolo,l.nCopie FROM libro AS l INNER JOIN scrittura AS s"
					+ " ON l.codice=s.libro WHERE s.autore="+idAutore;
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				Libro libro = new Libro(rs.getString("l.codice"),rs.getString("l.titolo"),rs.getInt("l.nCopie"));
				libri.add(libro);
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
		return libri;
	}

	/*
	 * Restituisce la lista di libri in base al titolo
	*/
	public List<Libro> doRetrieveByTitolo(String titolo) {
		Connection conn = null;
		List<Libro> libri = new Vector<Libro>();

		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM libro WHERE titolo='"+titolo+"'";
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				Libro libro = new Libro(rs.getString("codice"),rs.getString("titolo"),rs.getInt("nCopie"));
				libri.add(libro);
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
		return libri;
	}

	// Aggiorna il numero di copie di un determinato libro
	public void updateCopie(String codice,int n) {
		Connection conn = null;

		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "UPDATE libro SET nCopie="+n+" WHERE codice='"+codice+"'";
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
	 * Inserisce un nuovo libro all'interno del database
	*/
	public void save(Libro libro) {
		Connection conn = null;

		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "INSERT INTO libro(codice,titolo,nCopie) VALUES ('"+libro.getCodice()+
					"','"+libro.getTitolo()+"',"+libro.getnCopie()+")";
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
	 * Restituisce un libro in base al suo codice identificativo
	*/
	public Libro doRetrieveByCodice(String codice) {
		Connection conn = null;
		Libro libro = null;

		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT * FROM libro WHERE codice='"+codice+"'";
			ResultSet rs = stm.executeQuery(query);
			if(rs.next()) {
				libro = new Libro(rs.getString("codice"),rs.getString("titolo"),rs.getInt("nCopie"));
			}
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossibile trovare i driver per la connessione al database");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return libro;
	}

}
