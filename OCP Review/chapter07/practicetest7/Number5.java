package practicetest7;

import java.io.IOException;
import java.sql.SQLException;

public class Number5 {
	
	public static void main(String[] args) {
		Number5 a = new Number5();
		
		try {
			a.fileBlowUp();	
			a.databaseBlowUp();
		} catch (SQLException | IOException e) {
			System.out.println("b");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void databaseBlowUp() throws SQLException {
		throw new SQLException();
	}
	
	void fileBlowUp() throws IOException {
		throw new IOException();
	}
}
