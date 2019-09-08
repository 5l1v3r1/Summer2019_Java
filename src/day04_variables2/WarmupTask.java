package day04_variables2;

public class WarmupTask {

	/*
	1. cucumber = 2.5$ ==>float, double
	 2. tomato = 3$ ==>
	 3.onion = 1.5$ ==>float, double
	 4.green paper =2$
	  5. carrots = 4$
	 
	 */
	
	public static void main(String[] args) {
		// cucumber:
		// int cucumber = 2.5; we can only assign whole numbers to int, byte, short
		
		float cucumber = 2.5f; // float can not contain double, o yuzden f koyman lazim
		double cucumber2 = 2.5f;    // f koyabilirsin cunku kapsiyor double
		double cucumber3 = 2.5;
		
		// onion = 1.5
		float onion = 1.5f;
		double onion2 = 1.5;
		
		//green pepper: 2
		byte greenpepper = 2;
		short greenpepper2 = 2;
		int greenpepper3 = 2;
		long greenpepper4 = 2L;
		float greenpepper5 = 2; // if you are giving decimal you have to add "F,f" otherwise you may not add.
		double greenpepper6 = 2;
		
		System.out.println(greenpepper);
		System.out.println(greenpepper2);
		System.out.println(greenpepper3);
		System.out.println(greenpepper4);
		System.out.println(greenpepper5);
		System.out.println(greenpepper6);
				
		
		
	}
	
	
}
