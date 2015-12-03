package practicetest12;

public abstract class Number6 { // Note the Abstract
	public int getNum() {
		return 45;
	}
	public abstract class Bar {
		public int getNum() {
			return 38;
		}
	}
	
	public static void main(String[] args) { // you can put static member/method inside an abstract class 
		Number6 t = new Number6() {
			@Override
			public int getNum() {
				return 22;
			}
		};
		
		Number6.Bar b = t.new Bar() {
				
		};
		
		System.out.println(t.getNum() + " " + b.getNum());
	}
}
