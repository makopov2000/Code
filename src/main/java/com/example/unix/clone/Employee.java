package com.example.unix.clone;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable{
	private static final long serialVersionUID = 1L;
	
	 @Override
	  public boolean equals(Object obj) {
	    if (obj == this) {
	      return true;
	    }
	    if (!(obj instanceof Employee)) {
	      return false;
	    }
	    Employee empObj = (Employee) obj;
	    return this.age == empObj.age
	        && this.name.equalsIgnoreCase(empObj.name);
	  }
	 
	 //Shalow Clone
	  @Override
	  public Object clone() throws CloneNotSupportedException{
	    return super.clone();
	  }
	  
	  // Deep Clone
//	  @Override
//	  public Object clone() throws CloneNotSupportedException {
//	    Employee empClone = (Employee) super.clone();
//	    EmployeeAddress empAddressClone = new EmployeeAddress(this.address.getHouseNo(),
//	                                        this.address.getStreet(),
//	                                        this.address.getCity());
//	    empClone.setAddress(empAddressClone);
//	    return empClone;
//	  }
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, Integer age, Double salary, EmployeeAddress address) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public EmployeeAddress getAddress() {
		return address;
	}
	public void setAddress(EmployeeAddress address) {
		this.address = address;
	}
	private String name;
	private Integer age;
	private Double salary;
	private EmployeeAddress address;
	
	public String toString(){
	    return "Employee Name:"+this.name
	        +"  Age:"+this.age
	        +" Address:"+address;
	   }
	 

}

 class EmployeeAddress implements Serializable{
	 private static final long serialVersionUID = 1L;
	 
	  public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String houseNo;
	  private String street;
	  private String city;
	  //EmployeeAddress constructor
	  public EmployeeAddress(String houseNo, String street, String city) {
	    this.houseNo = houseNo;
	    this.street = street;
	    this.city = city;
	  }
	  //setters and getters for houseNo, street and city go here
	  @Override
	  public String toString() {
	    return "EmployeeAddress{" +
	        "houseNo='" + houseNo + '\'' +
	        ", street='" + street + '\'' +
	        ", city='" + city + '\'' +
	        '}';
	  }
	}
