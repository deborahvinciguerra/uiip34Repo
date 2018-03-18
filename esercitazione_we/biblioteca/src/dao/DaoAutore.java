package dao;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import model.Autore;


public interface DaoAutore {
	Vector<Autore> getAllAutore(Connection c)throws SQLException;
	void addAutore (Connection c)throws SQLException;
	public void ricercaAutore (Connection c,String nomeAutore)throws SQLException;

}
