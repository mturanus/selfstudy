package interviewquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacter {
	
	public static void main(String[] args) {
		
		String str="Sandap"; 
		
		displayDuplicates(str);
		
	}
	
	public static String displayDuplicates(String str) {
		//Creating a hashmap which contain char as key and it's occurrences as value
		Map<Character, Integer> map=new HashMap<>(); 
		//converting input string to char array
		char [] characters=str.toCharArray(); 
		
		for(char c: characters) {
			// if char is not present in map
			//putting this char to map with 1 as tis's value
			if(!map.containsKey(c)) {
				map.put(c, 1); 
				
				
			}else {
				//if char is present in our map 
				//then incrementing it's integer count by 1
				map.put(c, map.get(c)+1); 
			}
			
			//getting a set containing all keys of map
			Set<Map.Entry<Character, Integer>> entrySet=map.entrySet(); 
			//iterating a set containing all keys of map
			for(Map.Entry<Character, Integer> entry : entrySet) {
				
				if(entry.getValue()>1) {
					
					//if any char has a count more than 1, printing it's count
					System.out.printf("%s  :  %d  %n" , entry.getKey(), entry.getValue());
				}
			}
			
		}
		
		return str;
		
	}

}
