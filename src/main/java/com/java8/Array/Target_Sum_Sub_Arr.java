package com.java8.Array;

public class Target_Sum_Sub_Arr {
	 
	public static void main(String[] args) {

		int[] arr = {1,1,1,2};
		int target = 2;
		
 
		solve(arr, target);
		
	}
	
	public static void solve(int[] arr, int target)
	{
		for(int start = 0; start < arr.length; start++)
		{
                 // initialize the sum of the current subarray to 0.
			int currSum = 0;
			for(int end = start; end < arr.length; end++)
			{
                // add every element of the current subarray
                // to the current running sum.
				currSum += arr[end];
				
               // print the starting and ending indices once we get
               // subarray with given sum
				if(currSum == target)
				{
				     System.out.println("starting index : " +
                                 start + ", " + "Ending index : " + end);
                                                         
				}
				
			}
		}
	}
 
}
