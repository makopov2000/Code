package com.example.unix.test;

public abstract class AbstrTest {
	private String name;
	private String gender;
	
	public AbstrTest(String nm, String gen){
		this.name=nm;
		this.gender=gen;
	}
	
	//abstract method
	public abstract void work();
	
	@Override
	public String toString(){
		return "Name="+this.name+"::Gender="+this.gender;
	}

	public void changeName(String newName) {
		this.name = newName;
	}

}
