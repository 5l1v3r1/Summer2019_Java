package day30_WrapperClass_ArrayList;

public class WrapperMethods {
	
	/*
	 Max_Value
	 Min_Value
	 parse methods
	 ValueOf methods
	 
	 */
	
	
	public static void main(String[] args) {
		
		//Max_Value: returns the max value of the primitive
		
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		
		double maxD = Double.MAX_VALUE;
		System.out.println(maxD);
		
		byte maxB = Byte.MAX_VALUE;
		System.out.println(maxB);
		
		char maxC = Character.MAX_VALUE;
		System.out.println(maxC);
		
		//Min_Value: it returns the min value of the primitive
		
		int i = Integer.MIN_VALUE;
		System.out.println(i);
		
		double d = Double.MIN_VALUE;
		System.out.println(d);
		
		byte b = Byte.MIN_VALUE;
		System.out.println(b);
		
		char c = Character.MIN_VALUE;
		System.out.println(c);
		
		// parse methods: converting a string value to primitives
		String str = "123";
		      // parseInt("strValue"): takes the string and converts the string to int
		
		Integer a = Integer.parseInt("123"); //auto-boxing
		System.out.println(a+1);
		
		int num2 = Integer.parseInt("125"); //none
		System.out.println(num2);
		
		//parseByte("strValue"):  takes the string and converts the string to byte
	    int num3 = Byte.parseByte("19"); //auto-boxing
		System.out.println(num3+4561);
		
		//parseboolean("strValue"): converting a string value to boolean primitives
		boolean A = Boolean.parseBoolean("cybertek"); // false
		System.out.println(A); // any string values other than true, will return false, and ignores case sensitivity
		//======================================
		int ad =10;
		double df = ad;
	//	Double fg = ad; //Double wrapper class is only dedicated to double primitive
		int a1 = Byte.parseByte("19");
		Integer a2 =(int) Byte.parseByte("19"); // you must cast it
		
		
		
		// ValueOf methods: converts String value to wrapper class values
		
		   int z = Integer.valueOf("123");
		     System.out.println(z); // unboxing
		     Integer z1 = Integer.valueOf("1234"); // none
		     Integer z2 = (int)Integer.valueOf("5345"); // auto-boxing
		     System.out.println(z2);
		     
		
	}
	
	
	
	
	
	

}
