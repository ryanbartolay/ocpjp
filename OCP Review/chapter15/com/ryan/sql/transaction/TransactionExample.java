package com.ryan.sql.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * use a storage engine that supports transactions like InnoDB. MyISAM does not support transactions.
 */
public class TransactionExample {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "";		
		Connection connection = null;
		PreparedStatement ps = null;
		PreparedStatement ps2 = null;
		
		String sql = "insert into user (host, user, password) values (?,?,?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// First concept is to set auto-commit to false
			connection = DriverManager.getConnection(url, user, password);
			connection.setAutoCommit(false); // JDBC equivalent of begin transaction
			System.out.println(connection.getAutoCommit());
			ps = connection.prepareStatement(sql);
			ps.setString(1, "ofelia.bartolay.nz");
			ps.setString(2, "root");
			ps.setString(3, "1234567");
			
			ps2 = connection.prepareStatement(sql);
			ps2.setString(1, "ryan.bartolay.com.sg");
			ps2.setString(2, "root2");
			ps2.setString(3, "1234567");
			
			ps.executeUpdate();
			ps2.executeUpdate();
			System.out.println("commit");
			connection.commit();
		} catch(SQLException e) {
			e.printStackTrace();
			try {
				connection.rollback(); // rollback the transaction if any of the query fails
				System.err.println("rollback");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				ps2.close();
				if(connection != null) {
					connection.close();
					System.err.println("close");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
