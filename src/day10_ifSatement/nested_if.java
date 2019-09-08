package day10_ifSatement;

public class nested_if {
	public static void main(String[] args) {
		
		
		/*
		 nested if: if condition can be evaluate to multiple scenarios
		 if multiple scenarios execution depends on a specific condition
		 if you have a requirement to check in the beginning
		     
		     if( condition1 ) {
		                //A
		             if ( condition2 ){
		                     //B
		           }
	  	     }
		 
		 A only execute, first one true second one false
		 
		 B only gets executed :
		              1. condition1 and condition2 has to be true
		              
		 
		 
		 */
		
		
		
		if(true) {
			System.out.println("bbb");
			
			if(false) {
				System.out.println("annyonghaseyo");
				
			} else {
				System.out.println("heheh");
			}
		
		
		
		
		}
		
		
		
		/*
		 60<= grade < 70 ==> D
		 70 <= grade < 80 ==>C
		 80 <= grade < 90 ==> B
		 90<= grade <= 100 ==> A
		      grade< 60 ==>F
		 */
		
		int grade = 80;
		if(grade >= 60) {
			System.out.println("passed");
			if ( grade >= 90 && grade <= 100) {
				System.out.println("\twith an A");
			}else if(grade >= 80 && grade <90) {
				System.out.println("\twith a grade B");
			}
			else if(grade >= 70 && grade <80) {
				System.out.println("\twith grade C");
			} else {
				System.out.println("\t with grade of D");
			}
			
			
			
			
			
		} else {
			System.out.println("you failed, your grade is: "+grade);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
