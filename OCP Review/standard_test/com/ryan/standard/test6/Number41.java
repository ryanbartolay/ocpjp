package com.ryan.standard.test6;

import java.util.StringTokenizer;

public class Number41 {
	public static void main(String[] args) {
		String str = "DoDELIMNotDELIMDoDELIMThis"; 
		StringTokenizer st = new StringTokenizer(str, "DELIM"); 
		while (st.hasMoreTokens()) {
			String s = st.nextToken();
			System.out.print(s+", ");
			}
	}
}
