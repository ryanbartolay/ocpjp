package com.ryan.enthuware.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Number13 {

	public static void main(String[] args) {
		//Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>();
		
		Map m = new HashMap();
		m.put("1", new ArrayList());//1       
		m.put(1, new Object());//2       
		m.put(1.0, "Hello");//3       
		System.out.println(m);
	}

}
