package interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicaInStringAndCount {
	
	public static Map count(String s) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
		  char c = s.charAt(i);
		  if (map.containsKey(c)) {
		    int cnt = map.get(c);
		    map.put(c, ++cnt);
		  } else {
		    map.put(c, 1);
		
		  }
		}
		return map;
		
	}
	
	public static void main(String[] args) {
		
		
		for (Object str : FindDuplicaInStringAndCount.count("fanantikkk").keySet()) {
			
			System.out.println(FindDuplicaInStringAndCount.count("fanantikkk").get(str)+" " + FindDuplicaInStringAndCount.count("fanantikkk").get(str));
			
			
			
		}
	}
}
