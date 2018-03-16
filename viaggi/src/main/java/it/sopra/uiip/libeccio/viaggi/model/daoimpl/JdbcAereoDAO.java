package it.sopra.uiip.libeccio.viaggi.model.daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.libeccio.viaggi.model.Aereo;
import it.sopra.uiip.libeccio.viaggi.model.dao.AereoDAO;

public class JdbcAereoDAO implements AereoDAO {

	public void insert(Aereo aereo) {

		
		// create a Statement from the connection
		
		Connection conn;
		try {
			conn = ConnectionManager.getConnection();
			
			Statement statement = conn.createStatement();
			
			// insert the data
			statement.executeUpdate("INSERT INTO aereo values(" + aereo.getTipo() + "," + aereo.getPassegeri() 
			+ "," + aereo.getMerci());
			
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	public Aereo selectByTipo(String tipo) {
		
	// create a Statement from the connection
		Aereo a=null;
		Connection conn;
		try {
			conn = ConnectionManager.getConnection();
			
			Statement stm = conn.createStatement();
			
			// insert the data
			 System.out.println("Seleziono aerei tramite il tipo");
		      String sql = "SELECT * FROM Areo WHERE tipo = '" + tipo + "'";
		      ResultSet rs = stm.executeQuery(sql);

		      if(rs.next()){
		         //Retrieve by column name
		    	  
		         String tipoAereo = rs.getString("tipoAereo");
		         int passegeri = rs.getInt("nPass");
		         int merci = rs.getInt("quantitaMerci");
		         a=  new Aereo ( tipoAereo,  passegeri,  merci);
		      }
		}
		       catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return a;
		      

	}

	public void update(String tipo, Aereo aereo) {

	// create a Statement from the connection
		
		Connection conn;
		try {
			conn = ConnectionManager.getConnection();
			
			Statement statement = conn.createStatement();
			
			// insert the data
			statement.executeUpdate("UPDATE volo SET nPass ="+ aereo.getPassegeri()+" WHERE tipoAereo='" + tipo+"';");
			
			conn.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
		}

		
	
