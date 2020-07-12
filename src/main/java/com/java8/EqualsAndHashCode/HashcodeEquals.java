package com.java8.EqualsAndHashCode;

import java.util.HashSet;

public class HashcodeEquals {
	
	 public static void main(String[] args) {
		 StudentNoOveridde alex1 = new StudentNoOveridde(1, "Alex");
		 StudentNoOveridde alex2 = new StudentNoOveridde(1, "Alex");
	        HashSet < StudentNoOveridde > students = new HashSet < StudentNoOveridde > ();
	        students.add(alex1);
	        students.add(alex2);
	        System.out.println("HashSet size = " + students.size());
	        System.out.println("HashSet contains Alex = " + students.contains(new StudentNoOveridde(1, "Alex")));
	    }
	}