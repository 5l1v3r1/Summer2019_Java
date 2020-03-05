package day20_javaRecap;

import java.util.Scanner;

public class warmup4 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int min = 9999999;
		
		for(int i = 1; i<=5; i++) {
		System.out.println("enter a number");
		int inputnum = scan.nextInt();
		if(inputnum<min) {
			min = inputnum;
		}
	}
		
		
		System.out.println("min num is "+min);
		
		
		
	}

}
