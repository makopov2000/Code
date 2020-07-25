package com.java8.Comparator;

public class Customer {
	 
    // instance member variables
    String custName;
    String custCity;
    Integer custAge;
 
    // 3-arg parameterized constructor
    public Customer(String custName, String custCity, int custAge) {
        this.custName = custName;
        this.custCity = custCity;
        this.custAge = custAge;
    }
 
    // getter & setter
    public String getCustName() {
        return custName;
    }
 
    public void setCustName(String custName) {
        this.custName = custName;
    }
 
    public String getCustCity() {
        return custCity;
    }
 
    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }
 
    public Integer getCustAge() {
        return custAge;
    }
 
    public void setCustAge(Integer custAge) {
        this.custAge = custAge;
    }
 
    // overriding toString() method
    @Override
    public String toString() {
        return "Customer [custName=" + custName + ", custCity=" + custCity
                + ", custAge=" + custAge + "]";
    }
}