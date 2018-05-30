package collection;

import java.util.HashSet;
import java.util.Set;

public class EmployeesSetMain {
	
	public static void main(String[] args) {
		
		
		Set<EmployeeSet> employees= new HashSet<>(); 
		
		employees.add(new EmployeeSet(123, "Shaun")); 
		employees.add(new EmployeeSet(124, "Patel")); 
		employees.add(new EmployeeSet(123, "Shaun")); 

		
		System.out.println(employees);
		
	}

}
