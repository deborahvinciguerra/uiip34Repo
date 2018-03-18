package dao;
import java.sql.*;
import javax.sql.*;

import classi.*;
import interfacce.*;

public class JDBCprestitoDAO implements PrestitoDAO
{
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	public void insert(Prestito prestito)
	{
		String sql = "insert into archivio (nome, indirizzo) values (?, ?)";
		Connection conn = null;
		
		try	{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, prestito.getId_libro());
			ps.setInt(2, prestito.getId_tessera());
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}

	public Prestito cercaPrestito(int id_prestito)
	{
		String sql = "select * from archivio where id_prestito = ?";
		Connection conn = null;
		
		try {
			conn=dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id_prestito);
			Prestito prestito = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				prestito = new Prestito(
						rs.getInt("id_prestito"),	
						rs.getInt("nome"),
						rs.getInt("indirizzo")
				);
			}
			rs.close();
			ps.close();
			return prestito;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn!=null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
}
