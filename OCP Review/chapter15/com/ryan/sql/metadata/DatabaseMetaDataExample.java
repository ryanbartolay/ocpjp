package com.ryan.sql.metadata;

import static java.lang.System.out;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseMetaDataExample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mysql";
		String user = "root";
		String password = "";

		try {
			Class.forName("com.mysql.jdbc.Driver");			
			Connection connection = DriverManager.
					getConnection(url, user, password);
			DatabaseMetaData dbmd = connection.getMetaData();			
			
			if(dbmd.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
				out.print("Supports TYPE_FORWARD_ONLY");
				
				if(dbmd.supportsResultSetConcurrency(
						ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
					out.print(" and support CONCUR_UPDATABLE");
				}
			}
			
			if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
				out.print("Supports TYPE_SCROLL_SENSITIVE");
				
				if(dbmd.supportsResultSetConcurrency(
						ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					out.print(" and support CONCUR_UPDATABLE");
				}
			}
			
			if(dbmd.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
				out.print("Supports TYPE_SCROLL_INSENSITIVE");
				
				if(dbmd.supportsResultSetConcurrency(
						ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
					out.print(" and support CONCUR_UPDATABLE");
				}
			}
			
			Statement stmt = connection.createStatement(
					ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt.executeQuery("select * from user");
			
			System.out.println();
			if(rs.last()) {
				System.out.println(rs.getObject(1));
				System.out.println(rs.getObject(2));
				System.out.println(rs.getObject(3));
				System.out.println(rs.getObject(4));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
