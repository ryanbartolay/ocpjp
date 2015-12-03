package practicetest15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Number6 {
	public static void main(String[] args) throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "";		

		
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection;
			try {
				connection = DriverManager.getConnection(url, user, password);
				ResultSet rs = null;
				
				// this will automatically close all the resources being from this block
				try (Statement stmt = connection.createStatement()) { 
					String sql = "select * from user";
					rs = stmt.executeQuery(sql);
				}
				// thus, this will throw a runtime exception
				while(rs.next()) {
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}
}
