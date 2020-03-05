package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPrinting {
	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		String[] arr = new String[5];
		System.out.println("Enter 5 word at least 3 letters:");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextLine();
			arr[i] = arr[i].substring(0,3);
		}
		
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
