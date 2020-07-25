package com.java8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.regex.Pattern;

public class ComparotorSortTest {

	public static void main(String[] args) {
		// create List & ArrayList reference to store customers
		List<Customer> listOfCustomers = new ArrayList<Customer>();
		List<Customer> listOfCustomers8 = new ArrayList<Customer>();

		// create customer objects using constructor initialization
		Customer cust1 = new Customer("1", "2", 4);
		Customer cust2 = new Customer("1", "2", 3);
		Customer cust3 = new Customer("1", "1", 2);
		Customer cust4 = new Customer("2", "2", 5);
		Customer cust5 = new Customer("3", "3", 3);
		Customer cust6 = new Customer("3", "1", 2);
		Customer cust7 = new Customer("3", "1", 1);
		Customer cust8 = new Customer("2", "3", 3);
		Customer cust9 = new Customer("2", "1", 52);

		// add customer objects to ArrayList
		listOfCustomers.add(cust1);
		listOfCustomers.add(cust2);
		listOfCustomers.add(cust3);
		listOfCustomers.add(cust4);
		listOfCustomers.add(cust5);
		listOfCustomers.add(cust6);
		listOfCustomers.add(cust7);
		listOfCustomers.add(cust8);
		listOfCustomers.add(cust9);
		
		// add customer objects to ArrayList
		listOfCustomers8.add(cust1);
		listOfCustomers8.add(cust2);
		listOfCustomers8.add(cust3);
		listOfCustomers8.add(cust4);
		listOfCustomers8.add(cust5);
		listOfCustomers8.add(cust6);
		listOfCustomers8.add(cust7);
		listOfCustomers8.add(cust8);
		listOfCustomers8.add(cust9);

		Iterator<Customer> custIterator = listOfCustomers.iterator();

		System.out.println("Before Sorting: iterate using Iterator & while-loop\n");
		while (custIterator.hasNext()) {
			System.out.println(custIterator.next());
		}
		
/////////// Multiple fileds sorting with Comarator class
/////////// sorting using Collections.sort(al, comparator);
		Collections.sort(listOfCustomers, new CustomerSortingComparator());

		// after Sorting: iterate using enhanced for-loop
		System.out.println("\n\nAfter Sorting: iterate using enhanced for-loop\n");
		for (Customer customer : listOfCustomers) {
			System.out.println(customer);
		}

		System.out.println();
		System.out.println();

/////////// Java 8
/////////// Multiple fileds sorting with Comparotor within the method
		Iterator<Customer> custIterator8 = listOfCustomers8.iterator();

		System.out.println("Before Sorting 8: iterate using Iterator & while-loop\n");
		while (custIterator8.hasNext()) {
			System.out.println(custIterator8.next());
		}

		Comparator<Customer> employee_Name_Age_Comparator = Comparator
				.comparing(Customer::getCustName)
//				.thenComparing(Customer::getCustCity)
				.thenComparingInt(Customer::getCustAge)
				.thenComparing(Customer::getCustCity)
				;

		Collections.sort(listOfCustomers8, employee_Name_Age_Comparator);

		// after Sorting: iterate using enhanced for-loop
		System.out.println("\n\nAfter Sorting 8: iterate using enhanced for-loop\n");
		for (Customer customer : listOfCustomers8) {
			System.out.println(customer);
		}
		System.out.println();
		System.out.println();
		listOfCustomers8.stream().forEach(c -> System.out.println(c));

	}

}
