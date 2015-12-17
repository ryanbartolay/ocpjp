package com.ryan.ioandnio.directory;

import java.io.File;
import java.io.IOException;

public class FileDirectoryExample {

	public static void main(String[] args) throws IOException {
		// single directory
		File dir = new File("directory/");
		dir.mkdir();
		
		// multiple heirarchal
		File dirs = new File("directory/file/2015/");
		//dirs.mkdirs();
		
		File file = new File(dirs, "file.txt");
		// will throw exception if directory doesnt exists
		file.createNewFile(); 
	}
}
