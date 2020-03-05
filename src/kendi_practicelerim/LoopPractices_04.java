package kendi_practicelerim;

import java.util.Scanner;

public class LoopPractices_04 {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a starting number:");
		int start = scan.nextInt();
		System.out.println("Enter a ending number:");
		int end = scan.nextInt();
		
		
		int i = start;
		while(i<=end) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
