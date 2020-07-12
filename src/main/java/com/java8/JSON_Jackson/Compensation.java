package com.java8.JSON_Jackson;

public class Compensation {
    public Compensation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compensation(char currency, long salary) {
		super();
		this.currency = currency;
		this.salary = salary;
	}
	private char currency;
    private long salary;
    
    public void setCurrency(char currency) {
        this.currency = currency;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public char getCurrency() {
        return this.currency;
    }
    public long getSalary() {
        return this.salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s", currency, salary);
    }
}