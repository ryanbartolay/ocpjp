package practicetest;

import java.util.HashMap;
import java.util.Map;

public class Number4 {
	public static void main(String[] args) {
		Map<ToDos, String> m = new HashMap<>();
		ToDos t1 = new ToDos("Monday");
		ToDos t2 = new ToDos("Monday");
		ToDos t3 = new ToDos("Tuesday");
		
		m.put(t1, "lawn");
		m.put(t2, "hello");
		m.put(t3, "hi");
		
		System.out.println(m.size());
	}
}

class ToDos {
	
	private String str;
	
	public ToDos(String string) {
		this.str = string;
	}
	
	public String getStr() {
		return str;
	}
	
	@Override
	public boolean equals(Object toDo) {
		if(toDo instanceof ToDos) {
			if(this.str.equals(((ToDos)toDo).getStr())) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 9;
	}

}
