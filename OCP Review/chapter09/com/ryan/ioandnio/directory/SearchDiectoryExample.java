package com.ryan.ioandnio.directory;

import java.io.File;

public class SearchDiectoryExample {
	public static void main(String[] args) {
		File dirs = new File("directory/file/");
		String[] files = new String[100];
		files = dirs.list();
		
		for(String file : files) {
			System.out.println(file);
		}
	}
}
