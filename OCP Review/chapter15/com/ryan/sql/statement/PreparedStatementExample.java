package com.ryan.sql.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, password);
			
			String sql = "select * from user where user = ?";
			
			PreparedStatement pstmt = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			pstmt.setString(1, "root");
			
			boolean hasResultSet = pstmt.execute();
			
			if(hasResultSet) {
				ResultSet rs = pstmt.getResultSet();
				while(rs.next()) {
					System.out.println(rs.getString("host"));
				}
			} else {
				System.out.println("Executed successfully No Result set");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
