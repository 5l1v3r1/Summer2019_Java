package day21_whileloops;

import java.util.Scanner;

public class WhileLoops {
	public static void main(String[] args) {
		
		
		/*
		 while loop: 
		            
		             while(condition){
		                    statement;               "gets executed as long as the condition is true"
		             }
		 
		            - a repeating if statement -    
		          
		          * compiler first checks the condition of the while loop, if it's true executes the loop, otherwise stops executing.
		           
		         break: exits the switch statement and loop
		                forcefully exits the loop 
		                
		              ====> ANY FOR LOOP CAN ALWAYS BE CONVERTED TO WHILE LOOP <====
		              WHILE LOOP:
		                        Initialization;
		                        while(condition){
		                        statements;
		                        iterator
		                     }
		 */
		
		int a = 9;
		while(a > 8) {
			System.out.println("Hello");
		        a--;                      // a will become 8
		}
		 
		
		System.out.println("=============================");
		
		
		
		
		
		String sentence = "I like book, I read book";
		int count = 0;
		while(sentence.contains("book")) {
			count++;
			sentence = sentence.replaceFirst("book", "");
		}
		System.out.println(count);
		System.out.println(sentence);
		
		
		
		System.out.println("=============================");
		
		
		
		while(true) {
			
			System.out.println("annyong");
			break;  //forcefully exits the loop
		}
		
		
		System.out.println("=============================");
		
		
		
		int i = 0;
		while(true) {
			
			i++;
			System.out.println("hello "+i);
			if(i == 5) {
				break;
			}
		}
		
		System.out.println("=============================");
		
		
		/*
		 use while loop to print all even numbers between 1-100
		 
		 */
		
		
		for(int z = 1; z<=100;z++) {
			if(z%2 == 0) {
				System.out.print(z+ " ");
			}
		}
		
		System.out.println("\n=============================");
		
		int x = 1;
		while(x<=100) {
			if(x%2==0) {
				System.out.print(x+" ");
			}
		        x++;
		}
			
		System.out.println("\n=============================");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Starting number");
		int start = scan.nextInt();
		
		System.out.println("ending number");
		int end = scan.nextInt();
		
	/*	for(int s = start; s <= end; s++) {
			if(s%2==0) {
				System.out.print(s+" ");
			}
		}
		*/
		
		System.out.println("\n=============================");

		int s = start;
		while(s <= end) {
			if(s%2==0) {
				System.out.print(s+" ");
				
			}
               s++;
		}
		
		
	}

}
