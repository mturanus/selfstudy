package multidimentionalarray;

public class MultiDimentionalArray {
	
	public static void main(String[] args) {
		
		int [][] intArray = new int [7][3];
		int [] intArray1[] = new int [7][3];
		int intArray2[][]= new int [7][3];
		
		int one [][], two; 
		
		
		String [][] data= new String [7][3]; 
		
		
		int [][]  data1= new int [2][3];
		
		
		data1[0][0]=12; 
		data1[0][1]=5; 
		data1[0][2]=4; 
		data1[1][0]=23; 
		data1[1][1]=113; 
		data1[1][2]=32; 
		
		System.out.println(data1[1]);
		System.out.println(data1[0][1]);
		
		int [][] num= new int [2][3]; 
		
		num[0]= new int [] {12, 5, 4}; 
		
		num[1]= new int [] {2};
		
		
		int [][] num1 = new int [2][]; 
		
		num1[0]= new int [] { 12, 4, 23}; 
		
		num1[1]=new int [] { 45, 2,32435,74, 3453,342, 456};
		
		int [] [] num2={{ 12, 34, 345,}, { 234, 56,4, 65, }, {24353, 546, 567, 3453}}; 
		
		
		for ( int i = 0 ; i< num2.length; i++) {
			
			System.out.println(">>>> Row: "+ i );
			for( int j=0; j< num2[i].length; j++) {
				System.out.println(num2[i][j]+" ");
				
			}
			System.out.println();
		}
		
	

	}}
