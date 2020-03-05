package day_25;

import java.util.Arrays;

public class arrayMethods {
	public static void main(String[] args) {
		
		
		/*
		 to print entire array as whole: we need to convert the array to string
		 Arrays.toString(VariableName) 
		 
		 
		 Arrays.sort(variableName);
		            sorts the values of the array in ascending order (smallest to biggest)
		 
		 */
		
		
		int[] arr = {1, 2, 3};
		System.out.println(arr);
		
		String str = Arrays.toString(arr);
		System.out.println(str);
		
		
		String[] names = {"Esmira", "Muazzez", "Huseyin", "Dilara", "Hamza"};
		System.out.println(names[0]);
		System.out.println(Arrays.toString(names));
		
		
		
		int[] numbers = {9, 8, 100, 3000, 4, 5, 6};
		  Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("max "+numbers[numbers.length-1]);
		
		System.out.println("min "+ numbers[0]);
		
		
		
		String[] list = {"lolo", "alulu","lala","olala","totoro"};
		Arrays.sort(list);
		
		System.out.println(Arrays.toString(list));
		
		
		
		char[] ch = {'0','9','5','8','6'};
		Arrays.sort(ch);
		System.out.println(Arrays.toString(ch));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
