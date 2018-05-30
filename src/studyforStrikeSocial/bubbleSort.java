package studyforStrikeSocial;

public class bubbleSort {
	
	public static void main(String[] args) {
		
		
		int [] intArray= {9,8,7,5,6}; 
		
		System.out.println("Before Sorting print the element");
		
		for(int i: intArray) {
			
			System.out.println(i);
		}
		
		System.out.println("after Sorting print the element");
		
		bubleSort(intArray); 
		
		for(int i: intArray) {
			
			System.out.println(i);
		}
	}

	private static void bubleSort(int[] intArray) {
		
		int temp=0; 
		
		for(int i=0; i<=intArray.length; i++) {
			
			for(int j=1; j<(intArray.length)-i; j++) {
				
				if(intArray[j-1]>intArray[j]) {
					
					//swap the element
					
					temp=intArray[j-1]; 
					
					intArray[j-1]=intArray[j]; 
					
					intArray[j]=temp;
					
					
				}
				
			}
		}
		
	}

}
