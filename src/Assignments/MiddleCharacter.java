package Assignments;

import java.util.Scanner;

public class MiddleCharacter {
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a word");
		
		String word = scan.nextLine();
		
		int a = word.length();
		
		if(a%2==0) {
			word = word.substring(a/2-1, a/2+1);
			System.out.println(word);
		} else if(a%2!=0) {
			word = word.substring(a/2, a/2+1);
			System.out.println(word);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
