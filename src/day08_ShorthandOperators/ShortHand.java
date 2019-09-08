package day08_ShorthandOperators;

public class ShortHand {

	/*
	 += : addition assignment
	 -= : subtraction assignment
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		
		int a = 9;
				// a= a+3; //12
				a+=3; //a  = a+3
		System.out.println(a);
		
		int b = a+=5;
		System.out.println(b);
		
		int c = a+=b;
		// 34
		System.out.println(c);
		
		int d = a+=c; //34 + 34
		System.out.println(d);
		
		int e = (d+=b) * 2;
		System.out.println(e);
		
		
		
		
	}
	
	
	
}
