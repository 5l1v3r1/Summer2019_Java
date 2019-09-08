package day10_ifSatement;

public class warmup2 {
	public static void main(String[] args) {
		
		int grade = 105;
		boolean A = grade >= 90 && grade <= 100;
		boolean B = grade >= 80 && grade <= 89;
		boolean C = grade >= 70 && grade <= 79;
		boolean D = grade >= 60 && grade <= 69;
		boolean validgrade = grade>=0 && grade <= 100;
		
		
		
	if(validgrade) {	// 0<= grade <= 100
		if(A) {          // 100>= grade >=90
			System.out.println("A");
		}
		else if(B) {     // 90> grade >= 80
			System.out.println("B");
		}
		else if(C) { // 80> grade >= 70
			System.out.println("C");
		}
		else if(D) { // 70> grade >=60
			System.out.println("D");
			
		}
		else { // 0<= grade <60
			System.out.println("F");
		}
		
		
	} else { // grade < 0 || grade > 100
		System.out.println("invalid grade");
	}
		
		
		
		/*
		  
		   declare a int variable called age
		   declare a boolean variable "good person"
		   age >=18 => cigarette
		   age >= 21 => hookah
		   age>= 25 => alcohol
		   age < 18 => milk
		  
		  
		  
		 */
		
		
		int age = 22;
		boolean goodperson = false;
		
		if(age >= 18) {
			
			if(goodperson) {
				System.out.println("alcohol is bad for your health");
			} else { // goodperson=false, && age >= 18
				System.out.println("you can buy cigarette");
			    if(age >= 21) {
			    	System.out.println("you can buy hookah");
			    }
			      if(age >= 25) {
			    	  System.out.println("you can buy alcohol");
			      }
			}
			
			
		}else {  // age <18
			System.out.println("drink milk");
		}
		
		
		
		
		
		
		/* 1. write a program that can find the number of days in a month
		 (assume that feb has 28 days)
		 
		 int month =0~12;
		 
		  1    2    3    4     5   6    7    8    9    10   11   12
		 jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec
		 31   28    31   30  31   30    31   31   30   31  30    31
		 
		 
		 must use nested if
		 28 days : 2
		 30 days: 4, 6, 9, 11
		 31 days: 1, 3, 5, 7, 8, 10, 12
		
		  even number of 30 days: 4&6
		  odd number of 30 days: 9&11
		  
		  even number of 31 days: 8, 10, 12
		  odd number of 31 days: 1, 3, 5, 7
		
		 */
		
		
		
		
		int month = 5; 
		if(month >0 && month <13) {
			
			if(month == 1) {
				System.out.println("31");
			}
			else if( month == 2) {
				System.out.println("28");
				
			}
			else if(month == 3) {
				System.out.println("31");
			}
			else if(month == 4) {
				System.out.println("30");
			}
			else if(month==5) {
				System.out.println("31");
			}
			else if(month==6) {
				System.out.println("30");
			}
			else if(month==7) {
				System.out.println("31");
			}
			
			
			
			
			
			
			
		}
		else {
			System.out.println("invalid entry");
		}
			
		
		
		
		
		
		
		/*
		 
		  28 days : 2
		 30 days: 4, 6, 9, 11
		 31 days: 1, 3, 5, 7, 8, 10, 12
		
		leap year:
		29 days
		 
		 */
		
		int month2 = 6;
		int year = 2000;
		
    if (month2>0 && month2 <13){ //1~12
		if(month2==2) {
    	if(year%4 == 0) {       // condition for leap year
			 System.out.println("29 days");
		 }
		 else {      // condition for regular year
			 System.out.println("28 days");
		 }
    }
		else if(month2 == 4 || month2 ==6) { //4, 6
			System.out.println("30 days");
		}
		else if(month2==9|| month2 == 11) { //9, 11
			System.out.println("30 days");
		} else {
			System.out.println("31 days"); // 1 3 5 7 8 10 12
		}
		
		
    }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
