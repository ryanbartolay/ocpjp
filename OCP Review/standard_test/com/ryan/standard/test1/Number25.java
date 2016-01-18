package com.ryan.standard.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Number25 {
	public static void copy(String records1, String records2) throws IOException {
		try (InputStream is = new FileInputStream(records1); 
				OutputStream os = new FileOutputStream(records2);) {
			byte[] buffer = new byte[1024]; 
			int bytesRead = 0; 
			
			while ((bytesRead = is.read(buffer)) != -1) {
				os.write(buffer, 0, bytesRead);
			}
		} catch (FileNotFoundException | java.io.InvalidClassException e) { 
			e.printStackTrace(); 
		}
	}
	
	public static void main(String[] args) throws Exception { 
		copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");
	}
}
