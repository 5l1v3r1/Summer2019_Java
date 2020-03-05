package Assignments;

import java.util.Scanner;

public class SameOrNot {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String a = scan.nextLine();
		
		
		String r = a.substring(0, 1);
		String r2 = a.substring(a.length()-1);
		
		boolean ch = r.equals(r2);
		
		System.out.println(ch);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
