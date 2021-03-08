package com.java8.test;

final class Z{
	private String s;
	public Z(String x) {
		this.s =x;
	}
	public String toString() {return s;}
	public void setA(String a) {this.s+=a;}
}

public class ExamImmutable {
	private final Z a;
	public ExamImmutable(Z a) {this.a = a;}
	public String toString() {return a.toString();}

	public static void main(String[] args) {
		Z a = new Z("Bye");
		ExamImmutable im = new ExamImmutable(a);
		System.out.println(im);
		
		a.setA("bye");
		System.out.println(im); 
	}

}

