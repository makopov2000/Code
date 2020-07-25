package com.java8.Map;

import java.util.HashMap;

public class Clone_Map {

	 public static void main(String[] args) {
		 
	        HashMap<Integer, Student> hMapStudents = new HashMap<Integer, Student>();
	        
	        //add students object
	        hMapStudents.put(1, new Student(1, "Jack") );
	        hMapStudents.put(2, new Student(2, "Brian") );
	        hMapStudents.put(3, new Student(3, "Anna") );
	        hMapStudents.put(4, new Student(4, "Maria") );
	        
	        System.out.println("Original HashMap contains: " + hMapStudents);
	        
	        /*
	         * To clone the HashMap, use the clone method.
	         */
	                
	        HashMap<Integer, Student> hMapStudentsClone = (HashMap<Integer, Student>)hMapStudents.clone();
	        
	        System.out.println("Cloned HashMap contains: " + hMapStudentsClone);
	        
	        /*
	         * Adding or removing objects from either map object does
	         * not affect the other
	         */
	        //remove an object from the original hashmap
	        hMapStudents.remove(2);
	        
	        //add an object to cloned hashmap
	        hMapStudentsClone.put(5, new Student(5, "John"));
	        
	        System.out.println("After adding removing mappings: ");
	        System.out.println("Original HashMap contains: " + hMapStudents);
	        System.out.println("Cloned HashMap contains: " + hMapStudentsClone);
	        
	        /*
	         * However, changing any objects added as a key or value
	         * in either of the map objects will be reflected in other
	         * object too. It is because both the maps refer to the same
	         * objects, only references are cloned, not the actual objects.
	         */
	        //change an object in the original map by changing the student name
	        Student student = hMapStudents.get(1);
	        student.setName("Adam");
	        
	        System.out.println("After changing an object: ");
	        System.out.println("Original HashMap contains: " + hMapStudents);
	        System.out.println("Cloned HashMap contains: " + hMapStudentsClone);
	        
	    }
	}

class Student{
    
    private int id;
    private String name;
    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    //for printing purpose
    public String toString(){
        return "[" + getId() + " => " + getName() + "]";
    }
}
