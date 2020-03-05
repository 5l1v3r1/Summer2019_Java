package Day_22;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		
		
		
		while(true) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("multiplication is: "+ (a*b));
		System.out.println("wanna continue?");
		         scan.nextLine();
		String answer = scan.nextLine();
		
		
		while(!answer.equalsIgnoreCase("yes")&&!answer.equalsIgnoreCase("no")) {
			
			System.out.println("re enter please. want to continue?");
			answer = scan.next();
		 }
		
		if(answer.equalsIgnoreCase("no")) {
			break;
		}

		}
	
		
	}

}
