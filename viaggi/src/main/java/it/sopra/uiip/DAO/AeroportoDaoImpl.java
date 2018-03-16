package it.sopra.uiip.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import it.sopra.uiip.viaggi.model.Aeroporto;



public class AeroportoDaoImpl 
{
	Vector<Aeroporto>listaAeroporto;
	Aeroporto a;
	public void addAeroporto(Connection conn) throws SQLException
	{
		listaAeroporto=new Vector<Aeroporto>();
		Statement s = conn.createStatement();
		ResultSet rs = s.executeQuery("Select * from aereoporto");
		
		while (rs.next())
		{
		 a=new Aeroporto(rs.getString(0),rs.getString(1),rs.getInt(2));
			
		}
		listaAeroporto.add(a);
	}
	public Vector<Aeroporto> getAllAeroporto() 
	   {
	      return listaAeroporto;
	   }
}
