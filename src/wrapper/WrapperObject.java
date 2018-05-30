package wrapper;

public class WrapperObject {
	
	boolean f1; 
	
	public static void main(String[] args) {
		
		int i = 10 ; 
		
	Integer in= new Integer(10); 
		
	//Integer in1= new Integer("1a0"); 
	
	Integer in2=10; 
	
	Integer in3=10; 
	
	Integer in4= Integer.valueOf(10); 
	

	
	
	
	//Integer in5= new Integer("12ab"); 
	
	//System.out.println(in5);
	
	Boolean b= new Boolean("true");
	
	System.out.println(b);
	
	int ball=10; 
	
	int ball1= new Integer(ball); 
	
	boolean b1= b; 
	
	System.out.println(b1);
	
	// primitive data type to wrapper class called -> Autoboxing
	// wrapper class to primitive data types called -> unboxing
	
	

	
	


	Integer car= new Integer(1000); 
	Integer car1= new Integer(1000);
	
	
	Integer car2=Integer.valueOf(120); 
	Integer car3=Integer.valueOf(120); 
	
	Integer car4= 1000; 
	
	Integer car5= 1000; 
	
	System.out.println(car==car1);
	
	
	System.out.println(car.equals(car1));
	
	System.out.println("lin"+ car2.equals(car3));
	
	System.out.println("lin2"+(car2==car3));
	
	System.out.println(car4==car5);
	
	System.out.println(car4.equals(car5));
	
	Double carr=Double.valueOf(120); 
	Double carr1=Double.valueOf(120); 
	
	System.out.println("lin "+ carr.equals(carr1));
	
	System.out.println("lin2 "+(carr1==carr));
	
	
	
	
	
	String realPayment="1234"; 
	
	Integer payment= Integer.parseInt(realPayment); //autoboxing
	
	System.out.println(payment);
	
	
	int payment2= Integer.valueOf(realPayment); //unboxing
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	}

}
