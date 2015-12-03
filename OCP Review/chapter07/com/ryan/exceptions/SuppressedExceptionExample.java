package com.ryan.exceptions;

import java.io.IOException;

public class SuppressedExceptionExample {
	public static void main(String[] args) {
		try(One o = new One()) {
			throw new IOException("Hello");
		} catch(Exception e) {
			e.printStackTrace();
			/*System.err.println(e.getMessage());
			for(Throwable t : e.getSuppressed())
				System.out.println(t);*/			
		}
	}
}

class One implements AutoCloseable {

	@Override
	public void close() throws Exception {
		throw new IOException("Closing");
	}
}