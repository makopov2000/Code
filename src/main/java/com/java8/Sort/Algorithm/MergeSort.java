package com.java8.Sort.Algorithm;

public class MergeSort {
	 static int inputArray[] = { 10, 5, 100, 1,10000};
	  
	 public static int[] doMergeSort(int[] values) {
	  if(values.length<=1){
	   return values;
	  }
	  int mid=(values.length)/2;
	  int[] left=new int[mid];
	  int[] right=new int[(values.length)-mid];
	  for(int leftCount=0;leftCount<mid;leftCount++){
	   left[leftCount]=values[leftCount];
	  }
	  for(int rightCount=0;rightCount<((values.length)-mid); rightCount++){
	   right[rightCount]=values[mid+rightCount];
	  }
	  return merge(doMergeSort(left),doMergeSort(right));
	 }
	  
	 public static int[] merge(int[] left, int[]right){
	  int leftCounter=0,rightCounter=0, mergedCounter=0;
	  int merged[]=new int[left.length+right.length];
	  while(leftCounter < left.length && rightCounter < right.length){
	   if(left[leftCounter]<=right[rightCounter]){
	     merged[mergedCounter]=left[leftCounter];
	    leftCounter++;
	    mergedCounter++;
	   }else{
	    merged[mergedCounter]=right[rightCounter];
	    rightCounter++;
	    mergedCounter++;
	   }
	  }
	  while(leftCounter<left.length){
	   merged[mergedCounter]=left[leftCounter];
	   leftCounter++;
	   mergedCounter++;
	  }
	  while(rightCounter<right.length){
	   merged[mergedCounter]=right[rightCounter];
	   rightCounter++;
	   mergedCounter++;
	  }
	  return merged;
	 }
	  
	 public static void printArray(int[] sortedArray) {
	  for (int i = 0; i < sortedArray.length; i++) {
	   System.out.print(" " + sortedArray[i]); 
	  }
	 }
	  
	 public static void main(String args[]) {
	 System.out.print("Array Before Sorting->");
	  printArray(inputArray);
	  int sortedArray[]=doMergeSort(inputArray);
	  System.out.print("\nArray After Sorting ->");
	  printArray(sortedArray);
	 }
	}