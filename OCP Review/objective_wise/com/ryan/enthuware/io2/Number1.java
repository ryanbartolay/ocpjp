package com.ryan.enthuware.io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Number1 {
	public static void main(String[] args) {
		Student s = null;
		try (FileInputStream fis = new FileInputStream("serialization/Student.ser");
		ObjectInputStream is = new ObjectInputStream(fis);) { 
			s = (Student) is.readObject(); 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Loaded " + s);
	}
}
