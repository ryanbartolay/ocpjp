package com.ryan.ioandnio.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	private static char[] cbuf = new char[50];
	public static void main(String[] args) {
		File file = new File("file.txt");
		
		try(FileReader fr = new FileReader(file)) {
			System.out.println("size : " + fr.read(cbuf));
			
			for(char c : cbuf) {
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
