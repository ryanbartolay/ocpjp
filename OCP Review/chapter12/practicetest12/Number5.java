package practicetest12;

public class Number5 {
	public String hh = "231231";
	public static void main(String[] args) {
		class Horse {
			public String name;
			public Horse(String s) {
				name = s;
			}
		}
		
		Object obj = new Horse("Hello");
		//System.out.println(obj.name); // compile error because name is not a member of Object
	}
}
