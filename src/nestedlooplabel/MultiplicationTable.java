package nestedlooplabel;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		for(int i=3; i<=5; i++) {
			
			for (int j=1; j<=10; j++) {
				
				System.out.println(i+"*"+j+"="+(i*j));
				
			}
		}
		
		for(int n=1; n<=10;n++) {
			
			if (n !=3 && n!=4&& n!=5) {
				
				continue;
			}
			
			for (int m=1; m <=10 ; m++ ) {
				
				System.out.println(n+"*"+m+"="+(n*m));
			}
		}
	}
}
