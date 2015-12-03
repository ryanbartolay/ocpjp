package com.ryan.search;

import com.ryan.utility.SystemOutUtility;

public class RegExExample {
	public static void main(String[] args) {
		
		SystemOutUtility.showResult("[a-dA]", "!ABCD 23 # de# #ab"); // range a~c		
		
		SystemOutUtility.showResult("[a-dA 1-2 _]", "!AB _ CD 23 # de# #ab"); // range a~c		
		
		SystemOutUtility.showGroupResult("0[xX][0-9a-fA-F]", "!0x928a 0XF 0xG # de# #ab"); // search quatifier (getting hexadecimals)
		
		SystemOutUtility.showGroupResult("\\d\\d\\d([-/\\s])?\\d\\d\\d\\d", 
				"8745964 87 8566 806-5964 888 5555"); // return all telephone numbers
		// ? - is just saying inside the parameter or not
		
		// -----------------------------------------------------
		// QUANTIFIERS
		// -----------------------------------------------------
		SystemOutUtility.showGroupResult("0[xX]([0-9a-fA-F])+", "!0x928a 0XF 0xG # de# #ab"); // with + quatifier 
		
		SystemOutUtility.showGroupResult("proj1([^,])*", "proj2.txt,proj1ryan.java,proj1.txt"); // negation negate all comma
		// * - is just saying give me zero or more characters until end
		// * - will still print all indexes
		
		SystemOutUtility.showGroupResult("a.c", "ac abc a c"); // predefined dot
		// . - any character can be served here
		/** Matched positions 
			3 abc
			7 a c
		 */
		
		SystemOutUtility.showGroupResult(".*xx", "yyxxxyxx"); // greedy
		// .* any character unli length (including space)
		/** Matched positions
		 * 0 yyxxxyxx
		 */
		SystemOutUtility.showGroupResultWithEnd(".*?xx", "yyxxxyxx"); // reluctant
		// .*? any character prefix
		/** Matched positions 
		 * 0 yyxx
		 * 4 xyxx
		 */
		
		SystemOutUtility.showGroupResult("a?", "baba");
	}
}
