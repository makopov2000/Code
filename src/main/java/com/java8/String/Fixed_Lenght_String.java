 package com.java8.String;

import org.apache.commons.lang.StringUtils;

public class Fixed_Lenght_String {

	public static void main(String[] args) {
		String numberAsString;
		int number;
		
	      number = 153;
	      numberAsString = String.format("% 10d", number);
	      System.out.println("Pad using FORMAT With Spaces: "+numberAsString);
	      
	      numberAsString = String.format("%010d", number);
	      System.out.println("Pad using FORMAT With 0s:     "+numberAsString);
	      
	      // 1 digit
	      number = 1;
	      numberAsString = String.valueOf(number);
	      String paddedNumberAsString = "0000000000".substring(numberAsString.length()) + numberAsString;
	      System.out.println("Pad using SUBSTRING: "+paddedNumberAsString);
	      // 2 digits
	      number = 12;
	      numberAsString = String.valueOf(number);
	      paddedNumberAsString = "0000000000".substring(numberAsString.length()) + numberAsString;
	      System.out.println("Pad using SUBSTRING: "+paddedNumberAsString);   
	      // 3 digits
	      number = 125;
	      numberAsString = String.valueOf(number);
	      paddedNumberAsString = "0000000000".substring(numberAsString.length()) + numberAsString;
	      System.out.println("Pad using SUBSTRING: "+paddedNumberAsString);
	      
	      number = 15;
	      numberAsString = String.valueOf(number);
	      StringBuilder sb = new StringBuilder();
	      while(sb.length()+numberAsString.length()<10) {
	         sb.append('0');
	      }
	      sb.append(number);
	      paddedNumberAsString = sb.toString();
	      System.out.println("Pad using STRINGBUILDER: "+paddedNumberAsString);
	      
	      number = 33;
	      System.out.println("Pad using Apache String Utility: "+StringUtils.leftPad(String.valueOf(number), 10));
	      System.out.println("Pad using Apache String Utility: "+StringUtils.rightPad(String.valueOf(number), 10));
	      System.out.println("Pad using Apache String Utility: "+StringUtils.leftPad(String.valueOf(number), 10,"0"));

	}

}
