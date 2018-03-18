package dao;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import model.Libro;


public interface DaoLibro {
	public void addLibro (Connection c) throws SQLException ;
	public Vector <Libro> getAllLibro(Connection c) throws SQLException ;
	public Vector <Libro> ricercaLibro (Connection c,String nomeLibro) throws SQLException;
	public void prestaLibro(Connection c,String nomeLibro) throws SQLException;

}
