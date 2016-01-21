package com.ryan.standard.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

public class Number43 {
	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("", "", "");
		Statement stmt = connection.createStatement();
		connection.setAutoCommit(false); stmt.executeUpdate("update student set status=1"); //1 
		Savepoint savePoint1 = connection.setSavepoint("step1done"); 
		stmt.executeUpdate("update student set gpa=4.0"); //2
		if(true){ connection.rollback(savePoint1); } 
		connection.commit(); //query 1 will be committed but query 2 will not be committed.
	}
}
