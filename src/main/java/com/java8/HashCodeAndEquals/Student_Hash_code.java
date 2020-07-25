package com.java8.HashCodeAndEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Student_Hash_code {
	public static void main(String[] args) {
        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        System.out.println("alex1 hashcode = " + alex1.hashCode());									//No EQUALS/NO HASHCODE = diff HashCode
        System.out.println("alex2 hashcode = " + alex2.hashCode());									//No EQUALS/NO HASHCODE = diff HashCode
        
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));	//No EQUALS/NO HASHCODE = FALSE
        																							//YES EQUALS/NO HASHCODE = TRUE
        																							//YES EQUALS/YES HASHCODE = TRUE
        
        Student alex = new Student(1, "Alex");
        List < Student > studentsLst = new ArrayList <> ();
        studentsLst.add(alex);
        System.out.println("Arraylist size = " + studentsLst.size());									 //No EQUALS/NO HASHCODE = Size 1
        System.out.println("Arraylist contains Alex = " + studentsLst.contains(new Student(1, "Alex"))); //No EQUALS/NO HASHCODE = FALSE
        																								 //YES EQUALS/NO HASHCODE = TRUE
        																								 //YES EQUALS/YES HASHCODE = TRUE
        
        HashSet < Student > students = new HashSet < Student > ();
        students.add(alex1);
        students.add(alex2);
        System.out.println("HashSet size = " + students.size());									//No EQUALS/NO HASHCODE = Size 2
        System.out.println("HashSet contains Alex = " + students.contains(new Student(1, "Alex"))); //No EQUALS/NO HASHCODE = FALSE
        																							//YES EQUALS/NO HASHCODE = FALSE
        																							//YES EQUALS/YES HASHCODE = TRUE
    }
}