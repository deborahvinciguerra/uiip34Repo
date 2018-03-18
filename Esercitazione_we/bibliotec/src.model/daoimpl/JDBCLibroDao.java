package daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import dao.LibroDao;
import dao.UtenteDao;
import model.Libro;
import daoimpl.JDBCUtenteDao;
public class JDBCLibroDao implements LibroDao {


	public Vector<Libro> visualizzaLbiri() {
	Connection conn;
	Statement stm;
	ResultSet rs;
	
	try {
		conn=  ConnectionManager.getConnection();
		stm = conn.createStatement();
		String query = "SELECT id , Count(titolo) as nCopie,titolo,autore  FROM libro Group By titolo;";
		rs = stm.executeQuery(query);
		Vector <Libro> listaLibri=new Vector<Libro>();
		Libro l=null;
		while (rs.next() ) {
			int id = rs.getInt("id");
			int nCopie=rs.getInt("nCopie");
			String titolo = rs.getString("titolo");
			String autore =rs.getString("autore");
			l=new Libro(id,nCopie,titolo,autore);
			listaLibri.add(l);
					
		}conn.close();
		stm.close();
		return listaLibri ;	
		 			 
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	return null;
	}
	
	

	public Libro cercaLbiriTitolo(String titolo) {
		Connection conn;
		Statement stm;
		ResultSet rs;
		
		try {
			conn=  ConnectionManager.getConnection();
			stm = conn.createStatement();
			String query = "SELECt id , Count(titolo) as nCopie,titolo,autore FROM libro WHERE titolo= '"+titolo+"'";
			rs = stm.executeQuery(query);
		
			Libro l=null;
			while (rs.next() ) {
				int id = rs.getInt("id");
				int nCopie = rs.getInt("nCopie");
				titolo = rs.getString("titolo");
				String autore =rs.getString("autore");
				l=new Libro(id,nCopie,titolo,autore);
				
						
			}conn.close();
			stm.close();
			return l ;	
			 			 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public Vector<Libro> cercaLbiriAutore(String autore) {
		Connection conn;
		Statement stm;
		ResultSet rs;
		
		try {
			conn=  ConnectionManager.getConnection();
			stm = conn.createStatement();
			String query = "SELECT id , Count(titolo) as nCopie,titolo,autore FROM libro WHERE autore= '"+autore+"' group by titolo ";
			rs = stm.executeQuery(query);
			Vector <Libro> listaLibri=new Vector<Libro>();
			Libro l=null;
			while (rs.next() ) {
				int id = rs.getInt("id");
				int nCopie = rs.getInt("nCopie");
				String titolo = rs.getString("titolo");
				 autore =rs.getString("autore");
				l=new Libro(id,nCopie,titolo,autore);
				listaLibri.add(l);
						
			}conn.close();
			stm.close();
			return listaLibri ;	
			 			 
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}



	public void prestaLibro(String titolo, String nome,String cognome,String indirizzo) {
		LibroDao l=new JDBCLibroDao();
		UtenteDao u= new JDBCUtenteDao();
		Libro lista= l.cercaLbiriTitolo(titolo);
		int i= u.cercaUtente(nome, cognome, indirizzo);
		if ((lista.getNCopie()>0)&&(i!=0)) {
			Connection cnn;
			Statement stmt;
			
			try {
				
				 cnn=  ConnectionManager.getConnection();
				 stmt = cnn.createStatement();
				 String query= "INSERT INTO prestito values (" +i+" , "+lista.getId() +" , '"+lista.getTitolo() +"' , '"+lista.getAutore()+"' );";
				 stmt.executeUpdate(query);
				 String query2= "UPDATE libro SET titolo = null, autore = null  WHERE id = "+lista.getId()+" ;";
				 
				 stmt.executeUpdate(query2);

				 cnn.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

}
