package com.java8.String;

public class CountOccurrencesOfSubstringExample {
	 
    public static void main(String[] args) {
        
        String str = "JavaExamplesJavaCodeJavaProgram";
        
        String strFind = "Java";
        int count = 0;
        int fromIndex = 0;
        
        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){
 
            System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;
            
        }
        
        System.out.println("Total occurrences: " + count);
    }
}