package Mentoring;

public class Dog extends Animal{
	

	
	public Dog(String name, int brain, int size, int age) {
	
	super(name, brain, size, age);
	
	}
	
	public void run() {
		System.out.println("Dog is running");
	
		this.move(10);
		
	}
	
	
//	public void move(int speed) {
//		
//	System.out.println("Dog speed is "+speed);
//	}

	public int  eat() {
		
		System.out.println("dog is eating");
		return 12;
		
	}
	
	
	public static void main(String[] args) {
		
		Dog popi=new Dog("popi", 1, 12, 20); 
			
			
		popi.run();
		
		
	}

	
	
}
