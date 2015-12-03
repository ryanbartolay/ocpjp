package practicetest12;

public class Number4 {
	public static void main(String[] args) {
		Object obj = new Object() {
			@Override
			public boolean equals(Object obj) {
				return true;
			}			
		}; // without the semi colon, it will not compile and error is in this line only
		System.out.println(obj.equals("Ryan"));
	}
}
