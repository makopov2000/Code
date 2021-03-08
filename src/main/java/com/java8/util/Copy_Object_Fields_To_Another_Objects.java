package com.java8.util;

import java.time.LocalDate;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class Copy_Object_Fields_To_Another_Objects {

	public static void main(String[] args) throws Exception {
		Person person = new Person();
		User user = new User();
		 person.firstName = "mike";
		 person.lastName = "akopov";
		 person.dob = LocalDate.now();
		 
		 System.out.println("Person before: "+person);
		 System.out.println("User before: "+user);
		 
//		 final Map<String, Object> aProps = BeanUtils.describe(person);
//		 final Map<String, Object> bProps = BeanUtils.describe(user);
//		 aProps.keySet().retainAll(bProps.keySet());
//		 for (Map.Entry<String, Object> entry : aProps.entrySet()) {
//		     BeanUtils.setProperty(bProps,entry.getKey(), entry.getValue());
//		 }
		 
		 BeanUtils.copyProperties(user, person);
		 
		 System.out.println("Person after: "+person);
		 System.out.println("User after: "+user);

	}

}

class Person{
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", dod=" + dod + "]";
	}
	String firstName;
	String lastName;
	LocalDate dob;
	LocalDate dod;
	
}

class User{
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", dod=" + dod + ", id="
				+ id + ", hire=" + hire + "]";
	}
	String firstName;
	String lastName;
	LocalDate dob;
	LocalDate dod;
	String id;
	String hire;
}
