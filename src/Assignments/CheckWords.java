package Assignments;

import java.util.Scanner;

public class CheckWords {
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter three words");
		String a = scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();

		
	/*	if(a.length()==b.length()) {
			
			if(a.length()==c.length()) {
				System.out.println("all words are same");
			}else {
				System.out.println("Not Same nor Different lengths");
			}
			
		}else if(c.length()==b.length()) {
			if(a.length()==b.length()) {
				System.out.println("all words are same");
			} else {
				System.out.println("Not Same nor Different lengths");                      //MALLIK
			}
		}else if(c.length()==a.length()) {
			if(a.length()==b.length()) {
				System.out.println("all words are same");
			} else {
				System.out.println("Not Same nor Different lengths");
			}
			
		} else {
			System.out.println("all different");
		}
		
		*/
		
		int l1 = a.length();
		int l2 = b.length();
		int l3 = c.length();
		
		
		
		
		if(l1 == l2 && l1 == l3) {
			System.out.println("All are same length");
		}
		else if(l1 == l2 && l1 != l3) {
			System.out.println("Not Same nor Different lengths");
		}
		else if(l1 == l3 && l1 != l2) {
			System.out.println("Not Same nor Different lengths");
		}
		else if(l2 == l3 && l2 != l1) {
			System.out.println("Not Same nor Different lengths");
		}else if(l1 != l2 && l1 != l3){
			System.out.println("all different");
		}
		
		
		
		
		
		
		
		
	}

}
