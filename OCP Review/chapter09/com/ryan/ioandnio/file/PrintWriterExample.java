package com.ryan.ioandnio.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
	public static void main(String[] args) {
		File file = new File("file.txt");
		
		
		// java 1.4 and below
		// you need to instantiate the file to FileWriter first
		// before passing to PrintWriter
		try (FileWriter fw = new FileWriter(file);
				PrintWriter pw4 = new PrintWriter(fw);) {
			pw4.println("RYan");
			pw4.println(0x04212);
			pw4.println(12345);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		// java 1.5 and above
		// you can construct PrintWriter with File
		try (PrintWriter pw5 = new PrintWriter(new File("file2.txt"));) {
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
