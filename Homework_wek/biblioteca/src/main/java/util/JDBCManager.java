package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Classe che fornisce la connessione al database
 */

public class JDBCManager {

	private JDBCManager() {
	};

	private static boolean driverLoaded = false;
	private static final String MY_DRIVER = "com.mysql.jdbc.Driver";
	private static final String MY_URL = "jdbc:mysql://localhost:3306/biblioteca";
	private static final String LOGIN = "root";
	private static final String PASSWD = "root";

	public static Connection getConnection() throws ClassNotFoundException,
	SQLException {
		if (!driverLoaded) {
			Class.forName(MY_DRIVER);
			driverLoaded = true;
		}
		return DriverManager.getConnection(MY_URL, LOGIN, PASSWD);
	}
}
