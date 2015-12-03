package com.ryan.sql.rowset;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetDisconnectedExample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "";		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false);
			
			try(CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet()) {
				String query = "select * from user";
				crs.setCommand(query);				
				crs.execute(connection);
				
				while(crs.next()) {
					System.out.println(crs.getString("host") + " " + crs.getString("user"));
				}
				
				crs.absolute(2);
				crs.updateString("password", "111111");
				crs.acceptChanges(connection);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException | SQLException e1) {
		
			e1.printStackTrace();
		} 
	}
}
