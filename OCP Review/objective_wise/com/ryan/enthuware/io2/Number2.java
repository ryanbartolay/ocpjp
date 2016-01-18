package com.ryan.enthuware.io2;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Number2 {
	public static void main(String[] args) {
		String file= "enthuware/io2_2.txt";
		
		try(OutputStream os = new FileOutputStream(file);
				DataOutputStream dos = new DataOutputStream(os)) {
			//dos.writeInt(11);
			dos.writeInt(99999999);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
