package it.sopra.uiip.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import it.sopra.uiip.Model.Aereo;

public class AereoDaoImpl
{

	 Vector<Aereo> listaAereo;
	 Aereo a;
	public void addAereo(Connection conn) throws SQLException
	{
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("Select * from aereo");
		
		while (rs.next())
		{
			a=new Aereo(rs.getString(0),rs.getInt(1),rs.getInt(2));
			
		}
		listaAereo.add(a);
	}
	public Vector<Aereo> getAllAereo() 
	   {
	      return listaAereo;
	   }
}
