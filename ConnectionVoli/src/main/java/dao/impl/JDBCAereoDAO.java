package dao.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;
import dao.AereoDAO;
import model.Aereo;

public class JDBCAereoDAO implements AereoDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void inserisci(Aereo a) {

		String sql = "INSERT INTO AEREO " +
				"(tipoAereo, nPass, quantitaMerci) VALUES (?, ?, ?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, a.getTipoAereo());
			ps.setInt(2, a.getnPass());
			ps.setInt(3, a.getQuantitaMerci());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
		
	}

}
