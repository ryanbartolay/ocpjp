package com.ryan.standard.test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Number54 {
	public static void copy(String records1, String records2) throws IOException { // this is required because it wasn't specified in catch
		try (InputStream is = new FileInputStream(records1);
				OutputStream os = new FileOutputStream(records2);) {
			byte[] buffer = new byte[1024]; 
			int bytesRead = 0; 

			while ((bytesRead = is.read(buffer)) != -1){
				os.write(buffer, 0, bytesRead);
				System.out.println("Read and written bytes " + bytesRead);
			}
		} catch (FileNotFoundException|SecurityException|IllegalArgumentException e ) { // this is ok
			
		}
	}
}
