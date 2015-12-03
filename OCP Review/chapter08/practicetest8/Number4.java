package practicetest8;

public class Number4 {
	public static void main(String[] args) {
		String in = "1 a2 b 3 c4d 5e";
		String[] chunks = in .split(" ");
		
		System.out.println("count " + chunks.length);
		for(String s : chunks) {
			System.out.println(s);
		}
/*
count 6
1
a2
b
3
c4d
5e
 */
		
		String[] chunks2 = in .split("\\d");
		
		System.out.println("count " + chunks2.length);
		
		for(String s : chunks2) {
			System.out.println(">" + s + "<");
		}
/*
count 6
><
> a<
> b <
> c<
>d <
>e<		
 */
	}
}
