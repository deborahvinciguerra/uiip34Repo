package it.sopra.uiip.viaggi;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import it.sopra.uiip.viaggi.dao.impl.AereoDaoImpl;
import it.sopra.uiip.viaggi.dao.impl.VoloDaoImpl;
import it.sopra.uiip.viaggi.model.Aereo;



public class App 
{
    public static void main( String[] args )
    {
    	try {
    		VoloDaoImpl voli = new VoloDaoImpl();
    		 AereoDaoImpl lista = new AereoDaoImpl();
    		 DbAccess db = new DbAccess();
    		 Connection conn = db.connect();
    		 lista.addAereo(conn);
    		 Vector<Aereo> lista_aereo  = lista.getAllAereo(conn);
 	    
	     for(Aereo a : lista_aereo) {
	    	 System.out.println(a.toString());
	     }
	    voli.voliInPartenza(conn);
	     
	     
	     conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    }
}