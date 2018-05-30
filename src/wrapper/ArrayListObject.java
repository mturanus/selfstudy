package wrapper;

import java.util.ArrayList;

public class ArrayListObject {
	
	
	public static void main(String[] args) {
		
		
	int [] in= {12, 1,5} ; 
	
	int [] in1= new int[3];
	
	in1[1]=2;
	
	System.out.println(in1[0]);
	
	in1[1]=4; 
	
	System.out.println(in1[1]);
	
	in1=in; 
	
	System.out.println(in1[2]);

	ArrayList arr=new ArrayList<>(); 
	
	arr.add("aba"); 
	
	arr.add('c'); 
	
	arr.add(123); 
	
	System.out.println(arr);
	
	ArrayList<Integer> arr1=new ArrayList<>(); 
	
	arr1.add(123); 
	
	
	
	
	
	


	}
	
}
