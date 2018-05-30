package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		
		List<String> l=new ArrayList<>(); 
		
		l.add("water"); 
		l.add("coffee"); 
		l.add("bottle"); 
		l.add("cup"); 
		
		System.out.println(l.indexOf("coffee"));
		
		String[] array=l.toArray(new String[4]);
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, "coffee"));
		
		int [][] nums=new int [2][3]; 
		
		List<List<Integer>> list = new ArrayList(); 
		
		System.out.println(l);
		
		// to clear the array
		
		l.clear();
		
		System.out.println(l);
		
		// Resize Array WorkAround: 
		
		int [] numbers= {23,5,6,7}; 
		
		System.out.println(Arrays.toString(numbers));
		
		numbers=Arrays.copyOf(numbers, numbers.length+2); 
		
		numbers[4]=33; 
		
		numbers[5]=45; 
		
		System.out.println(Arrays.toString(numbers));
		
		
	}

}
