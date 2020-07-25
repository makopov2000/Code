package com.java8.String;

import java.util.StringTokenizer;
public class String_Tokenizer_Example {
 
  public static void main(String args[]) {
    String rawData="John,David,George,Frank,Tom";
    StringTokenizer tokenizer=new StringTokenizer(rawData,",");
    while(tokenizer.hasMoreTokens()){
      System.out.println(tokenizer.nextToken());
    }
  }
}