package com.ryan.ioandnio.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
	public static void main(String[] args) {
		File file = new File("file.txt");
		
		try (FileWriter fw = new FileWriter(file); 
				BufferedWriter bfw = new BufferedWriter(fw)) {
			
			bfw.write("Hello\nWorld\nBufferedWriter");
			bfw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
