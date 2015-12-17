package com.ryan.ioandnio.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		File file = new File("file.txt");
		
		try(FileReader fr = new FileReader(file); 
				BufferedReader br = new BufferedReader(fr)) {
			String r = "";
			while((r = br.readLine()) != null) {
				System.out.println(r);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
