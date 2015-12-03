package practicetest8;

public class Number7 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(8);
		System.out.println(sb.length() + " " + sb + " "); // 0  
		sb.insert(0, "abcdef");
		sb.append("789");
		System.out.println(sb.length() + " " + sb); // 9 abcdef789
	}
}
