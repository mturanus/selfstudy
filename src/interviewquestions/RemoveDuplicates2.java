package interviewquestions;

import java.util.*;

public class RemoveDuplicates2 {
	public static void main(String[] args) {
		
	
	String str="abkajdsfkkasdfff"; 
	
	removeDuplicate(str); 

	}
	
	public static String removeDuplicate(String str) {
		
		ArrayList<Character> list=new ArrayList<>(); 
		
		char letters[]=str.toCharArray(); 
		

		Arrays.sort(letters); 
		
		char prev=letters[0]; 
		list.add(prev); 
		
		for(int i=1; i<letters.length; i++) {
			
			if(!(prev==letters[i])) {
				
				list.add(letters[i]); 
			}
			prev=letters[i]; 
		}
		
		for (int i=0; i<list.size(); i++) {
			
			System.out.print(list.get(i));
		}
		
		return str; 
	}

}
