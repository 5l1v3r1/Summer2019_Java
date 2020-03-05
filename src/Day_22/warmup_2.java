package Day_22;

import java.util.Scanner;

public class warmup_2 {
	public static void main(String[] args) {
		
		
		/*
		   abba ==> abba ==> palindrome
		   
		   level ==> level ==> palindrome
		   
		   
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter some sentence");
		String original = scan.nextLine();
		// index           0123456
		
		// rv index         6543210 
		String reverse = ""; // "gfedcba"
		
		
	/*	for(int i = original.length()-1; i >= 0 ; i--) {
			reverse += original.substring(i, i+1);
		}
		*/
		
		int i = original.length()-1;
		while(i>=0) {
			reverse += original.substring(i, i+1);
			reverse += original.charAt(i);
			i--;
		}
		
		
		boolean result = original.equals(reverse)? true : false;
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
