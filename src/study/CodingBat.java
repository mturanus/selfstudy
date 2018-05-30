package study;

public class CodingBat {
	
	
		
		public String comboString(String a, String b) {
			  
			  String name="";
			  
			  if(a.length()>b.length()) {
			    
			   return name=b+a+b;
			   
			  }else if(a.length()<b.length()) {
			    
			    return name=a+b+a;
			    
			  }
			  
			  return name;
			  
			}
		
		public int diff21(int n) {
			 
			  int num=0;
			  
			  
			  if(n<21) {
			   num=21-n;
			   System.out.println(num);
			  return num;
			  }else if(n>21) {
			    
			    num=n-21;
			    System.out.println(num);
			    
			    return -num;
			    
			    
			  }
			  
			  
			  
			  return num;
			  
			}
		
		public static void main(String[] args) {
			
			CodingBat str=new CodingBat();
			str.diff21(24);
			
	}

}
