package com.ryan.sql.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectUpdateExample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "";


		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.
					getConnection(url, user, password);
			
			Statement stmt = connection.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from user");
			
			while(rs.next()) {
				String user_rs = rs.getString("user");
				
				if(user_rs.trim().length() <= 0) {
					rs.updateString("user", "ryan");
					rs.updateRow();
				}
				
				rs.moveToInsertRow();
				rs.updateString("user", "insert_ryan2");
				rs.insertRow();
				rs.moveToCurrentRow();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}			

	}
}
