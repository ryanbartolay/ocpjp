package practicetest15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Number5 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "";		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement stmt = connection.createStatement();
			
			String sql = "update user set host = 'ryan' where user = 'root'";
			
			stmt.executeQuery(sql); // this will compile correctly but will throw runtime exception because execute is for select query only
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
