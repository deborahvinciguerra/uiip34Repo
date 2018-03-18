
package it.sopra.uiip.biblioteca.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import it.sopra.uiip.biblioteca.model.*;

public class LibroDAOImpl implements DAOLibro{

		ArrayList<Libro> listaLibro;
		Libro l;
		 
		 public void addLibro(Connection conn)
		 {
		  listaLibro=new ArrayList<Libro>();
		  try {
		   Statement s;
		   s = conn.createStatement();
		   ResultSet rs = s.executeQuery("Select * from libro");
		   
		   while (rs.next())
		   {
		    a=new Libro(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4) );
		    listaLibro.add(a);
		   }
		   
		  } catch (SQLException e) {
		   e.printStackTrace();
		  }
		  
		 }
		 
		 
		 public ArrayList<Libro> getAllLibro(Connection conn) 
		    {
		       return listaLibro;
		    }
		}

	//visualizzare l'elenco dei libri disponibili
	public void visualizzaLibriDisponibili(Connection c){
		  try {
			   Statement s=c.createStatement();
			   ResultSet rs = s.executeQuery("select titolo,autori,nCopie FROM libro" + 
			     "where nCopie>0");
			   
			   while (rs.next()){
			    System.out.println(rs.getInt(1));
			   }
			   
			  } catch (SQLException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
	}
	
	public void ricercaPerTitolo(Connection c) {
		  try {
			   Statement s=c.createStatement();
			   ResultSet rs = s.executeQuery("select * FROM libro" + 
			     "where titolo = "Gomorra");
			   
			   while (rs.next()){
			    System.out.println(rs.getInt(1));
			   }
			   
			  } catch (SQLException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
	}
	
	public void ricercaPerAutore(Connection c) {
		 try {
			   Statement s=c.createStatement();
			   ResultSet rs = s.executeQuery("select * FROM libro" + 
			     "where autori = "Pirandello");
			   
			   while (rs.next()){
			    System.out.println(rs.getInt(1));
			   }
			   
			  } catch (SQLException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
	}
	
	public void prestitoLibro(Connection c) {
		 try {
			   Statement s=c.createStatement();
			   ResultSet rs = s.executeQuery("select * FROM libro" + 
			     "where titolo = "Gomorra" and nCopie >0);
			   
			   while (rs.next()){
			    System.out.println(rs.getInt(1));
			   }
			   
			  } catch (SQLException e) {
			   // TODO Auto-generated catch block
			   e.printStackTrace();
			  }
	}
		

}
