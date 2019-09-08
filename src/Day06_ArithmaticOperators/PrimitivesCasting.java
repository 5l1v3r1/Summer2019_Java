package Day06_ArithmaticOperators;

public class PrimitivesCasting {
	
	/*
	 casting: converting the larger primitive to smaller size
	             datatype variablename = (datatype) value
	               
	               castings: explicit & implicit
	               
	               explicit: is used when we are converting from larger type to smaller type
	               implicit: automatic casting from smaller primitive type into larger primitive type.
	               ex: byte a = 10;
	               int b = a; automatically casts
	               
	               int c = (int) a; (int) will also work
	 
	 primitives: byte, short, int, long, float, double
	 
	 local variables: variables are declared within the method
	 
	 LOCAL VARIABLES MUST BE INITIALIZED
	 
	 */

	public static void main(String[] args) {
// explicit casting	
		
		int a = 128;
		byte b = (byte) a; //explicit casting
		System.out.println(b);
		
		double c = 10.5;
		float d = (int) c; //double > float
		System.out.println(d);
		
		long l = 300L;
		int i = (short) l;
		System.out.println(i);
		
		
		
// implicit casting	
	
		byte e = 100;
	    int f = e;
	
	    //same with:
    	int g = (int) e;
	
	
	    short s = 100;
	    long v = s;
		
	    //same with:
	    long z = (long)s;
	    
	    
	    
// explicit casting practices
	    
	    double largestnumber = 100.8765;
	    
	    byte bytevalue = (byte) largestnumber; //100
	    
	    float floatvalue = (byte) largestnumber;
		
	    System.out.println(floatvalue); //100.0
	    System.out.println(bytevalue);
		
		float floatnumber = 500.67F;
		int mynumber = (short) floatnumber;
	    //                      500 
		System.out.println(mynumber);
		
		
	/*
	 	int num1 = 100;
		int num2 = 200;
		int num3 = 300;
		*/
		
		int num1=100 , num2=200 , num3=300;
		
		boolean result;
		//System.out.println(result);
		
		char char1;
		//System.out.println(char1);
		
		boolean result1 , 
		        result2 , 
		        result3;
		
		
		
		//System.out.println(result1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
