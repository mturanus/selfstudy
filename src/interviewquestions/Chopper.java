package interviewquestions;

import java.util.Scanner;

public class Chopper {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("String to chop: ");
		
		String word = input.next();
		
		for (int index=0; index<word.length(); index+=2) {
			
			if (index+1<word.length()) {
				System.out.println(word.charAt(index)+""+word.charAt(index+1));
			}else {
				System.out.println(word.charAt(index));
			}
		}
	}

}
