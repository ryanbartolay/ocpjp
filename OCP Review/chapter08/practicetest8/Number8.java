package practicetest8;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

class CustomBundle extends ListResourceBundle {
	@Override
	protected Object[][] getContents() {
		return new Object [] [] {{"123", 456}};
	}
}
public class Number8 {
	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("practicetest8.CustomBundle", Locale.getDefault());
	//	Object obj = bundle.getInteger("123"); // non-existent
		Object obj = bundle.getObject("123");
		Object obj2 = bundle.getString("123");
	}
}
