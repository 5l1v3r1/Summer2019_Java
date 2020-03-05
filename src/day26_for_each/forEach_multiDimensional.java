package day26_for_each;

import java.util.Arrays;

public class forEach_multiDimensional {
	public static void main(String[] args) {
		
		
		int[] arr1D = {1,2,3,4};
		
		int[][] arr2D = {  {1,2,3,4} , {5,6,7,8}  };
		      // index:        0           1
		
		for(int i =0; i < arr2D.length; i++) {
			
			for(int j =0; j < arr2D[i].length; j++) {
				
				System.out.print(arr2D[i][j]+" ");
			}
			
		}
		
		
		
		System.out.println();
		System.out.println("====================");
		
		
		//do it with for each loop:
		
		for(int[] each1: arr2D) {
			for(int each2 : each1) {
				System.out.print(each2+" ");
			}
		}
		
		System.out.println();
		System.out.println("====================");
		
		
		String[][] str2D = {{"cay","yemek"},{"su","seker"}};
		
		for(String[] each1DArrays : str2D) {
		//	System.out.println(Arrays.toString(each1DArrays));
			
			for(String Eachvalues : each1DArrays ) {
				System.out.print(Eachvalues+" ");
			}
			
		}
		
		System.out.println();
		System.out.println("====================");
		
		
		int[][][] num3D = {  { {1,2}, {3,4} }, { {5,6},{7,8} }  };
		
		for(int[][] each2DArray : num3D) {
			for(int[] each1DArray : each2DArray) {
				for(int eachValues : each1DArray) {
					System.out.print(eachValues+" ");
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
