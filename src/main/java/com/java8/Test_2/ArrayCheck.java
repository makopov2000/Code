package com.java8.Test_2;

import java.util.Arrays;

public class ArrayCheck {
	private Boolean isMore;
	public  boolean isMoreExist() { return isMore == null?false:true;}
	

	public static void main(String[] args) {
		Rates rates = new Rates();
		ArrayCheck t = new ArrayCheck();
		
		if (t.isMoreExist()) {
			System.out.println("+++ True");
		} else {
			System.out.println("+++ False");
		}
		
		rates.name = "mike";
		rates.arrayString = new String[3];
		rates.arrayString[0] = "a";
		rates.arrayString[1] = "b";
		rates.arrayString[2] = "c";
		
		rates.arrayString = new String[3];
		rates.arrayString[0] = "d";
		rates.arrayString[1] = "e";
		rates.arrayString[2] = "f";
		
		System.out.println(rates );
		
	}

}

class Rates {
	public String name;
	public String[] arrayString;
	@Override
	public String toString() {
		return "Rates [name=" + name + ", arrayString=" + Arrays.toString(arrayString) + "]";
	}
	
}
