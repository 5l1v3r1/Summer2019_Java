package day_28_Recap;

public class warmup02 {
	
	public static void main(String[] args) {
		
		Calculate(10,2,"*");
		CalculateGrades(75);
		
	}
	
	public static void CalculateGrades(int score) {
		
		char grade = (score >= 90 && score <= 100)? 'A' :
			            (score >= 80 && score <= 89)? 'B' :
			        	   (score >= 70 && score <= 79)? 'C' :
			        		  (score >= 60 && score <= 69)? 'D' :
			        			 (score >= 0 && score <= 59)? 'F' : 'I';
		
		if(grade == 'I') {
			System.out.println("invalid score");
		}else {
			System.out.println(grade);
		}
		
	}
	
	public static void Calculate(int a, int b, String Op) {
		
		String result="";
		if(Op.equals("-")) {
			result += (a-b);
		}else if(Op.equals("+")) {
			result += (a+b);
		}else if(Op.equals("*")) {
			result += (a*b);
		}else if(Op.equals("/")) {
			result += (a/b);
		}else if(Op.equals("%")) {
			result += (a%b);
		}else {
			result = "invalid operator";
		}
		
		System.out.println(result);
	
	}
	
}
