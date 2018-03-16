package it.sopra.uiip.viaggi.dao.impl;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import it.sopra.uiip.viaggi.dao.DaoAereo;
import it.sopra.uiip.viaggi.model.Aereo;

public class AereoDaoImpl implements DaoAereo
{

	 Vector<Aereo> listaAereo;
	 Aereo a;
	public void addAereo(Connection conn)
	{
		Statement s;
		try {
			s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from aereo");
			
			while (rs.next())
			{
				a=new Aereo(rs.getString(1),rs.getInt(2),rs.getInt(3));
				
			}
			listaAereo.add(a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Vector<Aereo> getAllAereo(Connection conn) 
	   {
	      return listaAereo;
	   }
}
