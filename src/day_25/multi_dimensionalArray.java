package day_25;

import java.util.Arrays;

public class multi_dimensionalArray {
	public static void main(String[] args) {
		
		
		/*
		 multi-dimensional arrays:
		  
		  n dimensional array contains(n-1) dimensional array
		 
		 2 dimensional array: array that contains (2-1) dimensional array
		 
		 
		 */
		
		int[][] twoArray = { {1,2,3} , {4,5,6} };
		
		//                        0        1         0       1  
		String[][] lololop = { {"coco", "lolo"} , {"nono", "koko"} };
		//                            0                  1
		//[represents the index number of 1 dimensional arrays][represents the index number of the values]
		
		// Print coco:
		System.out.println(lololop[0][0]);
		
		// Print nono:
		System.out.println(lololop[1][0]);
		
		// [coco, lolo]
		System.out.println(Arrays.toString(lololop[0]));                               //  YOU CAN GIVE MORE THAN TWO PARANTEZ !!!!!!
		
		// print all of them:
		//	Arrays.deepToString(variable name)
	     
		System.out.println(Arrays.deepToString(lololop));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
