package day15;

import java.util.Scanner;

public class stringinput {
	public static void main(String[] args) {
		
		
		/*
		 next vs nextLine();
		 
		 
		 
		 */

		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your first name");
		String firstname = scan.nextLine();
		System.out.println("enter your last name");
		String lastname = scan.nextLine();
		
		System.out.println("first name is: "+ firstname);
		System.out.println("last name is: "+lastname);
		
		
		
		scan.close();
		
		
		
		
		
		
		
		
	}
	
	
}
