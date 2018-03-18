package dao;
import java.sql.*;
import javax.sql.*;

import classi.*;
import interfacce.*;

public class JDBClibroDAO implements LibroDAO
{
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}
	
	public void insert(Libro libro)
	{
		String sql = "insert into archivio (titolo, autori, nCopie) values (?, ?, ?)";
		Connection conn = null;
		
		try	{
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, libro.getTitolo());
			ps.setString(2, libro.getAutori());
			ps.setInt(3, libro.getnCopie());
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

	public Libro cercaLibro(int id_libro)
	{
		String sql = "select * from archivio where id_libro = ?";
		Connection conn = null;
		
		try {
			conn=dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id_libro);
			Libro libro = null;
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				libro = new Libro(
						rs.getInt("id_libro"),	
						rs.getString("titolo"),
						rs.getString("autori"),
						rs.getInt("nCopie")
				);
			}
			rs.close();
			ps.close();
			return libro;
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
