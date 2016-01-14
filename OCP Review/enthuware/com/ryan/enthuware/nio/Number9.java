package com.ryan.enthuware.nio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Number9 {
	public static void main(String args[]) throws IOException {
			
		Path p1 = Paths.get("c:\\Temp\\records\\customers.dat");
		
		try {
			Files.setAttribute(p1, "dos:hidden", false, LinkOption.NOFOLLOW_LINKS);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//LINE 20  - INSERT CODE HERE          
		
		Path p2 = p1.resolveSibling("clients.dat");
		//Path p2 = Paths.get("c:", p1.subpath(0, 2).toString(), "clients.dat");		
		System.out.println(p2.toString());
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
