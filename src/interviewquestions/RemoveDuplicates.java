package interviewquestions;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
public static void main(String[] args) {
	
	String str="aksjdfksdfkk"; 
	String java="java"; 
	System.out.println(removeDuplicates(str)); 
	System.out.println(removeDuplicates(java));
	
	
}

public static String removeDuplicates(String str) {
	
	Set<Character> set =new HashSet<>(); 
	
	StringBuilder sf=new StringBuilder(); 
	
	for(int i=0; i<str.length(); i++) {
		
		Character c=str.charAt(i); 
		
		if(!set.contains(c)) {
			
			set.add(c); 
			sf.append(c); 
			
		}
	}
	
	return sf.toString(); 
}
}
