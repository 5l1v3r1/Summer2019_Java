package day03_variables;


public class primitive_data_types {
	/*
	 byte: we can assign numbers that's no decimal (whole numbers). -128 <= byte <= 127
	
	 short: we can only assign whole number. must be within -32,768 <= short <= 32,767
	 
	 int: we can only assign whole number.
	 
	 long: "  "   "    "      "    "..... and at the end of value we can give l or L
	 
	 byte < short < int < long
	 small one can be assigned to larger one
	 
	 float: we can assign decimals to the float numbers (must have f or F letter at the end if its decimal number)
	
	 double (used more often): we can assign decimals.
	     
	     float < double
	 
	 
	 */
	
	public static void main(String[] args) {
		byte length = 3;
		System.out.println(length);
		
		byte width = 4;
		System.out.println(width);
		
		//byte 9num=100 variables names must start with a-z, A-Z
		byte num_and$ = 90;
		// byte length = 6; variable name is not unique
		
		// byte Public = 10; variable names cannot be java reserved words
		
		short num2 = 100;
		
		int num4 = -100000;
		// 100,000,000 olmaz(virgul koyamazsin)
		int num5 = 100_000_000; // easier to read, (just like  ,  in accounting
		
		long longnumber =10L; // L or l is valid at long. belongs to long only.
		int intnumber =10;
		
		byte bytenumber =10;
		short shortnumber = bytenumber;
		short shortnumber2 = 18;
		// byte bytenumber2 = shortnumber2; short is greater than byte (olmaz)
		
		// int exampleNum1 = 10.5;
		float examplenum2 = 10.5F;
		
		double doublenumber = 10.5;
		
		double doublenumber2 = 30.5;
		// float floatnumber = doublenumber; (olmaz) double is larger
		
		System.out.println("==============================");
		byte bNum = 10;
		short sNum = 20;
		int iNum = 30;
		long lNum = 40;
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println("==============================");
		
		float fNum = bNum;
		float fNum2 = sNum;
		float fNum3 = iNum;
		float fNum4 = lNum;
		
		System.out.println(fNum);
		System.out.println(fNum2);
		System.out.println(fNum3);
		System.out.println(fNum4);
				
		System.out.println("===============================");
		double dNum = bNum;
		double dNum2 = sNum;
		double dNum3 = iNum;
		double dNum4 = lNum;
		System.out.println(dNum);
		System.out.println(dNum2);
		System.out.println(dNum3);
		System.out.println(dNum4);
		
	
		
	}










}
