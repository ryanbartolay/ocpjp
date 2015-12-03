package practicetest;

import java.util.List;

public class Number8 {
	// 1. method declares List<E> as a return type
	// 2. 	when parameter E is declared as Integer return E MUST be declared as Integer
	//		when parameter E is declared as Number return E MUST be declared as Number
	public static <E extends Number> List<E> process(List<E> nums) {
		return null;
	}
	
	public static void main(String[] args) {
		// 3 accepted answers
		
		/*ArrayList<Integer> input = null;
		List<Integer> output = null;
		*/
		List<Number> input = null;
		List<Number> output = null;

		/*List<Integer> input = null;
		List<Integer> output = null;*/
		
		 output = Number8.process(input);
		 
		 		 
	}
}
