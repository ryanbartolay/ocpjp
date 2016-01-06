package com.ryan.io.serialization;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DataInputExample {
	public static void main(String[] args) {
		File file = new File("serialization/Data.ser");
		
		try (InputStream input = new FileInputStream(file); 
				DataInputStream inputStream = new DataInputStream(input)) {
			
			while (inputStream.available() > 0) {
				System.out.println(inputStream.readUTF());				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
