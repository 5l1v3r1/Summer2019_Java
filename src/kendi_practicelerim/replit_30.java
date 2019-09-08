package kendi_practicelerim;

import java.util.Scanner;

public class replit_30 {
	public static void main(String[] args) {
		
		Scanner saat = new Scanner(System.in);
		
		int inputSeconds;
		int hours;
		int minutes;
		int seconds;
		
		System.out.println("Enter seconds:");
		
		
		inputSeconds = saat.nextInt();
		
		// (second/60)/60
		
		seconds = inputSeconds%60;
		minutes = inputSeconds/60%60;
		hours = inputSeconds/(60*60)%24;
		
		System.out.println(hours+":"+minutes+":"+seconds);
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
