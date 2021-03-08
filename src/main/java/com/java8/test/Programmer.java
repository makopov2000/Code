package com.java8.test;

class EmplM {
	float salary = 40000;
	protected void print() {
		System.out.println("Print HI");
	}
}

public class Programmer extends EmplM {
	static String st;
	int bonus = 10000;

	public static void main(String args[]) {
		
		Programmer p = new Programmer();
		System.out.println("Programmer salary is:" + p.salary);
		System.out.println("Bonus of Programmer is:" + p.bonus);
		p.print();
		Programmer.prt();
		
	}
	public static void prt() {
		st = "Mike";
		System.out.println(st);
	}
}



