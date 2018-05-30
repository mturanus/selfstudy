package Mentoring;

public class Animal {
	
	private String name;
	private int brain;
	private int size; 
	private int age;
	
	
	public Animal(String name, int brain, int size, int age) {
		
		
		this.name = name;
		this.brain = brain;
		this.size = size;
		this.age = age;
		
		
	} 
	
	public void move(int speed) {
		
		System.out.println("animal is moving. Speed is "+speed);
	}
	
	public int eat() {
		
		System.out.println("animal is eating");
		return 10;
	}
	
	public int getBrain() {
		
		return brain;
	}
	
	public void setBrain(int brain) {
		
		this.brain=brain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	


}
