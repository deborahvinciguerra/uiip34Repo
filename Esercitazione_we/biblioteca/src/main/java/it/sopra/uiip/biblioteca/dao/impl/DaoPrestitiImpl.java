package it.sopra.uiip.biblioteca.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import it.sopra.uiip.biblioteca.DbAccess;
import it.sopra.uiip.biblioteca.dao.DaoPrestiti;
import it.sopra.uiip.biblioteca.model.Libri;

public class DaoPrestitiImpl implements DaoPrestiti{

		public ResultSet ElencoLibriDisponibili() {
			DbAccess db = new DbAccess();
			ResultSet rs = null;
			try {
				Statement s = db.connect().createStatement();
				
				rs = s.executeQuery("select distinct l.titolo, l.autori,l.numeroCopie from Libri as l where l.numeroCopie > (select count(*) from Prestiti as p where l.idLibro = p.idLibro)");
				//s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			return rs;
			
		}
	

		@Override
		public boolean PrestaLibro(String codFisc, int idLibro) {
			boolean lent = false;
			DbAccess db = new DbAccess();
			String query = "insert into prestiti (codiceFiscale, idLibro)" + "values(?,?)";
			try {
				Statement s = db.connect().createStatement();
				ResultSet rs = s.executeQuery("select * from prestiti where codiceFiscale ='"+codFisc+"' and idLibro ='"+idLibro+"'");
				if(!(rs.next())) {
					lent = true;
					PreparedStatement prst = db.connect().prepareStatement(query);
					prst.setString(1, codFisc);
					prst.setInt(2, idLibro);
					prst.execute();
					s.close();
				}
				
			} catch (SQLException e) {

				e.printStackTrace();
			}
			
			return lent;
		}

		@Override
		public int ControllaDisponibilita(String titolo) {
			int idLibro = -1;
			DbAccess db = new DbAccess();
			Statement s;
			try {
				s = db.connect().createStatement();
				ResultSet rs = s.executeQuery("select distinct l.idLibro, l.titolo from Libri as l where l.numeroCopie > (select count(*) from Prestiti as p where l.idLibro = p.idLibro)");
				while (rs.next() && idLibro == -1) {
					if(rs.getString(2).equals(titolo)) 
						idLibro = rs.getInt(1);
				}
				s.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			return idLibro;
		}

		@Override
		public int NumeroLibriPrestati(String titolo) {
			DbAccess db = new DbAccess();
			try {
				Statement s = db.connect().createStatement();
				ResultSet rs = s.executeQuery("select count(p.idLibro) as num from prestiti as p inner join libri as l on p.idLibro = l.idLibro  where l.titolo ='"+titolo+"'");
				if(rs.next()) {
					return rs.getInt(1);
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		    
		    
		    return 0;
		}

		 
}
