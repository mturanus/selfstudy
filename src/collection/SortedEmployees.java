package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedEmployees {
	
	public static void main(String[] args) {
		
		
		String str1="c"; 
		String str2="b"; 
		
		
		System.out.println(str1.compareTo(str2));
		
		
		//equals -> 0 
		//firstoen is larger -> 1
		//first one is smaller => negative -1
		
		EmployeeSet emp1=new EmployeeSet(3, "bob"); 
		EmployeeSet emp2=new EmployeeSet(3, "Mario"); 
		EmployeeSet emp3=new EmployeeSet(3, "Baki"); 
		EmployeeSet emp4=new EmployeeSet(3, "Ali"); 
		EmployeeSet emp5=new EmployeeSet(3, "Ulan"); 

		
		System.out.println(emp1.compareTo(emp2));

		
		List<EmployeeSet> emps=new ArrayList<>(); 
		
		
		emps.add(emp1); 
		emps.add(emp2);
		emps.add(emp3);
		emps.add(emp4);
		emps.add(emp5);
		
		Collections.sort(emps);
		
		System.out.println();

	}

}
