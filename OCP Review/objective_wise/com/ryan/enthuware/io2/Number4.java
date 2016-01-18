package com.ryan.enthuware.io2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Bond {
	String ticker = "bac";
	double coupon = 8.3;
}
public class Number4 {
	public static void main(String[] args) throws Exception {
		File file = new File("enthuware/io2_4.txt");
		FileOutputStream os = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		
		Portfolio port = new Portfolio();
		
		Bond bond = new Bond();
		
		oos.writeObject(port);
		oos.writeObject(bond.ticker);
		oos.writeDouble(bond.coupon);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

		System.out.println(ois.readObject());
		System.out.println(ois.readObject());
		System.out.println(ois.readDouble());	
	}
}

class Portfolio implements Serializable {
	String accountName;
	transient Bond bond = new Bond();
	
	private void writeObject(ObjectOutputStream os) throws Exception {
		System.out.println("writeObject");
		os.defaultWriteObject();		
	}
	private void readObject(ObjectInputStream os) throws Exception {
		System.out.println("readObject");
		os.defaultReadObject();
	}
	@Override
	public String toString() {
		return "Portfolio [accountName=" + accountName + "]";
	}
}
