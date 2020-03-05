package day_25;

public class warmup {
	public static void main(String[] args) {
		
		
		/*
		 find the unique character
		 */
		
		int[]arr = {1,1,2,2,3,4,4};
		 
		
	for(int j = 0; j < arr.length; j++)	{
		
		int count = 0;
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] == arr[j]) {
				count++;
			}
		}
	  if(count == 1) {
		  System.out.println(arr[j]+" ");
	  }
	
	}	
		
	
		String[] arr2 = {"A", "A", "B", "C", "C", "A", "A"};
		
		for (int g = 0; g < arr2.length; g++ ) {
			
			int count2 = 0;
			for(int a =0; a < arr2.length; a++) {
				
				if(arr2[a]==(arr2[g])) {
					count2++;
				}
				
			}
			
			if(count2 == 1) {
				System.out.println(arr2[g]);
			}
			
		}
		
		
		
	}

}
