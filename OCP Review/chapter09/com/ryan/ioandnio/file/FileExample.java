package com.ryan.ioandnio.file;

import java.io.File;
import java.io.IOException;

public class FileExample {
	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		
		if(file.exists()) {
			System.out.println("File exists");
		} else {
			if(file.createNewFile()) {
				System.out.println("File created");
			} else {
				assert(false) : "Something is wrong";
			}
		}
	}
}
