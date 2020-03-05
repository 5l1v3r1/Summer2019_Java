package day57_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		 
		int[] number = {100,200,300};
		
		
		try {
			System.out.println(number[5]);
			System.out.println("Checked exception");
			
		} catch (ArrayIndexOutOfBoundsException anyname) {
			
			System.out.println("Unchecked exception");
		}
		
		System.out.println("work done");
		
	System.out.println("=====================================");
		
		
		try {
			Thread.sleep(2000);
			System.out.println("Checked exception");
		} catch (InterruptedException e) {
			System.out.println("Unchecked exception");
		}
	
		System.out.println("=====================================");
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,2,3));
		
		
		try {
			System.out.println(list.get(10));
			System.out.println("Checked exception");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Unchecked exception");
		}
		
		
		
	}

}
