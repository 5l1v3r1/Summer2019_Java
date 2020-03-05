package Assignments;

import java.util.Scanner;

public class IgnoreTheFirstOnes {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two words");
		String w1 = scan.nextLine();
		String w2 = scan.nextLine();

		String a = w1.substring(0, 1);
		String b = w2.substring(0, 1);
		
		w1 = w1.replace(a,"");
		w2 = w2.replace(b, "");
		
		System.out.println(w1+w2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
