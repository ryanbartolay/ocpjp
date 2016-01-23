package com.ryan.standard.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Number64 {
	public static void main(String[] args) {
		
		List<String> x = new ArrayList<String>();
		
		
		Map<String, String> hmap = new HashMap<String, String>(); // no sort
		hmap.put("a", "apple"); 
		hmap.put("b", "boy"); 
		hmap.put("c", "cat");
		hmap.put("aa", "apple1"); 
		hmap.put("bb", "boy1"); 
		hmap.put("cc", "cat1");

		x.addAll(hmap.keySet());
		System.out.println(hmap);
		Collections.sort(x);
		
		System.out.println(x);
		System.out.println("==============================");
		
		
		NavigableMap<String, String> mymap = new TreeMap<String, String>(); // TreeMap is Sorted Map
		mymap.put("a", "apple"); 
		mymap.put("b", "boy"); 
		mymap.put("c", "cat");
		mymap.put("aa", "apple1"); 
		mymap.put("bb", "boy1"); 
		mymap.put("cc", "cat1");

		System.out.println(mymap);

		mymap.pollLastEntry(); //LINE 1 
		System.out.println(mymap);
		mymap.pollFirstEntry(); //LINE 2  
		System.out.println(mymap);
		NavigableMap<String, String> tailmap = mymap.tailMap("bb", false); //LINE 3
		System.out.println(tailmap);
		System.out.println(tailmap.pollFirstEntry()); //LINE 4         
		System.out.println(mymap.size()); //LINE 5
		System.out.println(mymap);
	}
}
