package study;

public class OcaPre {

	
	 static String url = "jdbc://derby://localhost:1527//mydb";
	 static String par; 
	 OcaPre(String a){
		 
	System.out.println(a);
	 }
	 
	 static String ch;
	  static float f;
	  static boolean bool;
	  
	  public void setAge(String i ) {
		  
		  this.ch=i; 
		  System.out.println("parameter");
	  }
	 
	  
	  public static void main(Integer[] args) {}
	  
	  
	 public static void main(String[] args) {
		 int [] [] array = {{0}, {0, 1}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2, 3, 4}};
		 int[] arr1 = array[4];
		// System.out.println (arr1[4][1]);
		 System.out.println (array[4][1]);
		 
		// new OcaPre("a").print(); 
		 try{
	         Exception re = null;
	         throw re;
	      }
	      catch(Exception e){
	         System.out.println(e);
	         
	         System.out.println("null pointerrr");
	}
		 
		 
		 System.out.print(f);
		   // System.out.print();
		    System.out.print(ch);
		   // System.out.print();
		    System.out.print(bool);
		    
		    
		    OcaPre parameter=new OcaPre(null);
		    
		    parameter.setAge(null);
		    
		   
		//    parameter.setAge();
		    
		    
		    
		    
		    System.out.println(""+(5)+(16));
		    
		 
		 
		 
}}
