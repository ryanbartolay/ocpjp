package com.ryan.standard.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number12 {
	public static void main(String[] args) {
		/**
		 * The diamond operator, i.e. <> is always used on the right hand side of = sign. 
		 */
		String[] names = {"Alex", "Bob", "Charlie" };
		
		/**
		 * List<?> list means that list is a List of anything. It does not tell you 
		 * anything about the type of objects that will be there in the list except that 
		 * they are all Objects. 
		 * 
		 * Remember that List<?> is not same as List<Object>.
		 */
		List<?> list = new ArrayList<>(Arrays.asList(names));
		System.out.println(list.get(0));
		List<String> list2 = new ArrayList<>(Arrays.asList(names));
		System.out.println(list2.get(0));
	}
}
