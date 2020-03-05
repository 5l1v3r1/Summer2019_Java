package day_24javaRecap;

public class warmup_02 {
	public static void main(String[] args) {
		
		/*
		 program that return the minimum value from an int array
		  program that return the second minimum value from an int array

		 
		 */
		
		
		int[] arr = {100, 2, 2, 3, 4, 5, 6};
		int min = 999999;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		
		System.out.println("minimum number is: "+min);
		
		
		int secmin = 999999;
		for(int j = 0; j < arr.length; j++) {
			
			if( arr[j] < secmin && arr[j] > min ) {
				secmin = arr[j];
			}
		}
		
		
		System.out.println("second minimum is: "+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
