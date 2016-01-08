package com.ryan.enthuware.io2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

//classes support retrieving a FileChannel. 
// 	FileInputStream, 
// 	FileOutputStream, and 
// 	RandomAccessFile do have a getChannel method that returns a FileChannel.
public class Number6 {
	public static void main(String[] args) throws IOException {
		String file = "c:\\temp\\test.txt";
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos = new FileOutputStream(file);
		RandomAccessFile ras = new RandomAccessFile(file, "rw");
		FileWriter fw = new FileWriter(file);
		FileChannel f1 = fis.getChannel();
		FileChannel f2 = fos.getChannel();
		FileChannel f3 = ras.getChannel();
		// FileChannel f4 = fw.getChannel();

		InputStream is = new FileInputStream(file);
	}
}
