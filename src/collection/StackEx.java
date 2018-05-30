package collection;

import java.util.Stack;

public class StackEx {
	
	public static void main(String[] args) {
		
		//Last in First Out. So it add on top of each other. Then last in element when you try to take it out you need the peek first one. 
		
		Stack<String> stack=new Stack<>(); 
		
		stack.push("Java"); 
		stack.push("OCA"); 
		stack.push("10X"); 
		stack.push("Selenium Cookbook"); 
		
		System.out.println(stack.peek());
		
		System.out.println(stack);
		
		System.out.println(stack.search("java"));
		
		
	}

}
