package day_24javaRecap;

public class warmup_01 {
	public static void main(String[] args) {
		
		
		/*
		 1-program that can return the maximum value from an int array
		 
	     2-program that can return the second maximum value from an int array
		 
		 */
		
		int[] arr = {20, 200, 30, 40, 50, 500};
		
		int max = 0;
		
		for(int i=0; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("maximum is: "+max);
		                                                         // INTERVIEW QUESTION
		
		int secmax = 0 ;
		for(int j = 0; j < arr.length; j++) {
			if( arr[j] > secmax && arr[j] != max ) {
				secmax = arr[j];
			}
		}
		
		System.out.println("second max is: "+secmax);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
