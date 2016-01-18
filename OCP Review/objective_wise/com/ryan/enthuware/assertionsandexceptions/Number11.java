package com.ryan.enthuware.assertionsandexceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Number11 {
	public static void copy(String record1, String record2) {
		// will not compile because IOException is not catched
		try(InputStream is = new FileInputStream(record1);
			OutputStream os = new FileOutputStream(record2)) {
			
			byte[] buffer = new byte[1024];
			int bytesRead = 0;
			/*while ((bytesRead = is.read(buffer)) != -1) { //3 
				os.write(buffer, 0, bytesRead); 
				System.out.println("Read and written bytes " + bytesRead);
			}*/
		//} catch (FileNotFoundException | IndexOutOfBoundsException e) {
		} catch (IOException e) { // should be like this
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
