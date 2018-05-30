package study;

import java.util.*;

public class GuessANumber {
	
	public static void main(String[] args) {
		
	
	Scanner input=new Scanner(System.in);
	
	
	Random number=new Random();
	
	int i=input.nextInt();
	int count=0;
	
	while(i!=9) {
		System.out.println("try again");
		i=input.nextInt();
		count++;
		
	}
	System.out.println("total tries is "+count);
}}
