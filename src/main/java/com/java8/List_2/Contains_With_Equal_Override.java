package com.java8.List_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java8.List_2.Entity.Student;

public class Contains_With_Equal_Override {

	public static void main(String[] args) {
	       List<com.java8.HashCodeAndEquals.Student> aListStudents = new ArrayList<>();
	        aListStudents.add( new com.java8.HashCodeAndEquals.Student(1, "Raj") );
	        aListStudents.add( new com.java8.HashCodeAndEquals.Student(2, "Jack") );
	        aListStudents.add( new com.java8.HashCodeAndEquals.Student(3, "Ryan") );
	        aListStudents.add( new com.java8.HashCodeAndEquals.Student(4, "Adam") );
	        aListStudents.add( new com.java8.HashCodeAndEquals.Student(5, "Jessica") );
	        
	        com.java8.HashCodeAndEquals.Student c1 = new com.java8.HashCodeAndEquals.Student(2, "Jack");
//	        aListStudents.add(c1);
	        com.java8.HashCodeAndEquals.Student c2 = new com.java8.HashCodeAndEquals.Student(6, "Mike");
	        
			System.out.println("++++++++++++++++++++++++++");
			
			Collections.sort(aListStudents, new Comparator<com.java8.HashCodeAndEquals.Student>() {
				  @Override
				  public int compare(com.java8.HashCodeAndEquals.Student u1, com.java8.HashCodeAndEquals.Student u2) {
				    return u1.getId().compareTo(u2.getId());
				  }
				});
			
			System.out.println(aListStudents);
			
//			Student c1 = new Student(2, "Jack");
//			Student c2 = new Student(6, "Mike");
			System.out.println("C1: "+aListStudents.contains(c1));
			System.out.println("C2: "+aListStudents.contains(c2));
			if(aListStudents.indexOf(c1) != -1) {
				System.out.println("C1 again: CONTAIN");
				} else {System.out.println("C1 again: NOT CONTAIN");}
			if(!aListStudents.contains(c1)) {aListStudents.add(c1);}
			if(!aListStudents.contains(c2)) {aListStudents.add(c2);}
			
			Collections.sort(aListStudents, new Comparator<com.java8.HashCodeAndEquals.Student>() {
				  @Override
				  public int compare(com.java8.HashCodeAndEquals.Student u1, com.java8.HashCodeAndEquals.Student u2) {
				    return u1.getId().compareTo(u2.getId());
				  }
				});
			System.out.println(aListStudents);
//			aListClonedList.stream()
//			.forEach(r->System.out.println(r));

	}

}
