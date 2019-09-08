package Day06_ArithmaticOperators;

public class ArithmaticOperators {


	// % : remainder, returns the remainder from the division
	
	
	
	public static void main(String[] args) {
		
		int a = 100;
		int b = a-400; //-300
		System.out.println(b);
		
		int c = a+b; // 100 + -300 = -200
		System.out.println(c);
		
		int x = 3 , y = 5 , z=x*y;
		System.out.println(z); //15
		
		double length = 100, width=10, area=length*width;
		System.out.println(area);
		System.out.println(3+5+4-2); //10
		
		        //double resultnum = 9/0;
				//System.out.println(resultnum);
		
		double number1 = 10/3f;
		//
		System.out.println(number1);
		
		int output = 12+6/3;
		
		
		// % : kalani gosterir bolmede
		/*
		  10/3 ==> 3 with remainder of 1
		  12/5 ==> 2 with remainder (12 - (5*2)) = 2
		  
		   		
		   		
		 */
		
		int result = 10%3; //1
		System.out.println(result);
		System.out.println(12%5); //2
		
		// first come first serve except vip: %, /, *
		
		
		
		
	}
	
	
}
