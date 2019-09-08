package kendi_practicelerim;

public class task1_if {
	public static void main(String[] args) {
		
		int grade = 100;
		boolean a = 90<= grade && grade <=100;
		boolean b = 80<=grade && grade<90;
		boolean c = 70<=grade && grade<80;
		boolean d = 60<=grade && grade<70;
		boolean validgrade = grade>=0 && grade <= 100 ;
		
		
		if(validgrade) {
			
			if(a) {
				System.out.println("you passed with A");
			}
			else if(b) {
				System.out.println("you passed with B");
			}
			else if(c) {
				System.out.println("you passed with C");
			}
			else if(d) {
				System.out.println("you passed with D");
			}
			else {
				System.out.println("you failed with F");
			}
			
			
			
		}else {
			System.out.println("invalid grade");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
