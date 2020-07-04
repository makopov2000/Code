package com.example.unix.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceFunc {
	static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45, 7000.00),
			new Employee("Harry Major", 25, 10000.00), new Employee("Ethan Hardy", 65, 8000.00),
			new Employee("Nancy Smith", 22, 12000.00), new Employee("Deborah Sprightly", 29, 9000.00));

	public static void main(String[] args) {
		
		//**************** Finding aggregate of stream elements using Stream.reduce() method
		Double totalSalaryExpense = employeeList.stream().map(emp -> emp.getSalary()).reduce(0.00, (a, b) -> a + b);
		System.out.println("Total salary expense: " + totalSalaryExpense);

		
		//**************** Using Stream.reduce() method for finding employee with maximum salary
		Optional<Employee> maxSalaryEmp = employeeList.stream()
				.reduce((Employee a, Employee b) -> a.getSalary() < b.getSalary() ? b : a);
		if (maxSalaryEmp.isPresent())
			System.out.println("Employee with max salary: " + maxSalaryEmp.get());

	}
}
