package com.ryan.enthuware.io2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Number8 {
	public static void main(String[] args) throws IOException {
		String file = "c:\\temp\\test.txt";
		FileReader fr = new FileReader(file);		
		BufferedReader br = new BufferedReader(fr);
		String str = null;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
	}
}
