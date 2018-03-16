package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import dao.AeroportoDAO;
import model.Aeroporto;

public class JDBCAeroportoDAO implements AeroportoDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void inserisci(Aeroporto a) {

		String sql = "INSERT INTO aeroporto " +
				"(citta, nazione, nPiste) VALUES (?, ?, ?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, a.getCitta());
			ps.setString(2, a.getNazione());
			ps.setInt(3, a.getNpiste());
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

	public Aeroporto cercaPerCitta(String citta) {
		// TODO Auto-generated method stub
		return null;
	}

}
