package day_28_Recap;

import java.util.Arrays;

public class warmup {
	
	
	public static void main(String[] args) {
		
		int[] arr = {100,90,80};
		
		SortDes(arr);
		
	}
	
	
	public static void SortDes(int[] array) {
		
		Arrays.sort(array);
		for (int i = array.length-1; i >=0;i--) {
			System.out.print(array[i]+" ");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
