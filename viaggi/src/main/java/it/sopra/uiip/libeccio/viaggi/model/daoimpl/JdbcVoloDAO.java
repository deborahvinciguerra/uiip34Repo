package it.sopra.uiip.libeccio.viaggi.model.daoimpl;



import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import it.sopra.uiip.libeccio.viaggi.model.Volo;
import it.sopra.uiip.libeccio.viaggi.model.dao.VoloDAO;
import it.sopra.uiip.libeccio.viaggi.model.daoimpl.ConnectionManager;

public class JdbcVoloDAO implements VoloDAO {	
	
	public void insert(Volo volo) {
		Connection cnn;
		Statement stmt;
		
		try {
			
			 cnn=  ConnectionManager.getConnection();
			 stmt = cnn.createStatement();
			 String query= "INSERT INTO volo values ("+volo.getId() +",'"+volo.getGiorno()+"','"+volo.getPartenza()+"','"+volo.getArrivo() +
					 								"','"+volo.getTipoAereo()+"',"+volo.getOraPartenza()+","+volo.getOraArrivo()+");";
			 stmt.executeUpdate(query);
			 cnn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
        
	}

	public Volo selectById(int id) {
		Connection cnn;
		Statement stmt;
		ResultSet rs;
		Volo v=null;
		try {
//			
			 cnn=  ConnectionManager.getConnection();
			 stmt = cnn.createStatement();
			 String query ="SELECT * from volo WHERE idVolo=" +id;
			 rs=stmt.executeQuery(query);
			 
			 if (rs.next()) {
				
				String giorno =rs.getString("giornoSett");
				String partenza =rs.getString("cittaPart");
				String arrivo =rs.getString("cittaArr");
				String tipoAereo =rs.getString("tipoAereo");
				int oraPartenza =rs.getInt("oraPartenza");
				int oraArrivo =rs.getInt("oraArrivo");
				v=new Volo(id,giorno,partenza,arrivo,tipoAereo,oraPartenza, oraArrivo);
			 }
			 cnn.close();			 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return v ;

	}

	public void update(int id, Volo volo) {
		Connection cnn;
		Statement stmt;
		try {
			
			 cnn=  ConnectionManager.getConnection();
			 stmt = cnn.createStatement();
			 String query= "UPDATE volo SET idVolo =" + volo.getId()+", giornoSett='"+volo.getGiorno()+"', cittaPart='"+volo.getPartenza()+"', cittaArr='"+volo.getArrivo()+
					 								"', tipoAereo='"+volo.getTipoAereo()+"', oraPartenza="+volo.getOraPartenza()+",oraArrivo="+volo.getOraArrivo()
					 								+" WHERE idVolo="+volo.getId()+";";
			 stmt.executeUpdate(query);
			 cnn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
