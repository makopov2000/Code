package com.java8.List_2.Entity;

public class Animal {
    private int id;
    private String name;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + "]";
	}
	public Animal(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
