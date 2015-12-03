package practicetest8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Number1 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\d*"); 
		// * still output all indexes
		Matcher m = p.matcher("ab34ef");
		boolean b = false;
		while (b = m.find()) {
			System.out.println(m.start() + m.group());
		}
		/**
		 * Output
0
1
234
4
5
6
		 */
	}
}
