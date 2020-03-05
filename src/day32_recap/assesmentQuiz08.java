package day32_recap;

import java.util.Arrays;

public class assesmentQuiz08 {
	public static void main(String[] args) {
		
		int[] arr = {30,20,10,5,0};
		Arrays.sort(arr); // 0 5 10 20 30
		int count = 0;
		 for(int i = 0; i < arr.length; i++) {
			
			 if(arr[i] == 30) {
				 continue;
				 // count++; ==> UNREACHABLE CODE ! IT IS NOT GONNA BE EXECUTED. IT CAUSES COMPILE ERROR.
			 }
			 System.out.print(arr[i]+" ");
		 }
		
		 
		 
		 
		 
		 
		 
	}

}
