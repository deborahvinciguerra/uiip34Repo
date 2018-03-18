package it.sopra.uiip.biblioteca.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.biblioteca.model.Richiesta;

public class RichiestaDAOImpl implements DAORichiesta{

	ArrayList<Richiesta> listaRichiesta;
	Richiesta l;
	 
	 public void addRichiesta(Connection conn)
	 {
	  listaRichiesta=new ArrayList<Richiesta>();
	  try {
	   Statement s;
	   s = conn.createStatement();
	   ResultSet rs = s.executeQuery("Select * from richiesta");
	   
	   while (rs.next())
	   {
	    a=new Richiesta(rs.getInt(1),rs.getInt(2) );
	    listaRichiesta.add(a);
	   }
	   
	  } catch (SQLException e) {
	   e.printStackTrace();
	  }
	  
	 }
	 
	 
	 public ArrayList<Richiesta> getAllRichiesta(Connection conn) 
	    {
	       return listaRichiesta;
	    }
	}
}
