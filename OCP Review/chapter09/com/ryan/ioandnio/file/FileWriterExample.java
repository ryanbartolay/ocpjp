package com.ryan.ioandnio.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
	public static void main(String[] args) {
		File file = new File("file2.txt");
		
		try(FileWriter fw = new FileWriter(file);) {
			fw.write("Hello\nWorld");
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
