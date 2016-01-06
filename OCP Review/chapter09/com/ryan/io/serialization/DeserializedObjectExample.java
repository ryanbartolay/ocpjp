package com.ryan.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class DeserializedObjectExample {
	public static void main(String[] args) {
		File file = new File("Car.ser");
		
		try(FileInputStream inStream = new FileInputStream(file);
				ObjectInput input = new ObjectInputStream(inStream);) {
			
			Car car = (Car) input.readObject();
			System.out.println(car);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
