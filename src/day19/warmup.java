package day19;

import java.util.Scanner;

public class warmup {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your user name");
		String user = scan.nextLine();
		System.out.println("Enter Your password");
		String pass = scan.nextLine();
		
		String username="cybertek.batch12@gmail.com";
		String password = "Javengers";
		
		if(user.endsWith("@gmail.com")) {
			if(user.equalsIgnoreCase(username)&& pass.equals(password)) {
				
				System.out.println("Logged in succesfully");
			
			}else {
				if(!user.equalsIgnoreCase(username)&& !pass.equals(password)) {
					System.out.println("both user name and password are incorrect");
					
				} else if(user.equalsIgnoreCase(username)) {
					System.out.println("invalid password");
				}else {
					System.out.println("invalid user name");
				}
			}
			
			
			
			
		} else {
			System.out.println("it's not a valid email address");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
