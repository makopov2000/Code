package com.java8.Map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<>();
		map.put(new Employee("mike"), null);
		map.put(new Employee("mike"), null);
		
		map.entrySet().forEach(r -> System.out.println(r.getKey()+"-"+r.getValue()));
		

	}

}

 class Employee{
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	String name;
}
