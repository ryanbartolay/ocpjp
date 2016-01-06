package com.ryan.io.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.ryan.enthuware.io2.Student;

public class SerializedObjectExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.setName("Honda");
		car.setPlate_no("UBE 425"); // transient
		car.setMax_seats(6);
		
		File file = new File("Car.ser");
		try(FileOutputStream fileOut = new FileOutputStream(file);
				ObjectOutput output = new ObjectOutputStream(fileOut);) {
				output.writeObject(car);
				output.flush();
		} catch (IOException e) {
			
		}
		
		Student s = new Student(); 
		s.name = "bob"; 
		s.grade = "10";
		
		
		File fs = new File("serialization/Student.ser");
		try(FileOutputStream fileOut = new FileOutputStream(fs);
				ObjectOutput output = new ObjectOutputStream(fileOut);) {
				output.writeObject(s);
				output.flush();
		} catch (IOException e) {
			
		}
	}
}
