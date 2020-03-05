package day19;

public class forLoop {
	public static void main(String[] args) {
		
		/*
		 loop: used for repeat 
		  for( initialization; condition; iterator ){
		                 statements that we wanna repeat
		  }
		  
		  statements within loops body is repeated untill condition becomes false
		  
		  
		  initialization: usually the times of the number that we wanna execute the loop
		               int i = 0;
		  
		  condition: is created based on the initialization
		  ex:
		      i < 10 
		      
		  iterator: co-realted to the condition, runs long enough and
		  either increases or decreases the value of initialization, then
		  eventually condition becomes false
		  
		                 i++ , i++ , i+2
		                 
		  ITERATOR IS NOT MANDATORY 
		  
		 */
		
		for( int i = 10; i > 0; i--) {  //pre or post increment DNM
			System.out.println("Value of i is: "+i);
			System.out.println("hello world "+i);
		}
		
		System.out.println("=============================");
		/*
		 task01:
		 */
		 
		for(int i = 1; i <= 10; i++) {
			
			System.out.println("square of "+i+" is: "+(i*i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
