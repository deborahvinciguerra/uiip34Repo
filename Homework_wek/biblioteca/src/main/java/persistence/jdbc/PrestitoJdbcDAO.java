package persistence.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Vector;

import model.Libro;
import model.Prestito;
import model.Tessera;
import persistence.dao.LibroDAO;
import persistence.dao.PrestitoDAO;
import persistence.dao.TesseraDAO;
import util.JDBCManager;

public class PrestitoJdbcDAO implements PrestitoDAO {

	/*
	 * Restituisce la lista dei prestiti 
	*/
	public List<Prestito> doRetrieveAll() {
		Connection conn = null;
		List<Prestito> prestiti = new Vector<Prestito>();
		
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			LibroDAO lDao = new LibroJdbcDAO();
			TesseraDAO tDao = new TesseraJdbcDAO();
			String query = "SELECT * FROM prestito";
			ResultSet rs = stm.executeQuery(query);
			while(rs.next()) {
				Tessera tessera = tDao.doRetrieveById(rs.getInt("utente"));
				Libro libro = lDao.doRetrieveByCodice(rs.getString("libro"));
				prestiti.add(new Prestito(tessera,libro));
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
		return prestiti;
	}

	/*
	 * Inserisce un prestito all'interno della tabella
	*/
	public void save(Prestito prestito) {
		Connection conn = null;
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "INSERT INTO prestito(utente,libro) VALUES("+
			prestito.getTessera().getId()+",'"+prestito.getLibro().getCodice()+"')";
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
	 *  restituisce il numero di copie in prestito per un determintato libro(non-Javadoc)
	 */
	public int countPrestati(String titolo) {
		Connection conn = null;
		int count = -1;
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "SELECT COUNT(p.utente) AS nPrestiti FROM prestito AS p INNER JOIN libro AS l ON p.libro=l.codice WHERE l.titolo='"+titolo+"'";
			ResultSet rs = stm.executeQuery(query);
			if (rs.next())
				count = rs.getInt("nPrestiti");
			conn.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Impossibile trovare i driver per la connessione al database");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}
	
	/*
	 * Cancella un prestito all'interno del database
	 */
	public void delete(Prestito prestito) {
		Connection conn = null;
		try {
			conn = JDBCManager.getConnection();
			Statement stm = conn.createStatement();
			String query = "DELETE FROM prestito WHERE utente="+prestito.getTessera().getId()+" AND libro='"+prestito.getLibro().getCodice()+"'";
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
