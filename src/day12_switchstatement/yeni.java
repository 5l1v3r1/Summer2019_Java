package day12_switchstatement;

public class yeni {
	
	public static void main(String[] args) {
	
		
		/*
		 switch statement does the similar thing like else if satement does, multi branch if statement yani.
		 expression must be evaluate to a single value(character, digits or text)
		 therefore 4 datatypes are not accepted
		 
		 double a= 10L, 10D, 10D;
		 float a = 10F, 10f;
		 long a = 10L, 10, 10l;
		 boolean = true, false, 10>9
		 
		 
		 
		 
		 
		 switch(expression){
		 case casevale:
		         statements1
		         statements2
		         break;
		         
		      defult;
		      statement
		
		    brake: exiting switch st., closing statement
		    if there is no break in switch st. it continues
		 in switch statement, none of the blocks (cases, default) or statements(break) are mandatory.
		 
		 
		 
		*/
		
		int score = 3;
		if(score == 1) { //must give boolean expression
			System.out.println("1");
		}
		else if(score==2) {
			System.out.println("2");
		} else {
			System.out.println("invalid");
		}
		
		switch(score) { //must give an expression: data
		case 1:
			System.out.println("1");
		    break;
		case 2:
			System.out.println("2");
		    break;
		    
		default:
			System.out.println("invalid");
		    break;
		    
		}
		/*
		 caselerin ve defultun yerlerini degistirebiliyon.
		 case2
		 default
		 case1
		 seklinde olabilir
		 */
		
		String str = "java";
		
		switch(str) {
		default: //else
			System.out.println("invalid");
			break;
		case "c#":
			System.out.println("c# java programing language");
			break;
		case"python":
			System.out.println("python programming language");
		    break;
		}
		
	char grade = 'A';
	
	switch(grade) {
	
	default:
		System.out.println("failed");
	
	case 'B':
		System.out.println("passed with B");
		
	case 'C':
		System.out.println("passed with A");
	}
		
		
		int n = 5;
		
		switch(n) {
		
		case 7:
			System.out.println("monday");
			break;// case closed // exiting the switch statement after the case is executed
		
			default :
				System.out.println("invalid entry");
				break;
		    //System.out.println("helo"); olamaz. cause case is closed
			case 10-5:
				System.out.println("friday");
				break;
		
		
		
		}
		
		
		String days ="tuesday";
		
		switch(days) {
		case "monday":
			System.out.println("monday is funday");
			break;
			
		case "tuesday":
			System.out.println("tuesday is greatday");
			break;
		case "wednesday":
			System.out.println("wednesday is off");
			break;
			
			default:
				System.out.println("invalid");
				break;
		}
		
		
		
		long n1 = 10;
	//  switch (n1) { }
		

		char ch = 'a';
		switch(ch) { }
		
		
		
		
//  OR LOGIC: OR LOGIC: OR LOGIC: OR LOGIC: OR LOGIC: OR LOGIC: OR LOGIC: OR LOGIC: OR LOGIC: OR LOGIC:
		
		
		
		char grade1 = 'A';
		if(grade == 'A' || grade == 'B') {
			System.out.println("you passed");
			
		}else {
			System.out.println("you failed");
		}
		
		// there is no direct way of using or logic in switch.
		//we can use multiple
		
		switch (grade1) {
		
		case 'A':
		case 'B':
			System.out.println("passed");
			break;
			
			default:
				System.out.println("failed");
		
		}
		
		String US = "USA";
		if(US == "USA"|| US =="amerika" || US == "US" ) {
			System.out.println("amerikan");
		}
		else {
			System.out.println("nor amerik");
		}
		
		
		switch (US) {
		
		case "US":
		case"USA":
		case "amerikan":
			System.out.println("amerikan");
			break;
		
		       default:
				System.out.println("not amerik");
		        break;
		        
		        
		}
		
		
		
		
		
		
	}
	

}
