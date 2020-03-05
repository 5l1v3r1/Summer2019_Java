package Assignments;

import java.util.Scanner;

public class StartEndWords {
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		String b = scan.nextLine();
		
		int l1 = a.length();
		int l2 = b.length();

		String a1 = a.substring(l1-1);
		String b1 = b.substring(0, 1);
		
		if ((l1/5 == 1) && (l2/5 == 1)) {
			
			if(a1.equals(b1)) {
				System.out.println("Fizz");
			} else {
				
				System.out.println("Buzz - did not match");
			}
				
			
			
		}else {
			System.out.println("need to be exactly 5 chars lenght");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
