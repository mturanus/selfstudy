package studyforStrikeSocial;

public class PrintNumbersUpto10 {
	
	public static void main(String[] args) {
		
	}
	
	
	public static void printNumbers(int n) {
		
		if(n<=10) {
			
			System.out.println(n);
			
			printNumbers(n+1); 
			
		}
	}

}
