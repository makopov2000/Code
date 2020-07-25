package com.java8.HashCodeAndEquals;

public class User_Hash_Code {

	public static void main(String[] args) {
		User user1 = new User("mkyong", 35, "111222333");
	    User user2 = new User("mkyong", 35, "111222333");

	    System.out.println(user1.equals(user2)); // false

	}

}
