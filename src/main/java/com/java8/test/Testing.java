package com.java8.test;

import java.util.*;
import java.util.stream.Collectors;


public class Testing {
private static String some = getvalue();
	public static List<String> list = new ArrayList<>();

    public static int solution(int[] A)
    {
         int identical = 0;
        Map<Integer, KeyValuePair<Integer, Integer>> dic = new HashMap<Integer, KeyValuePair<Integer, Integer>>();
//        		new Dictionary<Integer, KeyValuePair<Integer, Integer>>(); /* A[i], the number of repetition of 3 so far (Rep[i]),
//                    the number of identical pair so far ( Iden[i]). */
        Integer x = 0;
        KeyValuePair zero = new KeyValuePair<Integer, Integer>(x, x);
        for (int i = 0; i < A.length; i++)
        {
            if (!dic.containsValue(A[i]))
                dic.put(A[i], zero);
            else
            { 
               KeyValuePair<Integer,Integer> valDic = dic.get(A[i]);

                KeyValuePair<Integer, Integer> newVal;
                if (valDic.getKey() < 1)
                    newVal = new KeyValuePair<Integer, Integer>(1, 1);
                else
                {
                    int preIdenticalPair = valDic.getValue();
                    int preReptation = valDic.getKey();
                    int newRepetation = ++preReptation;
                    int newIdenticalPair = preIdenticalPair + newRepetation;
                    newVal = new KeyValuePair<Integer, Integer>(newRepetation, newIdenticalPair);
                }

                dic.put(A[i],newVal);
            }
        }

        for(KeyValuePair<Integer, Integer> i : dic.values()) {
        	identical += i.getValue(); 
        }
        return identical;
        
//        //summation of all identical pairs
//        foreach (KeyValuePair<Integer, KeyValuePair<Integer, Integer>> pair in dic)
//            identical += pair.Value.Value;
//        return identical;
    }
    
  
	
	private static String getvalue() {
		// TODO Auto-generated method stub
		return "MIKEEEE";
	}



	public static void main(String[] args) {
		System.out.println(some);
//		int[] arr1 = {3,5,6,3,3,5};
		int[] arr1 = {3,5,6,3,3,5,8,3,7,9};
		System.out.println("Solution: "+ solution(arr1));
		
		String s = "aakmaakmakda";
		Integer count = 0;
		for (int i = 0; i < s.length()-2; i++) {
			StringBuffer m = new StringBuffer("");
			m.append(s.substring(i, i+2)); 
			for (int y = i; y < s.length() - 2; y++) {
				int match = s.lastIndexOf(m.toString())-y;
//    			System.out.println("Print Occur:"+ m+ " : "+match);
    			if (count> match) {
    				
    			}else {
    				count = match;
    			}
			}		
		}
		
		int r = count>0?count:-1;
		System.out.println("Result: "+r);
		
	
		
		
		int number=0;
		int[] arr = {3,5,6,3,3,5};
		int ans = 0;
		 for (int i = 0; i < arr.length-1; i++) {
		        for (int j = i+1; j < arr.length-1; j++) {
		  
		            // finding the index with same 
		            // value but different index. 
		            if (arr[i] == arr[j]) 
		                ans++; 
		        }
		 }
		    System.out.println("Array:"+ ans);; 
		    
		    
		    int count1 = 0;
		    int curBefore = 0;
		    for (int i = 1; i < arr.length; i++)
		    {
		        if (arr[i] > arr[i - 1])
		        {
		            curBefore = i;
		        }
		        count1 += curBefore;
		    }
		    System.out.println("Count: "+count1);
		    
	

//    	 int x, y, temp;
//         System.out.println("Enter x and y");
//         Scanner in = new Scanner(System.in);
//         x = in.nextInt();
//         y = in.nextInt();
//         System.out.println("Before Swapping" + x + y);
//         temp = x;
//         x = y;
//         y = temp;
//    	
//    	
//        list.add("mike");
//        list.add("alex");
//        list.add("innel");
//        list.add("mike");
//        list.stream().forEach(l-> System.out.println(l));
//        System.out.println("-------------");
//        Set<String> set = new HashSet<>(list);
//        set.stream().forEach(s-> System.out.println(s));
//        System.out.println("-------------");
//        List<String> sort = list.stream().sorted().collect(Collectors.toList());
//        sort.stream().forEach(l-> System.out.println(l));
//
//        List<String> test = new ArrayList<>(list);
//        Set<String> set1 = new HashSet<>();
//        Map<String, String> map = new HashMap<>();
//
//        System.out.println(test);
//
//        // List all System properties
//        Properties pros = System.getProperties();
//        pros.list(System.out);
//   
//        // Get a particular System property given its key
//        // Return the property value or null
//        System.out.println(System.getProperty("java.home"));
//        System.out.println(System.getProperty("java.library.path"));
//        System.out.println(System.getProperty("java.ext.dirs"));
//        System.out.println(System.getProperty("java.class.path"));
//     

	}
}


//
//public static int solution(int[] A)
//{
//     int identical = 0;
//    Dictionary<Integer, KeyValuePair<Integer, Integer>> dic;
////    		new Dictionary<Integer, KeyValuePair<Integer, Integer>>(); /* A[i], the number of repetition of 3 so far (Rep[i]),
//                the number of identical pair so far ( Iden[i]). */
//    for (int i = 0; i < A.length; i++)
//    {
//        if (!dic.ContainsKey(A[i]))
//            dic.Add(A[i], new KeyValuePair<Integer, Integer>(0,0));
//        else
//        { 
//           KeyValuePair<Integer,Integer> valDic = dic[A[i]];
//
//            KeyValuePair<Integer, Integer> newVal;
//            if (valDic.Key < 1)
//                newVal = new KeyValuePair<Integer, Integer>(1, 1);
//            else
//            {
//                int preIdenticalPair = valDic.Value;
//                int preReptation = valDic.Key;
//                int newRepetation = ++preReptation;
//                int newIdenticalPair = preIdenticalPair + newRepetation;
//                newVal = new KeyValuePair<Integer, Integer>(newRepetation, newIdenticalPair);
//            }
//
//            dic[A[i]] = newVal;
//        }
//    }
//
//    //summation of all identical pairs
//    foreach (KeyValuePair<Integer, KeyValuePair<Integer, Integer>> pair in dic)
//        identical += pair.Value.Value;
//    return identical;
//}
