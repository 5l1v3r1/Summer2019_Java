package kendi_practicelerim;

import java.util.Scanner;

public class NestedLoopPractices_01 {
	public static void main(String[] args) {
		
		
		
		/*
		 write a program that number can divide with 3 to be shown as "FIN", number can divide with 5 to be shown as "RA",
		 and number that can divide both to be shown as "FINRA" from 1 to 50.
		 
		    OK, LET'S DO IT!
		 */
		
		
		String str = "";
		int a = 1;
		
		while(a<=50) {
			
			if(a%3 == 0 && a%5==0) {
				str += "FINRA ";
			}else if(a % 3== 0) {
				str += "FIN ";
			}else if(a%5 == 0) {
				str += "RA ";
			}else {
				str += a+ " ";
			}
			
			
			
			a++;
		}
		
		System.out.println(str);
		
		
		//
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
