package com.ryan.search;

import com.ryan.utility.SystemOutUtility;

public class StringSearchExample {
	private static String source = "a1b_2a3$a b 4a5a s!da + #4 da aba@ab_ a";
	
	public static void main(String[] args) {
				
		SystemOutUtility.showResult("ab", source);		
				
		SystemOutUtility.showResult("\\d", source); // digits
				
		SystemOutUtility.showResult("\\D", source); // non-digits
				
		SystemOutUtility.showResult("\\s", source); // spaces
		
		SystemOutUtility.showResult("\\S", source); // non spaces
		
		SystemOutUtility.showResult("\\w", source); // a~z _ 0~9		
		
		SystemOutUtility.showResult("\\W", source); // non a~z _ 0~9		
		
		SystemOutUtility.showResult("\\b", source); // boundary of words		
		
		SystemOutUtility.showResult("\\B", source); // non-boundary of words		
		
		// 0 3 4 5 9 11
		SystemOutUtility.showResult("\\b", "w2w w$ &#w2"); // boundary of words
		
		// 1 2 6 7 8 10
		SystemOutUtility.showResult("\\B", "w2w w$ &#w2"); // non-boundary of words		
		
		SystemOutUtility.showResult("\\b", "!ABCD 23 # de# #ab"); // boundary of words (start of word to next space)
		
		SystemOutUtility.showResult("\\B", "!ABCD 23 # de# #ab"); // non-boundary of words		
		
	}

}
