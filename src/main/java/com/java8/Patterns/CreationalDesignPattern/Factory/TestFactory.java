package com.java8.Patterns.CreationalDesignPattern.Factory;

public class TestFactory {

	public static void main(String[] args) {
		PC pc = (PC)ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
		Server server = (Server)ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
		System.out.println("Factory PC Config::"+pc);
		System.out.println("Factory Server Config::"+server);
	}

}