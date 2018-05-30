package study;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WrapperClass {
	
	int op; 
	
	int rte=op; 
	

	
	
	
	String s1 = "green mile";   // 0
    
    public void generateReport(int n) {
       String local;   // 1
       if( n > 0 ) local = "good";   //2
       else local="bad";

       System.out.println( s1+" = " + local );   //3
    }
    
//static int oi;
	
	public static void main(String[] args) {
//		int i =10; 
//		
//		Integer j=10; 
//		
//		System.out.println(j);
//		
//		Integer k=Integer.valueOf(i);
//		
//		System.out.println(k);
//		
//		int m=j;
//		
//		int n=k.valueOf(j);
//		
//		int o=k.valueOf('c');
//		
//		int u=k.intValue();
//		
//		System.out.println(o);
//		
//		System.out.println(u);
		
		 int[] arr = { 1, 2, 3, 4, 5, 6 };
	        int counter = 0;
	        for (int value : arr) {
	        	
   //     if (counter >= 5) {
	 //             break;    
	   //        } else {
	     //       break;    
	       //    }
	           if (value > 4) {
	             arr[counter] = value + 1;    
	           }    
	           counter++;
	        }
	        System.out.println(counter);
	        
//	        for ( int i =0; i<arr.length; i++) {
//	        	
//	        	counter++;
//	       // 	System.out.println(counter);
//	        }
//	        
//	        System.out.println(counter);
	        
	        String phone="+12243064246"; 
	        
	        String n=new StringBuilder(phone).substring(0,6)+"xxxx";
	        
	        String o=new StringBuilder(phone).replace(8, 12, "xxxx").toString();
	        
	     // String e=new StringBuilder(phone).append("xxxx",0,8).toString();
	        
	        String p=new StringBuilder(phone).append("xxxx",0,4).toString();
	        
	        String h=new StringBuilder("xxxx").insert(0, phone,0,8).toString();
	        
	        
	        System.out.println(p);
	        
	        System.out.println(""+(1+2)+(2+4));
	        
	        System.out.println(new Boolean(null));
	        
	        
	        System.out.println(Boolean.parseBoolean("trUe"));
	        
	        System.out.println(new Boolean("true"));
	        
	        System.out.println(new Boolean("trUE"));
	        
	        System.out.println(Boolean.valueOf(true)==Boolean.valueOf("trUE"));
	        
        System.out.println(Boolean.parseBoolean("trUE")==new Boolean("true"));
	        
	        System.out.println(Boolean.valueOf("trUE")==new Boolean("true"));
	        System.out.println(Boolean.valueOf(true)==new Boolean("true"));
	        
	        System.out.println(new Boolean("trUE")==new Boolean("true"));
	        
	        int x=1____3; 
	        
	        System.out.println(x);
	        
	        System.out.println(Boolean.TRUE);
	        
	       System.out.println( "String".replace('g','g')=="String");
	       
	       System.out.println("String".equals("String".replace('g', 'g')));
	        
	      System.out.println("String".replace('g','g') == new String("String").replace('g','g'));
	      
	      System.out.println("String".replace('g','G').equals("String".replace('g','G')));
	      
	      String str=new String("String"); 
	      
	      
	      System.out.println(str.charAt(0));
	      
	      System.out.println(str.replace("", "mmm"));
	        
	      String sn=new String("String");
	      
	      System.out.println(str==sn);
	      
	      StringBuilder str1=new StringBuilder("String");
	      
	      StringBuilder str2=str1;
	      
	      
	      System.out.println("akjdfas;fd"+str.equals(sn));
	      
	      
	      System.out.println(str1==str2);

	      System.out.println(str1==str2);
	      
	      Integer i= new Integer(10); 
	      
	      Long in=new Long(10);
	      
	      System.out.println("aaa " +i.equals(in));
	      
	      String st= "ABC";
	      String st1=st.concat("D");
	      
	      System.out.println(st==st1);
	      System.out.println(st.equals(st1));
	      
	      int [] numbers= {6,9,1};
	      
	      Arrays.sort(numbers);
	      
	      for(int k=0; k<numbers.length;k++) {
	    	  System.out.println(numbers[k]);
	    	  
	    	  ArrayList list1=new ArrayList(10);
	    	  
	    	  list1.add("Mugla");
	    	  list1.add("Milas");
	    	  
	    	  ArrayList list2=new ArrayList(list1);
	    	  
	    	  System.out.println(list2.get(0));
	    	 System.out.println(list2);
	    	 System.out.println(list2.remove("Mugla"));
	    	 System.out.println(list2.remove(0));
	    	  
	    	  System.out.println(list1);
	    	  
	    	  System.out.println(list2);
	    	  
	    	  System.out.println(list2.remove("jj"));
	    	  
	    	  //System.out.println(list2.remove(0));
	    	  
	    	  String[] array= {"hawk","robin"};
	    	  List<String> list= Arrays.asList(array);
	    	  System.out.println(list.size());
	    	  list.set(1, "test");
	    	  array[0]="new";
	    	  
	    	  for(String b: array) {System.out.println(b+" ");}
	    	  
	    	  
	    	//  list.remove(0);
	    	  
	    	  LocalDate date=LocalDate.of(12,4,5);
	    	  
	    	  System.out.println(date);
	    	  
	    	  
	    	  short xn=10;
	    	  
	    	  float xl=2;
	    	  
	    	  double xk=1;
	    	  
	    	  double xo=xn*xl/xk;
	    	  
	    	 
	    	  
	    	  System.out.println(xo);
	    	  
	  
	    	  String [] ak=new String[4];
	    	  
	    	  
	    	 // double xm=xn+xl;
	    	  
	    	  StringBuilder b=new StringBuilder(4);
	    	  
	    	  String a="";
	    	  
	    	  System.out.println(a.equals(ak));
	    	  
	    	System.out.println(xk=xl);
	    	  
	    	  System.out.println(xl=xn);
	    	  
	    	  int nm=64;
	    	  
	    	  
	    	  short kl=21;
	    	  
	    	  byte by=32;
	    	  
	    	  
	    	   char un= 543;
	    	   
	    	   char unu=865;
	    	   
	    	   int nk=unu;
	    	   
	    	   double t=nk;
	    	   
	    	   short nlk=(short)1921222;
	    	   
	    	   System.out.println(nlk);
	    	   
	    	   long xu=10;
	    	   
	    	   int yi=5; 
	    	   
	    	   yi*=xu;
	    	   int oi;
	    	   
	    	   int ti;
	    	   
	    	  int no=oi=ti=10;
	    	   
	  // 	   System.out.println(oi);
	    	   
	    	   
	    	   String klm=null;
	    	   String klmn=null;
	    	   
	    	   System.out.println(klmn);
	    	   
	    	do {
	    		oi++;
	    	}while(false );
	    	
	    	System.out.println(oi);
	    	
	    	
	    	for( int inn=0; i<2; inn++) {
	    		
	    		//inn++; 
	    		//ti++; 
	    		
	    		
	    		
	    	}
	    	
	    	int op; 
	    	
	    	int rte; 
	    	
	    	int ret=op=rte=10;
	    	
	    	
	    	
	      }
	      
		
	}

}
