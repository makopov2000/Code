package com.java8.test;

public class Employee {
	  private String name;
	  private Integer age;
	 
	  public Employee(String name, Integer age) {
	    this.name = name;
	    this.age = age;
	  }
	 
	  //Getters and Setters for name and age go here
	 
	  public String toString() {
	    return "Employee Name:" + this.name
	        + "  Age:" + this.age;
	  }
	}
