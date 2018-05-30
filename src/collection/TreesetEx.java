package collection;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreesetEx {
	
	public static void main(String[] args) {
		
		Set<String> set= new TreeSet<>(); 
		
		SortedSet<String> sortedSet=new TreeSet<>(); 
		
		set.add("bc");
		
		set.add("aa"); 
		
		set.add("bb"); 
		
		
		sortedSet.add("bc"); 
		
		sortedSet.add("aa"); 
		
		sortedSet.add("bb"); 
		
		
		
		
		System.out.println(set);
		
		System.out.println(sortedSet);
		
	}

}
