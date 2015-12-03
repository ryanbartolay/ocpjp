package com.ryan.autocloseable;

import java.io.Closeable;
import java.io.IOException;

public class MyResourceCloseable implements Closeable {

	@Override
	public void close() throws IOException { // throws only RuntimeException and IOException
		
	}

}
