package com.ryan.enthuware.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Number9 {
	public static void main(String[] args) throws ClassNotFoundException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ocp", "root", "");
			try(Statement stmt = connection.createStatement();) {
				ResultSet rs = stmt.executeQuery("select * from USER");
				ResultSetMetaData rsmd = rs.getMetaData();
				
				int cc = rsmd.getColumnCount();
				
				while (rs.next()) {				
					for(int i = 0; i < cc; i++) { // RuntimeException here column index a
						System.out.println(rsmd.getColumnName(i) + " = " + rs.getObject(i+1));
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
