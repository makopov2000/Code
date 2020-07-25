package com.java8.String;

public class Strip_Some_Characters_From_String {

	public static void main(String[] args) {
		String aString = "Four (4) score and seven (7) years ago";
		
		String newString = aString.replaceAll("[^a-zA-Z]",""); // Fourscoreandsevenyearsago - Only CHAR
		String newString2 = aString.replaceAll("[^a-zA-Z0-9]",""); // Four4scoreandseven7yearsago - CHAR and NUMB
		
		System.out.println(newString);
		System.out.println(newString2);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < aString.length(); i++) {
		  switch(aString.charAt(i)) {
		    case 'o':
		    case '(':
		    case ')':
		    case 'a':
		    case '-': break;
		    default: sb.append(aString.charAt(i));
		  }
		}
		System.out.println(sb); // Fur 4 scre nd seven 7 yers g
		
		System.out.println(aString.replaceAll("[ay47]", ""));  // Four () score nd seven () ers go

	}

}
 