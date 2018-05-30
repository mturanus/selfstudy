package collection;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		// Vector is syncronized
		Vector<String> vector = new Vector<>();

		vector.add("Apple");

		System.out.println(vector);
		
		vector.addElement("Banana");
		
		System.out.println(vector);
		
		

	}

}
