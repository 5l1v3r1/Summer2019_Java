package day10_ifSatement;

public class if_else_statement {
	public static void main(String[] args) {
		
		
		/*
		 if & else statement: 
		 
		                           if( condition ) {
		                                  //A
		 
		                           } else {
		                                //B
		                             
		                              
		                              }
		  
		 if the condition is true u will get A
		 if the condition is false u will get B
		 
		 
		 
		 multi-branch if statement: we use them when there are more than two posibilities
		 
		 
		 
		                                  if(condition){
		                                  //A
		                                  } else if (condition2){
		                                       //B
		                                   }else{
		                                          //C
		                                     }
		                                
		                                if condition1 is true ==> A
		                                if 2. true ==> B
		                                if 1 and 2 both false ==> C
		 
		 
		 
		 */
		
		
		if(9>=8) {
			System.out.println("9 is greater or equal to 8");
		}
		
		else {
			System.out.println("9 is less than 8");
		}
		// if 9 is not greater or equal to8, then 9 must be less than 8
		
		
		
		System.out.println("\n");
		
		
		if(false==!false) {
			System.out.println("if block");
		}
		
		else {
			System.out.println("else block");
		}
		
		
		/*
		 task01:
		 if score < 60 ==> failed
		 if score >= 60 but score < 90 ==> pass
		 if score >= 90 ==> passed with distinction
		 
		 
		 */
		
		System.out.println("\n");
		
		
		
		
		
		
		
		
		int score = 40;
		if( score >= 60) {
			System.out.println("passed");
		} else {
			System.out.println("failed");
		}
		
		
		
		
		
		
		
		
		
		/*
		 1. triangle: has three angles, and sum of angles 180
		 
		 2. declare three variables angle1, 2, 3
		 3. write a program to check if the triangle is valid or not
		 
		 */
		
		
		
		System.out.println("\n");
		
		
		
		
		
		
		
		
		int angle1 = 20, angle2 = 50, angle3 = 75;
		
		boolean valid = (angle1+angle2+angle3) == 180;
		
		if(valid) {
			System.out.println("it's a valid triangle");
		} else {
			System.out.println("invalid triangle");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
