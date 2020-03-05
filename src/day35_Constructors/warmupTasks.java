package day35_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class warmupTasks {
	/*
	 Warm Up: 
    1. write a return method that accepts an int array and returns it as an ArrayList
    2. write a return method that accepts an Integer arrayList and returns the maximum number
            DO NOT USE SORT METHOD
    3. write a return method that accepts an Integer arrayList and returns the second maximum number
            DO NOT USE SORT METHOD
    4. write a return method that accepts an Integer arrayList and returns the minimum number
            DO NOT USE SORT METHOD
    5. write a return method that accepts an Integer arrayList and returns the second minimum number
            DO NOT USE SORT METHOD
	 */
	
	public static void main(String[] args) {
	
	// task 1
		int[] arr = {1,2,3,4,5};
		ArrayList<Integer> list = ArrayToArrayList(arr);
		System.out.println(list);
	// task 1 overload	
		double[] arr2 = {1.5, 2.5, 3.5};
		ArrayList<Double> list2 = ArrayToArrayList(arr2);
		System.out.println(list2);
		
    // task 2
		ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		int max = MaxNum(list3);
		System.out.println(max);
		
	// task 3
		ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(10,20,35,30));
		int secondmaximum = SecondMax(list4);
		System.out.println(secondmaximum);
	
	// task 4
		
	
	}
	
	
	
	// task 1
	public static ArrayList<Integer> ArrayToArrayList(int[] arr){
		
		ArrayList<Integer> list = new ArrayList<>();
		    
		for(int each : arr) {
			list.add(each); // Auto boxing
		}
	
		return list;
	}
	
	// task 1 overload
    public static ArrayList<Double> ArrayToArrayList(double[] arr){

		ArrayList<Double> list = new ArrayList<>();
		    
		for(Double each : arr) {
			list.add(each); // Auto boxing
		}
	
		return list;
    	
    }
	
	// task 2
    public static int MaxNum(ArrayList<Integer> list) {
    	int max = Integer.MIN_VALUE;
    	   for(int each : list) {  // unboxing
    		   if(each > max) {
    			   max = each;
    		   }
    	   }
    	
    	return max;
    }
    
    // task 3
    public static int SecondMax (ArrayList<Integer> list) {
    	Integer max = MaxNum(list);
    	list.remove(max);
    	int Secmax = MaxNum(list);
    	return Secmax;
    }
    
    // task 4
    public static int MinNum (ArrayList<Integer> list) {
    	
    	int min = Integer.MAX_VALUE;
 	   for(int each : list) {  // unboxing
 		   if(each > min) {
 			   min = each;
 		   }
 	   }
 	
 	return min;
    	
    }
    
    
    
    
}
