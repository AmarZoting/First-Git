package com.my;

import java.util.HashMap;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		int n = 1211;
		int num = n%10;
		System.out.println("Remainder : "+num);
	}
	
	Shapes shapes = () -> {
		
		System.out.println("drawing shape..");
	
		
	};
	
	//shapes.draw();
	
	
	HashMap<Employee, String> idMap = new HashMap<>();
	{
		Employee e1=new Employee("John",21);
        Employee e2=new Employee("Martin",19);
        Employee e3=new Employee("Mary",31);
        Employee e4=new Employee("Stephan",18);
        Employee e5=new Employee("Gary",26);
 
        idMap.put(e1, "Amar");
        idMap.put(e1, "John");
        idMap.put(e1, "Martin");
	}
	
	//List<String> empList = idMap.entrySet().stream()
		//	.filter(e -> e.getKey().getId()>21);
					//.map(Employee::getName)
					//.coll
	
	
	
	

}
