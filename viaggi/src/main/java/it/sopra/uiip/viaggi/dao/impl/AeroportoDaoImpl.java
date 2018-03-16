package it.sopra.uiip.viaggi.dao.impl;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import it.sopra.uiip.viaggi.dao.DaoAeroporto;
import it.sopra.uiip.viaggi.model.Aeroporto;



public static class AeroportoDaoImpl implements DaoAeroporto
{
	Vector<Aeroporto>listaAeroporto;
	Aeroporto a;
	public void addAeroporto(Connection conn)
	{
		listaAeroporto=new Vector<Aeroporto>();
		
		;
		try {
			Statement s = conn.createStatement();
			ResultSet rs;
			rs = s.executeQuery("Select * from aereoporto");
			while (rs.next())
			{
			 a=new Aeroporto(rs.getString(0),rs.getString(1),rs.getInt(2));
				
			}
			listaAeroporto.add(a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public Vector<Aeroporto> getAllAeroporto(Connection conn) 
	   {
	      return listaAeroporto;
	   }
}
