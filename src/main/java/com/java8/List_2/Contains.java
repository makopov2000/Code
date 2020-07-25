package com.java8.List_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.List_2.Entity.Customer;
import com.java8.List_2.Entity.Student;
import com.java8.List_2.Entity.User;

public class Contains {

	public static void main(String[] args) {
		ArrayList<String> aListBasicColors = new ArrayList<String>();
		aListBasicColors.add("Red");
		aListBasicColors.add("Green");
		aListBasicColors.add("Blue");
		 
		/*
		 * To check if the ArrayList contains the specified element, use
		 * the contains method
		 */
		 
		//this will return true as the ArrayList contains element "Green"
		System.out.println( "ArrayList contains Red: " + aListBasicColors.contains("Red") );
		 
		//this will return false as the ArrayList does not contain element "Yellow"
		System.out.println( "ArrayList contains Yellow: " + aListBasicColors.contains("Yellow") );
		
		////////////////////////////////////////////////check if List of object contains
        List<Student> aListStudents = new ArrayList<>();
        aListStudents.add( new Student(1, "Raj") );
        aListStudents.add( new Student(2, "Jack") );
        aListStudents.add( new Student(3, "Ryan") );
        aListStudents.add( new Student(4, "Adam") );
        aListStudents.add( new Student(5, "Jessica") );
        
        Student c1 = new Student(2, "Jack");
//        aListStudents.add(c1);
		Student c2 = new Student(6, "Mike");
        
		System.out.println("++++++++++++++++++++++++++");
		
		Collections.sort(aListStudents, new Comparator<Student>() {
			  @Override
			  public int compare(Student u1, Student u2) {
			    return u1.getId().compareTo(u2.getId());
			  }
			});
		
		System.out.println(aListStudents);
		
//		Student c1 = new Student(2, "Jack");
//		Student c2 = new Student(6, "Mike");
		System.out.println("C1: "+aListStudents.contains(c1));
		System.out.println("C2: "+aListStudents.contains(c2));
		if(aListStudents.indexOf(c1) != -1) {
			System.out.println("C1 again: CONTAIN");
			} else {System.out.println("C1 again: NOT CONTAIN");}
		if(!aListStudents.contains(c1)) {aListStudents.add(c1);}
		if(!aListStudents.contains(c2)) {aListStudents.add(c2);}
		
		Collections.sort(aListStudents, new Comparator<Student>() {
			  @Override
			  public int compare(Student u1, Student u2) {
			    return u1.getId().compareTo(u2.getId());
			  }
			});
		System.out.println(aListStudents);
//		aListClonedList.stream()
//		.forEach(r->System.out.println(r));
		
		System.out.println("++++++++++++++++++++++++++");
		List<String> names = new ArrayList<>();
		names.add("Mike");
		names.add("Alex");
		names.add("Inna");
		names.add("Boris");
		Collections.sort(names);;
		System.out.println(names);
		String s1 = new String("Inna");
		System.out.println("C1: "+names.contains("Alex"));
		System.out.println("C2: "+names.contains("Valery"));
		if (!names.contains(s1)) {names.add(s1);}
		if (!names.contains("Valery")) {names.add("Valery");}
		Collections.sort(names);;
		System.out.println(names);

	}

}
