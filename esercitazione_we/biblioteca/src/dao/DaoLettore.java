package dao;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

import model.Lettore;



public interface DaoLettore {
	Vector <Lettore> getAllLettore(Connection c);
	void addLettore (Connection c) throws SQLException;
	
}
