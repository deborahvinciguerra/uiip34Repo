package daoImp;



import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import dao.DaoLettore;
import model.Lettore;



public class LettoreDaoImpl implements DaoLettore
{
	private Vector<Lettore> listaLettore;
	public Vector<Lettore> getAllLettore(Connection c) {
		// TODO Auto-generated method stub
		return listaLettore;
	}
	public void addLettore(Connection c) throws SQLException
	{
		listaLettore=new Vector<Lettore>();
	    Statement s = c.createStatement();
	    ResultSet rs = s.executeQuery("Select * from lettori");
			while (rs.next())
			{
					Lettore l=new Lettore(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
					listaLettore.add(l);
			}		
		
	}
	
	
}
