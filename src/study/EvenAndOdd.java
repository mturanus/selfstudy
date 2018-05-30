package study;

import java.util.*;

public class EvenAndOdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n1, n2;

		System.out.println("Enter 2 numbers ");
		n1 = input.nextInt();
		n2 = input.nextInt();

		if (n1 < n2) {

			for (int miles = n1; miles <= n2; miles++) {

				System.out.println(miles + " ");
			}

		} else if (n1 > n2) {
			for (int miles = n1; miles >= n2; miles--) {

				System.out.println(miles + " ");
			}
		}

	}

	public void push(Integer integer) {
		// TODO Auto-generated method stub
		
	}

}
