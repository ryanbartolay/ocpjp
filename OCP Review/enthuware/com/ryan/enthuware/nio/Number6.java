package com.ryan.enthuware.nio;

import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;

public class Number6 {
	/**
	 * The following is a list of constants provided by java.nio.file.StandardOpenOption:  
	 * 
	 * APPEND If the file is opened for WRITE access then bytes will be written to the end of the file rather than the beginning.  
	 * CREATE Create a new file if it does not exist.  
	 * CREATE_NEW Create a new file, failing if the file already exists. 
	 * DELETE_ON_CLOSE Delete on close.  
	 * DSYNC Requires that every update to the file's content be written synchronously to the underlying storage device.  
	 * READ Open for read access.  
	 * SPARSE Sparse file.  
	 * SYNC Requires that every update to the file's content or metadata be written synchronously to the underlying storage device.
	 * TRUNCATE_EXISTING If the file already exists and it is opened for WRITE access, then its length is truncated to 0.  
	 * WRITE Open for write access.
	 */
	public static void main(String[] args) {
		OpenOption[] a = new OpenOption[]{StandardOpenOption.WRITE, StandardOpenOption.DSYNC};
		
		for(OpenOption x : a) {
			System.out.println(x);
		}
		
		OpenOption[] b = new OpenOption[]{StandardOpenOption.READ, StandardOpenOption.APPEND};
		for(OpenOption x : b) {
			System.out.println(x);
		}
		OpenOption[] c = new OpenOption[]{StandardOpenOption.APPEND, StandardOpenOption.TRUNCATE_EXISTING};
		OpenOption[] d = new OpenOption[]{StandardOpenOption.APPEND, StandardOpenOption.SYNC};
		OpenOption[] e = new OpenOption[]{StandardOpenOption.READ, StandardOpenOption.SYNC};
	}
}
