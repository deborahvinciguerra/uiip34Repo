package it.sopra.uiip.viaggi.dao.impl;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import it.sopra.uiip.viaggi.dao.DaoVolo;
import it.sopra.uiip.viaggi.model.Volo;


public class VoloDaoImpl implements DaoVolo
{
	 Vector<Volo> listaVoli;
	 Volo v;
	public void addVolo(Connection conn)
	{
		listaVoli=new Vector<Volo>();
		Statement s;
		try {
			s = conn.createStatement();
			ResultSet rs = s.executeQuery("Select * from volo");
			
			while (rs.next())
			{
				v=new Volo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
				
			}
			listaVoli.add(v);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	  public Vector<Volo> getAllVolo(Connection conn) 
	   {
	      return listaVoli;
	   }
}
