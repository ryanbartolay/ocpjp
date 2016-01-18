package com.ryan.enthuware.assertionsandexceptions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Number14 {
	public static void copy(String record1, String record2) {
		try(InputStream is = new FileInputStream(record1);
			OutputStream os = new FileOutputStream(record2)) {
			// The auto-closeable variables defined in the try-with-resources statement are implicitly final. 
			// Thus, they cannot be reassigned.
			// if(os == null) os = new FileOutputStream("default.txt"); 
			byte[] buffer = new byte[1024];
			int bytesRead = 0;
			while ((bytesRead = is.read(buffer)) != -1) { //3 
				os.write(buffer, 0, bytesRead); 
				System.out.println("Read and written bytes " + bytesRead);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
