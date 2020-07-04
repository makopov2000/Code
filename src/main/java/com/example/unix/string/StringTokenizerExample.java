package com.example.unix.string;

import java.util.StringTokenizer;
public class StringTokenizerExample {
 
  public static void main(String args[]) {
    String rawData="John,David,George,Frank,Tom";
    StringTokenizer tokenizer=new StringTokenizer(rawData,",");
    while(tokenizer.hasMoreTokens()){
      System.out.println(tokenizer.nextToken());
    }
  }
}