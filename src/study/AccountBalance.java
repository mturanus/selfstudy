package study;

import java.util.*;

public class AccountBalance {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("please enter the balance: "); 
		
		int balance=input.nextInt();
		
		int counter=0;

		
		do {
			
			System.out.println("please make a purchase: ");	
			
			int purchase=input.nextInt();
			
			if (purchase>balance) {
				System.out.println("Transaction declined");
				break;
			}
			
			balance-=purchase;
			counter++;
	
	}while (balance>0);
		System.out.println("you're out of money");
		System.out.println("your balance: " +balance);
		System.out.println("Transactions count: "+counter);
}
}
