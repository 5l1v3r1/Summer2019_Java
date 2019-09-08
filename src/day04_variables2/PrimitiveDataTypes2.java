package day04_variables2;

public class PrimitiveDataTypes2 {
	
	/*
	 Primitives: byte, short, int, long, float, double, boolean, char
	 
	 boolean: takes all boolean expressions (true or false) and returns either true or false. anything that can return either true or false can be initalized to boolean.
	 
	 char: declare within the single quote ''; single character only
	 
	 */
	public static void main(String[] args) {
		 
		
		// boolean result = earth is flat;
		// boolean num1 = 100; boolean only takes true or false results
		
		
		boolean result = true;
		boolean result2 = false;
		boolean result3 = 9 > 3;
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		//char
		char char1 = 'a';
		System.out.println(char1);
		//char with numbers
		char char4 = 67; // only time we use '' for char is when declaring SINGLE character
		System.out.println(char4);
		
		char char5 = 'C'; //prints character as it is
		System.out.println(char5);
	
		char char6  = '{';
		char char7 = 123;
		System.out.println(char6);
		System.out.println(char7);
		
		
	//initializing char to other primitives: byte, short, int, long, float, double
		char mychar1 = 'b';
		
		int myint = mychar1; // the number that represents b is initialized to the int
		
		System.out.println(myint); //98
		
		// byte mybyte = mychar1; //chart takes 2 bytes of memory, but byte takes only 1 byte. 
		byte mybyte2 = 'b'; //b's corresponding number is 98
		System.out.println(mybyte2);
		
		//short shortnum = mychar1; // char' memory is could be bigger than short. range is great
		short shortnum2 = 'b'; // b's corresponding number is 98 from ASCII table
		System.out.println(shortnum2);
		
		long longnum = mychar1; //long's memory is 8 bytes
		long longnum2 = 'b'; //98
		System.out.println(longnum);
		
		float floatnum = mychar1;
		float floatnum2 = 'b';
		System.out.println(floatnum2); //98.0
		double doublenum = mychar1;
		double doublenum2 = 'b';
		System.out.println(doublenum2); //98.0
		
		char mycharvalue = 3600;
		System.out.println(mycharvalue);
		
	
		
		
	}

}
