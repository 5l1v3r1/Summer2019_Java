package day0_9;

public class if_statement {

	/*
	 if statement: 
	         single if statement:
	                  if(boolean expression){
	                      some codes to run
	                  }
	                        if block only gets executed if the condition is true
	 
	 
	 
	 
	 */
	
	
	
	
	
	public static void main(String[] args) {
		
		
		if(9<10) {
			System.out.println("hello");
			System.out.println("happy friday");
			System.out.println("tomorrow is day off");
			
		}
		
		int a = 1000;
		if(true) {
		// 1000 == 1001 ==>false
			a=2000;
			System.out.println("a is increased");
			
		}
		
		System.out.println(a);
		
		
		int x = 987654320;
		if (x%2 == 0) {
			System.out.println(x);
			System.out.println("it's an even number");
		}
		
		if(x%2 != 0) {
			// false
			System.out.println(x);
			System.out.println("it's a odd number");
		}
		
		
		int y = 2345678;
		if(y%5 == 0) {
			
			System.out.println(y+"can be divided by 5");
			
			
		}
		
		if(y%5 != 0) {
			
			System.out.println(y+ " can't be divided by 5");
			 
		}
		
		
		System.out.println("\n\n");
		
		
		String CEO= "main boss";
		String kuzzat = "main boss";
				System.out.println(CEO==kuzzat); //true
		if(kuzzat ==CEO) {
			
			System.out.println("great person in the world");
			System.out.println("first if block");
		}
		
		if(kuzzat != CEO) {
			
			System.out.println("great person in the world");
			System.out.println("second if block");
		}
		
		System.out.println("\n");
		
		
		double d = 100;
		boolean b = true;
		boolean c = true;
		
		if(b==c) {
			d+=500;
		}
		
		if (b!=c) {
			d-=50;
		}
		
		System.out.println(d);
		
		System.out.println("\n");
		
		/*
		 1. declare a variable, and initialize user age
		 2. write a program if the user is eligible to vote for donald trump
		 vote age: 18
		 
		 
		 */
		
		byte personAage = 78;
		byte voteAge = 18;
		
		if(personAage>=voteAge) {
			// true
			System.out.println("yes you are eligible to vote");
			System.out.println("have fun with building the wall");
			System.out.println("MAGA");
			
		}
		
		if (personAage<voteAge) {
			// false
			System.out.println("you are not eligible to vote yet, please grow up");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
