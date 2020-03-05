package day46_SuperKeyword;

import day45_protected_default.ProtectedVariables;

class Data {
	public static int num1 = 10;
	protected static int num2 = 20;
	private static int num3 = 30;
	static int num4 = 40;
}


public class InheritanceReview extends Data{
	
	/*
	    public static int num1 = 10;
    	protected static int num2 = 20;
	    static int num4 = 40;
	 */
	
	public static void main(String[] args) {
		System.out.println(num1);
		System.out.println(num2);
	//	System.out.println(num3); no no no 
		System.out.println(num4);
		
		ProtectedVariables obj3 = new ProtectedVariables(); // day45's class
		
		System.out.println(obj3.namepublic); // works. only the public
		
		
		
		
	}
	

}
