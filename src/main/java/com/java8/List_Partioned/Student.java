package com.java8.List_Partioned;

public class Student {
	String name;
	String course;
	Integer age;
	public Student(String name, String course, Integer age) {
		this.name = name;
		this.course = course;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + ", age=" + age + "]";
	}
	
	
}