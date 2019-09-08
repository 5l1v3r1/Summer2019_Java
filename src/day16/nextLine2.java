package day16;

import java.util.Scanner;

public class nextLine2 {
	public static void main(String[] args) {
		
		
		
		/*
		 write program that accepts zip code, city, state, phone number
		 and then display all those gather information
		 do not use next() method
		 */
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your zip code");
		int zip = input.nextInt();
		
		   input.nextLine();
		System.out.println("Enter your city name");
		String cityname = input.nextLine();
		
		System.out.println("zip code is: "+zip);
		System.out.println("city name is: "+cityname);
		
		System.out.println("Enter your phone number");
		int pn = input.nextInt();
		
		input.nextLine();
		System.out.println("enter state name");
		String st = input.nextLine();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
