package com.ryan.sql.statement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

/**
mysql> use ocp
Database changed
mysql> create procedure simpleproc (OUT param1 INT)
    -> BEGIN
    -> SELECT COUNT(*) INTO param1 FROM user
    -> END//
ERROR 1064 (42000): You have an error in your SQL syntax; check the manual that
corresponds to your MySQL server version for the right syntax to use near '' at
line 4
mysql> create procedure simpleproc (OUT param1 INT)
    -> BEGIN
    -> SELECT COUNT(*) INTO param1 FROM user;
    -> END//
Query OK, 0 rows affected (0.06 sec)

mysql> create procedure sp_user (IN loc_user VARCHAR(255), IN loc_host VARCHAR(2
55), OUT out_password VARCHAR(255))
    -> BEGIN
    -> select password into out_password from user where user = loc_user and hos
t = loc_host;
    -> end //
Query OK, 0 rows affected (0.00 sec)
 */
public class CallableStatementExample {
	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.
					getConnection(url, user, password);
			
			String sql = "{call sp_user(?,?,?)}";
			
			CallableStatement cstmt = connection.prepareCall(sql, 
					ResultSet.TYPE_SCROLL_INSENSITIVE, 
					ResultSet.CONCUR_UPDATABLE);
			cstmt.setString(1, "root");
			cstmt.setString(2, "localhost");
			cstmt.registerOutParameter(3, Types.VARCHAR);
			
			boolean success = cstmt.execute();
			
			System.out.println(cstmt.getString(3));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
