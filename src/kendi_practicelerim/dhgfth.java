package kendi_practicelerim;

import java.util.Scanner;

public class dhgfth {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("enter something:");
		String a = scan.nextLine();
		String str = "";
		int length = a.length();

		for(int i = length-1; i>=0; i--) {
			
			str += a.charAt(i);
			
		}
		
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
	}

}
