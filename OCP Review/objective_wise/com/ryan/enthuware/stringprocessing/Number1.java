package com.ryan.enthuware.stringprocessing;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) {
		try(InputStream fs = Number1.class.getResourceAsStream("/familia.csv");) {
			Scanner s = new Scanner(fs);
			s.useDelimiter(",");
			
			while(s.hasNext()) {
				if(s.hasNextDouble()) {
					System.out.println(s.nextDouble());
				} else if(s.hasNextInt()) {
					System.out.println(s.nextInt());
				} else {
					System.out.println(s.next());
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
