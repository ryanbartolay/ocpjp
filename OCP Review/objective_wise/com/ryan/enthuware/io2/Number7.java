package com.ryan.enthuware.io2;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
Value 	Meaning
"r"		Open for reading only. Invoking any of the write methods of the resulting object will 
			cause an IOException to be thrown.
"rw"	Open for reading and writing. If the file does not already exist then an attempt will 
			be made to create it.
"rws"	Open for reading and writing, as with "rw", and also require that every update to the file's 
			content or metadata be written synchronously to the underlying storage device.
"rwd"  	Open for reading and writing, as with "rw", and also require that every update to the file's 
			content be written synchronously to the underlying storage device.
*/
public class Number7 {
	public static void main(String[] args) throws IOException {
		String file = "c:\\temp\\test.txt";		
		
		RandomAccessFile raf = new RandomAccessFile(file, "rwd");		
		FileChannel f3 = raf.getChannel();
		
		raf.writeUTF("A B C D E");
		// raf.writeChar(v);
		//raf.writeChars("hello world");
		raf.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream(file));
		System.out.println(dis.readUTF());
		// System.out.println(dis.read());
	}
}
