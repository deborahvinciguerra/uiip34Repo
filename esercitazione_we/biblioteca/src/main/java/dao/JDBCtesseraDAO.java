package dao;
import java.sql.*;
import javax.sql.*;

import classi.*;
import interfacce.*;

public class JDBCtesseraDAO implements TesseraDAO
{
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	public void insert(Tessera tessera)
	{
		String sql = "insert into tessere (nome, indirizzo) values (?, ?)";
		Connection conn = null;
		
		try	{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, tessera.getNome());
			ps.setString(2, tessera.getIndirizzo());
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

	public Tessera cercaTessera(int id_tessera)
	{
		String sql = "select * from tessere where id_tessera = ?";
		Connection conn = null;
		
		try {
			conn=dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id_tessera);
			Tessera tessera = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				tessera = new Tessera(
						rs.getInt("id_tessera"),	
						rs.getString("nome"),
						rs.getString("indirizzo")
				);
			}
			rs.close();
			ps.close();
			return tessera;
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
