package interviewquestions;

public class numberInsideString {
	
	static int num=0; 
	
	public static int numberSum(String str) {
		
		for(char i=0; i<str.length(); i++) {
			for (char k='0'; k<='9'; k++) {
				
				if(str.charAt(i)==k) {
					
					num+=Integer.parseInt(String.valueOf(k));
					
				}
			}
		}
		
		System.out.println(num);
		
		return num; 
		
	}
	
	public static void main(String[] args) {
	
		String str="str1m5";
		
		numberSum(str); 
			
	}

}
