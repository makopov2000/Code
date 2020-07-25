package com.java8.List_2.Entity;

public class StaffPublic {

    private String name;
    private int age;
    @Override
	public String toString() {
		return "StaffPublic [name=" + name + ", age=" + age + ", extra=" + extra + "]";
	}
	public StaffPublic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StaffPublic(String name, int age, String extra) {
		super();
		this.name = name;
		this.age = age;
		this.extra = extra;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getExtra() {
		return extra;
	}
	public void setExtra(String extra) {
		this.extra = extra;
	}
	private String extra;
    //...
}
