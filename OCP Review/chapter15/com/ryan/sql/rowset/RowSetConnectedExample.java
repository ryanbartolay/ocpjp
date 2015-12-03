package com.ryan.sql.rowset;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetConnectedExample {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/ocp";
		String user = "root";
		String password = "";
		
		/*try {
			RowSetFactory rsf = RowSetProvider.newFactory();
			RowSet rs = rsf.createJdbcRowSet();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}*/
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			try(JdbcRowSet jrs = RowSetProvider.newFactory().createJdbcRowSet()) {
				String query = "select * from user";
				jrs.setCommand(query);
				jrs.setUrl(url);
				jrs.setUsername(user);
				jrs.setPassword(password);
				
				jrs.addRowSetListener(new RowSetListener() {
					
					@Override
					public void rowSetChanged(RowSetEvent event) {
						try {
							((RowSet)event.getSource()).execute();
						} catch (SQLException e) {						
							e.printStackTrace();
						}
					}
					
					@Override
					public void rowChanged(RowSetEvent event) {						
					}
					
					@Override
					public void cursorMoved(RowSetEvent event) {						
					}
				});
				
				jrs.execute();
				while(jrs.next()) {
					System.out.println(jrs.getString("host") + " " + jrs.getString("user"));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e1) {
		
			e1.printStackTrace();
		} 
	}
}
