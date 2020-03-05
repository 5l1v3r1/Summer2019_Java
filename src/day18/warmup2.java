package day18;

import java.util.Scanner;

public class warmup2 {
	public static void main(String[] args) {
		
		/*
		   mUhTaR
		   cYbErTeK
		   
		   output should be: 
		   Muhtar 
		   Cybertek
		   
		 
		   
		 */
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name");
		String firstname = scan.nextLine();
		// mUhTaR
		
		firstname = firstname.substring(0, 1).toUpperCase()+firstname.substring(1).toLowerCase() ;
		System.out.println(firstname);
		
		
		
		System.out.println("Enter your last name");
		String lastname = scan.nextLine();
		//cYbErTeK
		
		lastname = lastname.substring(0, 1).toUpperCase()+lastname.substring(1).toLowerCase();
		
		String fullname = firstname+" "+lastname;
		System.out.println(fullname);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
