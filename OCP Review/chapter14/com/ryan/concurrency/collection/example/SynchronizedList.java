package com.ryan.concurrency.collection.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedList {
	public static void main(String[] args) {
		List<String> lstring = 
				Collections.synchronizedList(new ArrayList<String>());
		Set<String> sstring = 
				Collections.synchronizedSet(new HashSet<String>());
		Map<String, String> mstring = 
				Collections.synchronizedMap(new HashMap<String, String>());
		
		
		  CopyOnWriteArrayList<String> threadSafeList = new CopyOnWriteArrayList<String>();
	        threadSafeList.add("Java");
	        threadSafeList.add("J2EE");
	        threadSafeList.add("Collection");
	      
	        //add, remove operator is not supported by CopyOnWriteArrayList iterator
	        Iterator<String> failSafeIterator = threadSafeList.iterator();
	        while(failSafeIterator.hasNext()){
	            System.out.printf("Read from CopyOnWriteArrayList : %s %n", 
	            		failSafeIterator.next());
	            //failSafeIterator.remove(); 
	            	//not supported in CopyOnWriteArrayList in Java
	        }

		
	}
}
