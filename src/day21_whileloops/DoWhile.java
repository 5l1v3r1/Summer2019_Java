package day21_whileloops;

public class DoWhile {
	public static void main(String[] args) {
		
		
		/*
		 
		 do - while: 
		    
		             do{
		                  statements;
		             
		             } while(condition);
		            
		         =>  Compiler executes the block first and then checks the condition,
		             if the condition is true then it keep executing, otherwise exits the loop.
		             
		         => do-while loop's body gets executed at least once, regardless of condition
		         
		         => while loop never gets executed if the condition is false.
		         => do-while gets executed once if the condition is false.
		         
		         do while loop ==> Just do it at least once
		 
		 */
		
		
		
		
		boolean A = false;
		while(A) {
			
			System.out.println("HELLOOOOOOOO");
			
		}
		
		
		do {
			System.out.println("Hello");
		} while(A);
		
		System.out.println("===================");
		
		/*
		
		 
	 int x = 1;
		while(x<=100) {
			if(x%2==0) {
				System.out.print(x+" ");
			}
		        x++;
		}
		 */
		
		
		int x = 1;
		do {
			if(x%2==0) {
				System.out.print(x+" ");
			}
			x++;
		} while(x <= 100);
		
		System.out.println("\n===================");
		
		
		do {
			System.out.println("hello world");
			break;
		}while(true);
		
		
		
	}

}
