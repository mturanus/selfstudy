package studyforStrikeSocial;

public class MissingNumberArray {
	
	public static void main(String[] args) {
		
		int [] array= {1,2,3,4,6}; 
		
		int missingNumber=getMissingNumber(array,8); 
		
	}

	private static int getMissingNumber(int [] array, int n ) {
		// TODO Auto-generated method stub
		
		int actualSum=0; 
		
		int expectedSum=(n*(n+1)/2);
		
		for(int i:array ) {
			
			actualSum=actualSum+i; 
			
		}
		
		System.out.println(expectedSum-actualSum);
		
		return expectedSum-actualSum; 
		
	
	}

}
