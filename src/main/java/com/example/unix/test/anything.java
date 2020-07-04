package com.example.unix.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.unix.function.Address;
import com.example.unix.function.Employee;

public class anything {
	static List<Employee> employeeListBland = new ArrayList<>();
	 static List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45, 100.00),
		      new Employee("Harry Major", 25, 100.00),
		      new Employee("Ethan Hardy", 65, 100.00),
		      new Employee("Nancy Smith", 22, 100.00),
		      new Employee("Deborah Sprightly", 29, 100.00));
	 final static List<String> z = Arrays.asList("mike","alex");
	
	public static void main(String args[]) {
		System.out.println(foo(0));
		
		
		
//		List<Employee> nullEmplList = new ArrayList<>();
//		Employee nullEmpl = new Employee();
//		
//		String add = nullEmpl.getName();
//		System.out.println(add);
		
		
//		Employee emp = new Employee(new String(), new Integer(0), new Double(0l), new Address());
////		Address add = new Address();
////		emp.setAddress(add);
//		emp.getAddress().setAddress1("geneva");
//		
//		System.out.println(emp);
//		
//		String str = "Guru99 is a site providing, free, tutorials";
//        String str2 = str.replaceAll("[,:\\s]", "%");
//        System.out.println(str2);
//        
//        String str3 = str.replace(" ", "");
//        System.out.println(str3);
	
//		Set<String> s = new HashSet<>();
//		s.add("mike");
//		s.add("alex");
//		s.add("inna");		
//		Set<String> m = Collections.unmodifiableSet(s);		
//		m.add("boris");		
//		System.out.println(m);
		
//		
//		   Long count=employeeList.stream().collect(Collectors.counting());
//		    System.out.println("Employee count: "+count);
//		    
//			   Long countb=employeeListBland.stream().collect(Collectors.counting());
//			    System.out.println("Employee countb: "+countb);
		
		
//		Function<Integer, String> fun = (T) -> {
//			if (T > 10) {
//			return "Greater than 10";
//			} else {
//				return "Less than 10";
//			}
//		};
//		
//		String s1 = fun.apply(5); System.out.println(s1);
//		String s2 = fun.apply(15); System.out.println(s2);
//		
//		Function<String, Integer> intParser=Integer::parseInt;
//		System.out.println(intParser.apply("13"));

//		List<String> employeeList = Arrays.asList("Tom Jones", "Harry Major", "Ethan Hardy", "Nancy Smith",
//				"Deborah Sprightly");
//
//		List<String> filteredList = employeeList.stream().limit(2).collect(Collectors.toList());
//		filteredList.forEach(System.out::println);
//		
//		filteredList.add("Mike Akopov");
//		filteredList.forEach(System.out::println);
//		List<String> ma = filteredList.stream().filter(r -> r.contains("Mike")).collect(Collectors.toList());
//		System.out.println("Filtered: " + ma);
//		ma.stream().forEach(r-> System.out.println(r));
		
	}
	
	   public static int foo(int a)
	    {
		   if (a == 0) {
	        return 10;
		   }
	        System.out.println("Inside foo()");
	        return 5;
	    }

}

@FunctionalInterface
interface FirstInterface {
	// the abstract method
	public void singleMethod(String param);
}