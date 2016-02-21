package com.ryan.standard.test4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Number25 {
	public static void main(String[] args) {
		writeData();
	}
	
	public static void writeData() {
		Path p1 = Paths.get("c:\\company\\records\\customers.dat");
		
		Path p2 = p1.resolveSibling("client.dat");
		//LINE 20  - INSERT CODE HERE          
		try (BufferedReader br = new BufferedReader(new FileReader(p1.toFile()));
				BufferedWriter bw = new BufferedWriter(new FileWriter(p2.toFile()))) {
			String line = null;
			
			while ((line = br.readLine()) != null) {
				bw.write(line+"\r\n");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
