package com.ryan.io.serialization;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputExample {
	public static void main(String[] args) {
		
		File file = new File("serialization/Data.ser");
		try (FileOutputStream out = new FileOutputStream(file);
				DataOutputStream output = new DataOutputStream(out);) {
			output.writeUTF("Ryan Bartolay");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
