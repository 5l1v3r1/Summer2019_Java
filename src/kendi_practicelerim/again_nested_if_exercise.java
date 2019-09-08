package kendi_practicelerim;

public class again_nested_if_exercise {
	public static void main(String[] args) {
		
		
		/* 
		 
		  1    2    3    4     5   6    7    8    9    10   11   12
		 jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec
		 31   28    31   30  31   30    31   31   30   31  30    31
		
		*/
		
		int month = 8;
		int year = 2002;
		
		if(0<month&&month<13) {
			
			
			if(month==2) {
				
				if(year%4==0) {
					System.out.println("29 days");
				}else {
					System.out.println("28 days");
				}
				
			}
			
			else if(month==4||month==6) {
				System.out.println("30 days");
			}
			
			else if(month==9||month==11) {
				System.out.println("30 days");
				
			}
			else {
				System.out.println("31 days");
			}
			
			
		
		}else {
			System.out.println("invalid input");
		}
		
		
		
		
		
		
	}

}
