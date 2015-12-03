package practicetest;

import java.util.HashMap;
import java.util.Map;

public class Number5 {
	
	// private Map accountTotals = new HashMap();
	private Map<String, Integer> accountTotals = new HashMap<>();
	private int retirementFund;
	
	
	public int getBalance(String accountname) {
		/*Integer total = (Integer) accountTotals.get(accountname);
		if(total == null) {
			total = Integer.valueOf(0);
		}
		return total.intValue();*/
		Integer total = accountTotals.get(accountname);
		return total == null ? 0 : total;
	}
	
	public void setBalance(String accountName, int amount) {
		accountTotals.put(accountName, amount);
	}
	
	public static void main(String[] args) {
		Number5 num = new Number5();
		num.setBalance("ryan", 123);
		
		System.out.println(num.getBalance("rsaaan"));
	}
}
