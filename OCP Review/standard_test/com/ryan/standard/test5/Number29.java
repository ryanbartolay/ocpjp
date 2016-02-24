package com.ryan.standard.test5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Number29 {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "C:\\temp\\test1.txt";
		Scanner sc = new Scanner(new File(fileName), "UTF-8"); // 2nd argument is character set
		sc.useDelimiter("[0-9]"); // not setDelimiter
		
		while(sc.hasNextBoolean()) {
			System.out.println(sc.next());
		}
	}
}
