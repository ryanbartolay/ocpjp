package com.ryan.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJDBC {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:1521/BookSellerDb"; // url
		String user = "user"; // user
		String pwd = "123456"; // pwd
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, user, pwd);
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
