package com.java8.EqualsAndHashCode;

public class Equals {
    public static void main(String[] args) {
    	
        StudentNoOveridde alex1NoEquals = new StudentNoOveridde(1, "Alex");
        StudentNoOveridde alex2NoEquals = new StudentNoOveridde(1, "Alex");
        
        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");
        
        System.out.println("++++++  No Override +++++");
        System.out.println("alex1NoEquals hashcode = " + alex1NoEquals.hashCode());
        System.out.println("alex2NoEquals hashcode = " + alex2NoEquals.hashCode());
        System.out.println("Checking equality between alex1NoEquals and alex2NoEquals = " + alex1NoEquals.equals(alex2NoEquals));
        
        
        System.out.println("++++++  With Override +++++");
        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
    }
}