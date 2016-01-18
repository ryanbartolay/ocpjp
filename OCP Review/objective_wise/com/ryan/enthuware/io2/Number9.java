package com.ryan.enthuware.io2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Number9 {
	public static void main(String[] args) {
		String file = "c:\\temp\\test.txt";
		try (Reader r = new BufferedReader(new FileReader(file));) {
			if(r.markSupported()) {
				Reader in  = (BufferedReader) r;
				System.out.println(in.read());
				in.mark(100); 
				/**
				 * readAheadLimit Limit on the number of characters that 
				 * may be read while still preserving the mark. An attempt 
				 * to reset the stream after reading characters up to this limit 
				 * or beyond may fail. A limit value larger than the size of the 
				 * input buffer will cause a new buffer to be allocated whose size 
				 * is no smaller than limit. Therefore large values should be used 
				 * with care.
				 */
				
				System.out.println(in.read());
				System.out.println(in.read());
				in.reset();
				
				System.out.println(in.read());
				in.reset();
				
				System.out.println(in.read());
			} else {
				System.out.println("Mark not supported");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
