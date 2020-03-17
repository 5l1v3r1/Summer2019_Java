package day31_javaReview;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {
	
    	
    	//ask user to enter 3 numbers and find the maximum and minimum numbers
    	
    	Scanner scan = new Scanner(System.in);
        System.out.println("how many numbers would you like to add?");
        int number = scan.nextInt();
    	
    	int[] arr = new int[number];   	
    	for(int i = 0; i< number; i++) {
    		System.out.println("enter a number");
    		arr[i] = scan.nextInt();
    	}
    	System.out.println(Arrays.toString(arr)); // [2, 5, 8]
    	Arrays.sort(arr);
    	System.out.println("minimum value: "+arr[0]);
    	System.out.println("maximum value: "+ arr[arr.length-1]);
    	
   }

}
