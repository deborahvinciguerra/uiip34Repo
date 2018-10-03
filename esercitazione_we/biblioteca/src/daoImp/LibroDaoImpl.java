package daoImp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import dao.DaoLibro;
import model.*;



public class LibroDaoImpl implements DaoLibro
{
	static Vector<Libro>listaLibro;
	static Vector<Libro>listaRicLibro;
	public void addLibro(Connection conn) throws SQLException
	{
		listaLibro=new Vector<Libro>();
		
		
			Statement s = conn.createStatement();
			ResultSet rs;
			rs = s.executeQuery("Select * from libri");
			while (rs.next())
			{
			 Libro l=new Libro(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4));
			 listaLibro.add(l);
			 System.out.println(l.toString());
			 
			}
			
			
	}

	public Vector<Libro> getAllLibro(Connection c) throws SQLException {
		
		return listaLibro;
	}

	public Vector<Libro> ricercaLibro(Connection conn, String nomeLibro) throws SQLException 
	{
	
		String sql="SELECT * FROM libri where libri.titolo like '"+nomeLibro+"'";
		System.out.println(sql);
		Statement s = conn.createStatement();
		ResultSet rs;
		
		rs = s.executeQuery(sql);
		if(rs!=null)
		{
		 listaRicLibro.add(new Libro(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
		 return listaRicLibro;
		}
		else
		{
			
		}
		System.out.println(listaRicLibro.size());
		return null;
	}
	public Vector<Libro> ricercaLibroAutore(Connection conn, String autore) throws SQLException 
	{
		String sql="SELECT * FROM libri where libri.titolo like '+%"+ autore+ "%'";
		System.out.println(sql);
		Statement s = conn.createStatement();
		ResultSet rs;
		
		rs = s.executeQuery(sql);
		while (rs.next())
		{
		 listaRicLibro.add(new Libro(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4)));
		}
		System.out.println(listaRicLibro.size());
		return listaRicLibro;
	}

	public void prestaLibro(Connection c, String nomeLibro) throws SQLException
	{
		
		
	}
		

}
