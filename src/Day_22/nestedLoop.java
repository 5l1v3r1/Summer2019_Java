package Day_22;

public class nestedLoop {
	public static void main(String[] args) {
		
		
		/*
		 nested loop:
		 
		 loop inside loop
		 
		 for(5){
		         for(5){
		            "hello"
		         }
		     }    
		 
		 when do we use nested loop:
		  when we need to repeat some steps inside loops body
		 
		 
		 */
		
		/*
		 12345
		 12345
		 12345          5 times 5
		 12345
		 12345
		 */
		
		
		
	 for(int z = 0; z < 5; z++) {
		for(int i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		System.out.println();
		
	 }
		
		
	 
	 
	 System.out.println("===================");
		/*
		 
		 *****
		 *****
		 *****
		 *****
		 *****
		
		 */
		
		int z = 5;
	while(z >= 0) {
		
		int i = 1;
		while(i<=5) {
			System.out.print("*");
			i++;
		}
		System.out.println();
		
		z--;
	}
		
		
	
	System.out.println("====================");
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 *******
		 
		 */
		
		for(int s =1; s<= 7;s++) {
		for(int i = 1; i<=s;i++) {
		
			System.out.print("*");
		   }
		
		   System.out.println();
	
		}
		
		
		int A=1;
		while(A <= 7) {
			
			int B = 1;
			while(B <= A) {
				System.out.print(":) ^-^ ");
				B++;
			}
			
			System.out.println();
			
			A++;
			
		}	
		
	}

}
