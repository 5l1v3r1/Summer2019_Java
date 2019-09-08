package day10_ifSatement;

public class warmup {
	public static void main(String[] args) {
		
		// tsk 1
		
		int year = 2000; //leap
		boolean leapyear = year %4 == 0;
		
		if(leapyear) {
			System.out.println("year "+year+" is leap year");
		} else {
			System.out.println("year "+year+" is not a leap year");
		}
		
		
		
		// grade calculator
		
		int grade = 80;
		
		if( 60 <= grade && grade <= 100) {
			System.out.println("you passed");
		   
		    if(90<= grade && grade <= 100) {
		    	
		    	System.out.println(" with A");
		    	
		    	
		    } else if (80<= grade && grade < 90) {
		    	
		    	System.out.println(" with B");
		    	
		    } else if(70<= grade && grade < 80) {
		    	System.out.println(" with C");
		    } else {
		    	System.out.println(" with D");
		    }
			
			
		
		
		} else if( grade < 60) {
			System.out.println("you failed with F");
		}else {
			System.out.println("error");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
