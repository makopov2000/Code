package com.example.unix.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.unix.List.Entity.Customer;

public class Find_Element_in_List {
	
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "Jack"));
		customers.add(new Customer(2, "James"));
		customers.add(new Customer(3, "Kelly"));
		
		Customer james = customers.stream()
				  .filter(customer -> "James".equals(customer.getName()))
				  .findAny()
				  .orElse(null);
		
		System.out.println(findUsingJava8("James", customers));
		System.out.println(findUsingEnhancedForLoop("Kelly", customers));
		System.out.println(findUsingIterator("mike", customers));
		
	}
	
	private static Customer findUsingJava8(String string, List<Customer> customers) {
		Customer james = customers.stream()
				  .filter(customer -> "James".equals(customer.getName()))
				  .findAny()
				  .orElse(null);
		return james;
	}

	public static Customer findUsingEnhancedForLoop( String name, List<Customer> customers) {
			 
			    for (Customer customer : customers) {
			        if (customer.getName().equals(name)) {
			            return customer;
			        }
			    }
			    return null;
			}
	
	public static Customer findUsingIterator(  String name, List<Customer> customers) {
			    Iterator<Customer> iterator = customers.iterator();
			    while (iterator.hasNext()) {
			        Customer customer = iterator.next();
			        if (customer.getName().equals(name)) {
			            return customer;
			        }
			    }
			    return null;
			}

}
