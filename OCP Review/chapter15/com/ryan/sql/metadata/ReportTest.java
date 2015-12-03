package com.ryan.sql.metadata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReportTest {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String sql = "select * from user";
			Connection connection = DriverManager.getConnection(url, user, password);
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery(sql);
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int columnCount = rsmd.getColumnCount();
			
			System.out.println(getRowCount(rs));
			
			for(int i=1; i <= columnCount; i++) {
				System.out.print(leftJustify(rsmd.getColumnName(i), 15));
			}
			System.out.println();
			while(rs.next()) {
				for(int i=1; i <= columnCount; i++) {
					Object o = rs.getObject(rsmd.getColumnName(i));
					System.out.print(leftJustify(o.toString(), 15));
				}
				System.out.println();
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String leftJustify(String s, int n) {
		if(s.length() <= n ) n++;
		return String.format("%1$-" + n + "s", s);
	}
	
	private static int getRowCount(ResultSet rs) throws SQLException { 
		int rowCount = -1;
		int currRow = 0;
		
		if(rs != null) {
			currRow = rs.getRow();
			
			if(rs.isAfterLast()) {
				currRow = -1;
			}
			
			if(rs.last()) {
				rowCount = rs.getRow();
			}
			rs.beforeFirst();
			System.out.println(currRow);
			if(currRow == -1) { // if there are no records 
				rs.afterLast();
			} else if(currRow == 0) {
				rs.beforeFirst();
			} else {
				rs.absolute(currRow);
			}
		}
		
		return rowCount;
	}
}
