package day_23_arrays;

import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[] args) {
		
		String student1 = "koko";
		String student2 = "lolo";
		String student3 = "coco";
		
		String[] AllStudents = {"koko", "lolo", "coco"};
		
		AllStudents[0]= "jojo";    // reassigned it
		
		System.out.println(AllStudents[0]);
		
		// without giving value, initialize the size
		int[] array = new int[4];   // this can contain only 4 value
		
		
		System.out.println(array.length);
		System.out.println(array[0]); //0
		System.out.println(array[1]); //0  in console
		
		
		array[1] = 100;
		System.out.println(array[1]); //100
		
		// another thing
		Scanner scan = new Scanner(System.in);
		int[] input = new int[5];
		
		for(int i =0; i< input.length; i++) {
			System.out.println("enter a number");
			input[i] = scan.nextInt();
		}
		
		for(int i =0; i< input.length; i++) {
			System.out.print(input[i]+" ");
			
		}
		
		
		String[] herkes = new String[358];  // new keyword in array is used to give the size of the array only
		
		
		
		
	}

}
