package com.ryan.standard.test7;

public class Number22 {
	public static void m1() throws Exception {
		throw new Exception("Exception from m1");
	}

	public static void m2() throws Exception {
		try {
			//throw new RuntimeException("Exception not from finally");
			m1();
		} catch (Exception e) {
			throw e;
		} finally {
			throw new RuntimeException("Exception from finally");
		}
	}

	public static void main(String[] args) {
		try{ 
			System.out.println("checker");
			m2(); 
		}catch(Exception e){ 
			e.printStackTrace();
			Throwable[] ta = e.getSuppressed(); 
			for(Throwable t : ta) { 
				System.out.println(t.getMessage()); 
			}
		} 
	}
}
