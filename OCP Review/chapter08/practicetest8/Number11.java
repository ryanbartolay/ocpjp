package practicetest8;

import java.text.NumberFormat;

public class Number11 {
	public static void main(String[] args) {
		String s = "987.123456";
		double d = 987.123456d;
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(4);
		
		System.out.println(nf.format(d));
		
		try {
			double d2 = (double) nf.parse(s); // parse() is a catched exception
			System.out.println(nf.format(d2)); // format() non catched exception
		} catch (Exception e) {
			System.out.println("got exc");
		}
	}
}
