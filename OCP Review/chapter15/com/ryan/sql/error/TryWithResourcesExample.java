package com.ryan.sql.error;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TryWithResourcesExample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			try(Connection connection = DriverManager.getConnection(url, user, password); 
					Statement stmt = connection.createStatement(
					ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);) {
				ResultSet rs = stmt.executeQuery("select * from user");

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e1) {			
			e1.printStackTrace();
		} 
	}
}
