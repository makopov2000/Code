package com.java8.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class ShortestCommonSuperstringAlgorithm {

	public static void main(String arg[]) {
		 
        Set<String> fragments = new HashSet<String>();
        ShortestCommonSuperstringAlgorithm superStringCreator = new ShortestCommonSuperstringAlgorithm();
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int noOfFragments = 0;      // noOfFragments = m 
        
        fragments.add("mike");
        fragments.add("alex");
 
//        // read input string, no. of fragments and their length
// 
//        try{
//            System.out.println("Enter the no of Fragments : ");
//            noOfFragments = Integer.parseInt(br.readLine());
// 
//            int size = 1;
//            do{
//                System.out.println(size + ". Fragment String : ");
//                input = br.readLine();
//                fragments.add(input);
//                size++;
//            }while(size<=noOfFragments);
// 
//        }catch(Exception ex){
//            System.out.println("Please give correct Inputs.");
//            ex.printStackTrace();
//            return;
//        }
 
        // find the shortest super string
        superStringCreator.createSuperString(fragments);
    }
	
	private void createSuperString(Set<String> subStrings) {
        int totalStrings = subStrings.size();
        String[] match = new String[totalStrings];
        int i = 0;
 
        for(String superString : subStrings) {
 
            Set<String> temp = new HashSet<String>(subStrings);
            String maxSuperString = superString;
            while(temp.size() > 1) {
 
                String subString = "";
                String nextMaxSuperString = maxSuperString;
 
                for(String nextString : temp) {
 
                    if(!nextString.equals(nextMaxSuperString)) {
 
                        String superTemp = getSuperString(maxSuperString, nextString);
                        if (nextMaxSuperString.equals(maxSuperString) || nextMaxSuperString.length() > superTemp.length()) {
                            nextMaxSuperString = superTemp;
                            subString = nextString;
                        }
                    }
                }
 
                temp.remove(maxSuperString);
                temp.remove(subString);
                maxSuperString = nextMaxSuperString;
                temp.add(maxSuperString);
            }
 
            match[i] = maxSuperString;
            //System.out.println(match[i]);
            i++;
        }
 
        String bestAns = match[0];
 
        for(i = 1; i < match.length; i++) {
            if(bestAns.length() > match[i].length()) {
                bestAns = match[i];
            }
        }
 
        System.out.println("Shortest Common Super String => " + bestAns);
        System.out.println("With a Length of             => " + bestAns.length());
 
    }
 
    private String getSuperString(String superString, String someString) {
        String result = superString;
 
        int endIndex = someString.length() - 1;
 
        while(endIndex > 0 && !superString.endsWith(someString.substring(0, endIndex)))  {
            endIndex--;
        }
 
        if(endIndex > 0) {
            result += someString.substring(endIndex);
        }
        else {
            result += someString;
        }
 
        return result;
    }

}
