package daoImp;



import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import model.Autore;
import dao.DaoAutore;

public class AutoreDaoImpl implements DaoAutore
{

	Vector<Autore> listaAutore;
	public void addAutore(Connection c) throws SQLException 
	{
		listaAutore=new Vector<Autore>();
	    Statement s = c.createStatement();
	    ResultSet rs = s.executeQuery("Select * from autori");
			while (rs.next())
			{
				Autore a=new Autore(rs.getInt(1),rs.getString(2),rs.getString(3));
				listaAutore.add(a);
				}		
	}

	public void ricercaAutore(Connection c, String nomeAutore) throws SQLException
	{

		
	}

	@Override
	public Vector<Autore> getAllAutore(Connection c) throws SQLException {
		return listaAutore;
	}


}
