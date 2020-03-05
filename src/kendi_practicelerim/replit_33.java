package kendi_practicelerim;

import java.util.Scanner;

public class replit_33 {
	public static void main(String[] args) {
		
		
		int seniorCitizens, nonseniorCitizens, age;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter current count for seniorCitizens and nonseniorCitizens:");
		seniorCitizens = scan.nextInt();
		nonseniorCitizens = scan.nextInt();
		
		System.out.println("What is new citizen's age?");
		age = scan.nextInt();
		
		
		if(age>=65) {
			System.out.println("Senior Citizen");
			seniorCitizens = seniorCitizens+1;
			
		}
		else if(age<65) {
			System.out.println("Non-Senior Citizen");
			nonseniorCitizens = nonseniorCitizens+1;
		}
		
		System.out.println("New seniorCitizens count "+seniorCitizens);
		System.out.println("New nonseniorCitizens count "+nonseniorCitizens);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
