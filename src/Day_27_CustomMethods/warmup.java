package Day_27_CustomMethods;

import java.util.Arrays;

public class warmup {
	public static void main(String[] args) {
		
		
		int[]numbers;
		numbers = new int[100];
		
		for(int i = 1; i <= 100; i++) {
			
			numbers[i-1] = i; // or [i] = i+1
		      // each value of i will be assigned to the index number of (i-1)
			 // numbers[0] = 1
			// numbers[1] = 2
		   //      .
		  //       .
		}
		
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ^,^ ");
		
		for(int each : numbers) {
			if(each % 2 == 0) {
				continue;
			}
			System.out.print(each+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
