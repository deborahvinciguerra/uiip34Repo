package it.sopra.uiip.viaggi;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import it.sopra.uiip.DAO.DAO;




/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String url = "jdbc:mysql://localhost:3306/viaggi";
    	String username = "root";
    	String password = "root";

    	System.out.println("Connecting database...");

    	try (Connection connection = DriverManager.getConnection(url, username, password)) {
    	    System.out.println("Database connected!");
    	    DAO.insertAereo(connection);
    	    
    	} catch (SQLException e) {
    	    throw new IllegalStateException("Cannot connect the database!", e);
    }
    	
    	
    }
}