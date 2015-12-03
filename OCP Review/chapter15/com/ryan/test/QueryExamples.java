package com.ryan.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static java.lang.System.*;

public class QueryExamples {
	
	private static Connection connection;
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:1521/BookSellerDb"; // url
		String user = "user"; // user
		String pwd = "123456"; // pwd
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, pwd);
			
			// Statements
			Statement statement = connection.createStatement();
			String sql = "select * from user";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				out.println(rs.getString("something"));
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
