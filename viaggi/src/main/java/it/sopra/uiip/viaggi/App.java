package it.sopra.uiip.viaggi;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import it.sopra.uiip.viaggi.dao.impl.DaoImpl;
import it.sopra.uiip.viaggi.model.Aereo;



public class App 
{
    public static void main( String[] args )
    {
    	 try {
    		 DbAccess db = new DbAccess();
    	 Connection conn = db.connect();
    	 Vector<Aereo> lista_aereo  = DaoImpl.getAereo(conn);
 	    
	     for(Aereo a : lista_aereo) {
	    	 System.out.println(a.toString());
	     }
	    
	     conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }
}