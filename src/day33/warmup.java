package day33;

import java.util.Arrays;

public class warmup {
	
	/*
	 tersine cevirerek yazdirma
	 
	 */
	
	public static void main(String[] args) {
		
		int[] arr = {23,5,56,77,65,34};
		arr = SortDe(arr);
		System.out.println(Arrays.toString(arr));
		
		double[] arr2 = {23,65,89,2,1,4,5,56,56};
	    arr2 = SortDe(arr2);
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = {'a','t','e','c'};
		arr3 = SortDe(arr3); 
		System.out.println(Arrays.toString(arr3));
		
		String[] arr4 = {"d","asd","dfdfs","ree"};
		arr4 = SortDe(arr4);
		System.out.println(Arrays.toString(arr4));
	}
	
	public static int[] SortDe(int[] arr) {
		Arrays.sort(arr);
		int[] arr2 = new int[arr.length];
		
		int j =0;
		for(int i = arr.length-1; i >= 0; i--) {
			          arr2[j] =  arr[i];
			          j++;
		}
		
		return arr2;
	}
	
	public static double[] SortDe(double[] arr) {
		Arrays.sort(arr);
		double[] arr2 = new double[arr.length];
		
		int j =0;
		for(int i = arr.length-1; i >= 0; i--) {
			          arr2[j] =  arr[i];
			          j++;
		}
			          return arr2;
	}
	
	public static char[] SortDe(char[] arr) {
		Arrays.sort(arr);
		char[] arr2 = new char[arr.length];
		
		int j =0;
		for(int i = arr.length-1; i >= 0; i--) {
			          arr2[j] =  arr[i];
			          j++;
		}
		
		
		return arr2;
	}
	
	public static String[] SortDe(String[] arr) {
		Arrays.sort(arr);
		String[] arr2 = new String[arr.length];
		
		int j =0;
		for(int i = arr.length-1; i >= 0; i--) {
			          arr2[j] =  arr[i];
			          j++;
		}
		
		
		return arr2;
	}

	public static Integer[] SortDe(Integer[] arr) {
		Arrays.sort(arr);
		Integer[] arr2 = new Integer[arr.length];
		
		int j =0;
		for(int i = arr.length-1; i >= 0; i--) {
			          arr2[j] =  arr[i];
			          j++;
		}
		
		return arr2;
	}
	
	
	
}
