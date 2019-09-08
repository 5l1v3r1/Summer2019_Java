package day15;

import java.util.Scanner;

public class task_2 {
	public static void main(String[] args) {
		
		
		/*
		 
		 write a program that asks user to enter three numbers and returns the largest number.
		 do it with ternary
		 
		 */
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter num1");
		double n1 = input.nextDouble();
		
		System.out.println("enter num2");
		double n2 = input.nextDouble();
		
		System.out.println("enter num3");
		double n3 = input.nextDouble();
		
		
		double Largest = (n1 > n2 && n1 > n3)? n1
			             	:(n2 > n1 && n2 > n3)? n2
					        	: n3;
								   
		System.out.println("largest number is "+ Largest);
						
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
