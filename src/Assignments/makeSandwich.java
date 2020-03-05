package Assignments;

import java.util.Scanner;

public class makeSandwich {
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("enter two words");
		
		String a = scan.nextLine();
		String b = scan.nextLine();
		
		if(a.length()%2==0) {
			System.out.println(a.substring(0, a.length()/2)+b+a.substring(a.length()/2, a.length()));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
