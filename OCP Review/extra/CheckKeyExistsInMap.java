import java.util.LinkedHashMap;
import java.util.Map;


public class CheckKeyExistsInMap {
	public static void main(String[] args) {
		Map<String, String> m = new LinkedHashMap<String, String>() {
			{
				put("a", "Ryan");
				put("b", "Ryan");
				put("c", "Ryan");
			}
		};
		System.out.println(m.containsKey("a"));
		
		/*Iterator<Entry<String, String>> s = m.entrySet().iterator();
		
		while(s.hasNext()) {
			System.out.println(s.next().getKey());
		}*/
		
		//System.out.println(s.getKey().contains("a"));
	}
}
