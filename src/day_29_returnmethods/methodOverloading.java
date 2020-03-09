package day_29_returnmethods;

import java.util.Arrays;

public class methodOverloading {
	/*
	 same method name different parameters
	 */
	
	public static void main(String[] args) {
		
		int result = sum(10,20,30);
		System.out.println(result);
		System.out.println(sum(0.5,10.5));
		
		// overload method ex: the sort methods of arrays class, it accepts all data type
		
		int[]arr= {1,2,3,4,5};
		SortReverse(arr);
		
		System.out.println();
		
		char[] ch = {'a','b','c'};
		SortReverse(ch);
		
		System.out.println();
		
		String[] str = {"A","B","C","D"};
		SortReverse(str);
	}
	
	public static void SortReverse(int[] arr) {
		Arrays.sort(arr);
		for(int i = arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void SortReverse(char[]arr) {
		Arrays.sort(arr);
		for(int i = arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void SortReverse(String[]arr) {
		Arrays.sort(arr);
		for(int i = arr.length-1; i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static int sum(int a, long b, int c) {
		return a+(int)b+c;
	}
	
	public static double sum(double a, double b) {
		return a+b;
	}
	
	
}