package com.ryan.sql.error;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

public class WarningExample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "";
		Connection connection = null;
		Statement stmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.
					getConnection(url, user, password);

			stmt = connection.createStatement(
					ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from user");

			SQLWarning warnings = rs.getWarnings();

			while(warnings != null) {
				System.out.println(warnings.getSQLState());
				System.out.println(warnings.getMessage());
				warnings = warnings.getNextWarning();
			}


		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				if(connection != null) {
					connection.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
