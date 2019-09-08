package day14_scanner;

public class ternary {
	public static void main(String[] args) {
		
		int num = 0;
		
		/*if(true) {
			num = 100;
		} else {
			num = 50;
		}
		
		System.out.println(num);
		*/
		
		num = true? 100 : 50;
				System.out.println(num);
		
		
		
		/*
		 
		 if(condition)      ==> (condition)?
		 else               ==> :
		 else if(condition) ==> : (condition)?
		 
		 */
		
		int y = false? 100 : 50;
		
		
		
		String name = "";
		boolean b12 = true;
		
		if(b12) {
			name = "cybertek";
			
		}else {
			name = "invalid";
			
		}
		
		
		
		System.out.println(b12 ? "cybertek" : "invalid");
        String bestschool  = b12 ? "cybertek" : "invalid";
		System.out.println(bestschool);
		
		
		
		
		double d = 10;
		if(true) {
			d = 10.5;
		}
		
		
		double z = true ? 10.5 : 0;
		
		
		double interestrate = 0;
		boolean goodcredit = true;
		
	interestrate =	(goodcredit == true) ? 0.5 : 0.9;
		System.out.println(interestrate);
		
		
		byte grade = 60;
		 boolean passed = grade >= 60 ? true : false;
		 System.out.println(passed);
		 
		 
		
		char finalgrade = 'C';
		
		String group = "";
		
	group =	(finalgrade == 'A') ? "early bird" : (finalgrade == 'B')? 
			               "group 1" : (finalgrade == 'C') ? "group 2" : "yok";    
		
		System.out.println(group);
		
		
		int score = 80;
		char finals = ' ';
		
		if(score >= 90 && score <= 100)
			finals = 'A';
		else if(score >= 80 && score <= 89)
			finals = 'B';
		else if(score >= 70 && score <= 79)
			finals = 'C';
		else if(score >= 60 && score <= 69)
			finals = 'D';
		else if(score >= 0 && score <= 59)
			finals = 'F';
		else
			finals = ' ';
		
		
		finals = (score >= 90 && score <= 100)? 'A' 
			    	: (score >= 80 && score <= 89)? 'B'
				       : (score >= 70 && score <= 79)? 'C'
					    	:(score >= 60 && score <= 69)? 'D'
								:(score >= 0 && score <= 59)? 'F'
										: ' ';
		
		System.out.println(finals);
		
		
		int n1 = 100, n2 = 300, n3 = 400;
		
		int max = (n1 > n2 && n1 > n3)? n1
				: (n2 > n1 && n2 > n3)? n2
						:n3;
		System.out.println(max);
		
		
		
		
		
		
		
	}

}
