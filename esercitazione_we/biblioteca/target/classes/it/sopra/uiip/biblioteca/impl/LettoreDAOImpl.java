package it.sopra.uiip.biblioteca.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.biblioteca.model.*;

public class LettoreDAOImpl implements DAOLettore{

	ArrayList<Lettore> listaLettore;
	Lettore l;
	 
	 public void addLettore(Connection conn)
	 {
	  listaLettore=new ArrayList<Lettore>();
	  try {
	   Statement s;
	   s = conn.createStatement();
	   ResultSet rs = s.executeQuery("Select * from lettore");
	   
	   while (rs.next())
	   {
	    a=new Lettore(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getInt(4), rs.getInt(5));
	    listaLettore.add(a);
	   }
	   
	  } catch (SQLException e) {
	   e.printStackTrace();
	  }
	  
	 }
	 
	 
	 public ArrayList<Lettore> getAllLettore(Connection conn) 
	    {
	       return listaLettore;
	    }
	}

	
}
