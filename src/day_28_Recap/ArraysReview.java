package day_28_Recap;

import java.util.Scanner;

public class ArraysReview {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two values:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		scan.nextLine();
		System.out.println("Write a operator (-+*/%)");
		String c = scan.nextLine();
		
		String result = "";
		if(c.equals("-")) {
			result += (a-b);
		}else if(c.equals("+")) {
			result += (a+b);
		}else if(c.equals("*")) {
			result += (a*b);
		}else if(c.equals("/")) {
			result += (a/b);
		}else if(c.equals("%")) {
			result += (a%b);
		}
		
		System.out.println(result);
	}
	
	
}
