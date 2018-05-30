package collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	
	public static void main(String[] args) {
		
		List<String> linkedL	= new LinkedList<>(); 
		
		linkedL.add("John"); 
		linkedL.add("Vijay"); 
		linkedL.add("Bob"); 
		linkedL.add("Mark"); 
		
		System.out.println(linkedL.size()+":"+linkedL);
		
		System.out.println(linkedL.indexOf("Vijay"));
		
		LinkedList <String> linkedLL=(LinkedList)linkedL	; 
		
		linkedLL.addFirst("Epson");
		
		linkedLL.addLast("Logi");
		
		System.out.println(linkedLL);
		
		linkedLL.add(1, "Apple");
		
		System.out.println(linkedLL);
		
		linkedLL.removeFirst(); // if list is empty, it will throw exception
		
		System.out.println(linkedLL);

		linkedLL.poll(); // will not throw exception. Delete first element in the list
		
		System.out.println(linkedLL);
		
		System.out.println(linkedLL.peekFirst());// peek first choose the first element in the list however it couldn't delete from list. 
		
		System.out.println(linkedLL.peekLast());
		
		System.out.println(linkedLL.pollFirst());//pollFirst choose the first element in the list but it deletes the first element in the list. 
		System.out.println(linkedLL.pollLast());
		
		System.out.println(linkedLL);
	}

}
