package study;

import java.util.*;

public class PrintEvenOrOdd {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int n1,n2;
		String mode;
		
		System.out.println("Enter 2 numbers");
		n1=input.nextInt();
		n2=input.nextInt();
		
		System.out.println("even or odd mode: ");
		mode=input.next();
		
		
		if (n1<n2) {
			
			for (int miles=n1; miles <=n2; miles++) {
				
				if (mode.equals("even")&&miles%2==0) {
					
					System.out.println(miles +" ");
				}else if (mode.equals("odd")&&miles%2 !=0) {
					
					System.out.println(miles+ " ");
					
				}
			}
		}else if (n1>n2) {
			

			for (int miles=n2; miles <=n1; miles++) {
				
				if (mode.equals("even")&&miles%2==0) {
					
					System.out.println(miles +" ");
				}else if (mode.equals("odd")&&miles%2 !=0) {
					
					System.out.println(miles+ " ");
					
				}
		}
		
	}

	}
	}
