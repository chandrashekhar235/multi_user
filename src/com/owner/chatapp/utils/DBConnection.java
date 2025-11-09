package com.owner.chatapp.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static com.owner.chatapp.utils.ConfigReader.getValue;
import static com.owner.chatapp.utils.KeyConstants.*;

public interface DBConnection {
	static Connection getConnection() throws SQLException, ClassNotFoundException {
		// Load the MySQL JDBC driver
		Class.forName(getValue(DRIVER_NAME));

		// Establish the connection to the database
		return DriverManager.getConnection(
				getValue(DB_URL),
				getValue(DB_USERID),
				getValue(DB_PWD)
		);
	}
}
