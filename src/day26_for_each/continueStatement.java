package day26_for_each;

public class continueStatement {
	public static void main(String[] args) {
		
		
		/*
		 
		 continue == means "skip" in java
		 
		 */
		
		for(int i=0; i<5;i++) {
			if(i == 2) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("====================");
		
		
		int[] numbers = {1,2,3,4,5};
		for(int i =0; i<numbers.length;i++) {
			if(numbers[i] <3) {
				continue;
			}
			System.out.print(numbers[i]+" ");
		}
	
	}

}
