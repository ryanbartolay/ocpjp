package com.ryan.enthuware.io4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Objects of a class that is not marked Serializable cannot be serialized. In this question, class Booby does 
 * not implement Serializable and so its objects cannot be serialized. Class Dooby implements serializable and 
 * since Tooby extends Dooby, it is serializable as well. 
 * 
 * Now, when you serialize an object of class Tooby, only the data members of Dooby and Tooby will be serialized. 
 * Data members of Booby will not be serialized. Thus, the value of i (which is 100) at the time of serialization 
 * will not be saved in the file.
 * 
 * When reading the object back (i.e. deserializing), the constructors of serializable classes are not called. 
 * Their data members are set directly from the values present in serialized data. Constructor for unserializable 
 * classes is called. Thus, in this case, constructor of Tooby and Dooby is not called but of Booby is called. 
 * Therefore, i is set in the constructor to 10 and j and k are set using the data from the file to 20 and 30 
 * respectively.
 * 
 * @author ryan.bartolay
 *
 */
class Booby {
	int i; public Booby() { i = 10; System.out.println("Booby"); }
} 

class Dooby extends Booby implements Serializable {
	int j; public Dooby() { i = 20; System.out.println("Dooby"); }
}

class Tooby extends Dooby {
	int k; public Tooby() { i = 30; System.out.println("Tooby"); }
}

public class Number1 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Tooby t = new Tooby();
		t.i = 100;
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enthuware/io4_1.txt"));) {
			oos.writeObject(t);
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enthuware/io4_1.txt"));) {
			Tooby t2 = (Tooby) ois.readObject();
			System.out.println(t2.i + " " + t2.j + " " + t2.k);
		}
	}
}
