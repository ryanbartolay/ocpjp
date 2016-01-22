package com.ryan.standard.test1;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * This will throw exception IO and suppresed RTE
 * 
Exception in thread "main" java.io.IOException: Unknown
	at com.ryan.standard.test1.Number61.<init>(Number61.java:12)
	at com.ryan.standard.test1.Number61.main(Number61.java:28)
	Suppressed: java.lang.RuntimeException: RTE while closing D1
		at com.ryan.standard.test1.Number61.close(Number61.java:23)
		at com.ryan.standard.test1.Number61.main(Number61.java:30)
 * @author ryan.bartolay
 */
public class Number61  implements AutoCloseable{ 
	
	String header = null;
	
	public Number61(String name) throws IOException{ 
		header = name; 
		if("D2".equals(name)) 
			throw new IOException("Unknown");
		
		System.out.println(header + " Opened");
	}  
	
	public String read() throws IOException{
		return "";
	}

	public void close(){
		System.out.println("Closing device "+header);
		throw new RuntimeException("RTE while closing "+header);
	}

	public static void main(String[] args) throws Exception { 
		System.out.println(((Calendar)new GregorianCalendar()).get(Calendar.YEAR));
		
		/**
		 *  Any exception that is thrown while closing a resource is added to the list of 
		 *	suppressed exceptions of the exception thrown while opening a resource 
		 *	(or thrown from the try block.)
		 */
		try(Number61 d1 = new Number61("D1");
				Number61 d2 = new Number61("D2")){ 
			throw new Exception("test"); // throw new Exception("test") is never executed
		}
	}
}