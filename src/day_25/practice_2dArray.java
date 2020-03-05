package day_25;

import java.util.Arrays;

public class practice_2dArray {
	public static void main(String[] args) {
		
		int[][] arr = {{1,2} , {3,4,5,6,7}, {8,9}};
		
		int length = arr.length;
		
		
	for(int i= 0; i < length; i++) {
			
			System.out.print(Arrays.toString(arr[i])+" ");	
		}
		
	System.out.println();
		
	for(int i= 0; i < length; i++) { // checks each index of 1d array
			
            	for(int j = 0; j < arr[i].length; j++) { // checks each index if 2d array
		        	System.out.print(arr[i][j]+" ");
            	}
		   }
		
		
		
		System.out.println();
		
		
		
		
		char[][] ch = {{'A', 'B'} ,  {'C','D'}};
		
		for(int i = 0; i < ch.length; i++) {
			
			for(int j = 0; j < ch[i].length; j++) {
				
				System.out.print( ch[i][j]+" ");
				
			}
			
		}
		
		System.out.println();

		
	}

}
