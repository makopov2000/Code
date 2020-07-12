package com.java8.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

public class EqualsWithArray {
	 public static void main(String[] args) {
	        Student alex = new Student(1, "Alex");
	        List < Student > studentsLst = new ArrayList < Student > ();
	        
	        studentsLst.add(alex);
	        
	        System.out.println("Arraylist size = " + studentsLst.size());
	        System.out.println("Arraylist contains Alex = " + studentsLst.contains(new Student(1, "Alex")));
	        
	        //////////////////////////////////////
	        System.out.println("++++++++++++++++ Array with No Equal Override ++++++++++++++++++++++");
	        
	        StudentNoOveridde alex1 = new StudentNoOveridde(1, "Alex");
	        List < StudentNoOveridde > studentsLst1 = new ArrayList < StudentNoOveridde > ();
	        
	        studentsLst1.add(alex1);
	        
	        System.out.println("Arraylist size = " + studentsLst1.size());
	        System.out.println("Arraylist contains Alex = " + studentsLst1.contains(new StudentNoOveridde(1, "Alex")));
	        
	    }
	}