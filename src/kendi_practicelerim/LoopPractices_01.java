package kendi_practicelerim;

public class LoopPractices_01 {
	
	public static void main(String[] args) {
		
		
		// sayilarin toplami:
		
		
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("Sum of numbers from 1 to 100: "+sum);

		
		
		
		int mult = 1;
		for(int i = 1; i<=10; i++) {
			mult *= i;
		}
		System.out.println("Multipling numbers from 1 to 10: "+mult);
		
		
		int a = 1;
		for(int i = 1; i<=15; i++) {
			if(i%2==0) {
				a *= i;
			}
		}
		System.out.println("Multipling even numbers from 1 to 15: "+a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
