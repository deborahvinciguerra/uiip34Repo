package daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dao.UtenteDao;
import model.Utente;

public class JDBCUtenteDao implements UtenteDao {

	public int cercaUtente(String nome, String cognome, String indirizzo) {
		Connection conn;
		Statement stm;
		ResultSet rs;
		
		try {
			conn=  ConnectionManager.getConnection();
			stm = conn.createStatement();
			String query = "SELECt id FROM utente WHERE nome= '"+nome+"' and "+
							"cognome= '"+cognome+"' and "+"indirizzo= '"+indirizzo+"'";
			rs = stm.executeQuery(query);
		
			int id=0;
			if (rs.next() ) {
				id = rs.getInt("id");
			
			
				
						
			}conn.close();
			stm.close();
			return id ;	
			 			 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
