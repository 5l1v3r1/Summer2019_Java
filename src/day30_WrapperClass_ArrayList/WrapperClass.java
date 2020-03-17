package day30_WrapperClass_ArrayList;

import java.util.Arrays;

public class WrapperClass {
	/*
	 They are designed for every primitive in java has a class.
	 Primitives: byte, short, int, long, float, double, boolean, char.
	 
	 Wrapper classes: Byte, Short, Integer, Long, Float, Double, Boolean, Character.
	 All wrapper class presented in java.lang package
	 
	 String class is also presented in java.lang package
	 All classes in package java.lang imported by default
	 
	 Auto-boxing: converting primitive values to Wrapper class
	 Unboxing: converting wrapper class value to primitives
	 
	 default values of primitives:
	               byte, short, int, long => 0
	               double, float => 0.0
	               boolean => false
	               char => space
	               
	 default value of the wrapper class is null
	 
	 */
	
	public static void main(String[] args) {
		int numInt = 10;
		Integer numInteger = 10;
		
		double d = 5.5;
		Double D = 5.5;
		
		long l = 20L;
		Long L = l;  
		
		System.out.println(L);
		
		Boolean B = false;
		boolean b = B;
		
		System.out.println(b); // unboxing
		
		Integer[] arr = new Integer[3]; // [0, 0, 0]
		System.out.println(Arrays.toString(arr));
		
		
		// wrapper classes has their own methods
		Integer num2 = 20;
		int x = num2.MAX_VALUE;
		
		System.out.println(x);
		
	}
	
	
	
	
	
	
	
	
	
	

}
