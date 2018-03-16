package it.sopra.uiip.libeccio.viaggi.model.daoimpl;

import java.sql.*;

public class ConnectionManager {
	private ConnectionManager() {
	};

	private static boolean driverLoaded = false;
	private static final String MY_DRIVER = "com.mysql.jdbc.Driver";
	private static final String MY_URL = "jdbc:mysql://localhost:3306/viaggi";
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
}// end of class ConnectionManager