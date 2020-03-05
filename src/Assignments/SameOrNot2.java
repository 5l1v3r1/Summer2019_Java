package Assignments;

import java.util.Scanner;

public class SameOrNot2 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter two words:");
		
		String a = scan.nextLine();
		String b = scan.nextLine();
		
		int l1 = a.length();
		int l2 = b.length();
		
		String a1 = a.substring(0,2);  // first two letter of a
		String b1 = b.substring(l2-2, l2); // last two letter of b
		
		boolean c = a1.equals(b1);
		
		if(c) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
