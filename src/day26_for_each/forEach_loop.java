package day26_for_each;

import java.util.Arrays;

public class forEach_loop {
	
	public static void main(String[] args) {
		
		
		/*
		 used to access the value in a collection of values,
		 it's a loop that's already been iterated.
		 for each loop can never be infinite. 
		 
		 syntax of for each loop
		                 
		            for(DataType each : VariableNameOfCollection){
		                                       (ArrayName)
		            }
		 
		 when do we use it: when we don't need to create the index variables
		 we provide index number in "for each loop"
		 
		 
		 */
		
		int[] arr = {1,2,3,4,5};
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("====================");
		
	//=====================INTEAD OF THAT============================================	
		
		for(int each : arr) {
			System.out.print(each+" ");
		}
		
		System.out.println();
		System.out.println("====================");

		String[] str1 = {"A","B","C"};
		for(String each : str1) {
			System.out.print(each+" ");
		}
		
		System.out.println();
		System.out.println("====================");
	
		
		char[] ch = {'z','x','y','c','a','b'};
		Arrays.sort(ch);
		for(char each : ch) {
			System.out.print(each+" ");
		}
		
		System.out.println();
		System.out.println("====================");
		
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		for(int each : arr1) {
			if(each%2==0) {
				System.out.print(each+" ");
			}
		}
			
		
	}
	

}
