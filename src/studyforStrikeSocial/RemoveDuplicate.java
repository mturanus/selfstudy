package studyforStrikeSocial;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		String str="Muammer"; 
		
		removeDuplicates(str); 
	}
	
	public static String removeDuplicates(String str) {
		
		Set<Character> set=new HashSet<>(); 
		
		StringBuilder sb=new StringBuilder(); 
		
		for(int i=0; i<str.length(); i++) {
			
			Character c=str.charAt(i); 
			
			if(!set.contains(c)) {
				
				set.add(c); 
				
				sb.append(c); 
				
			}
			
		}
		
		System.out.println(sb.toString());
		
		
		return sb.toString(); 
	}

}
