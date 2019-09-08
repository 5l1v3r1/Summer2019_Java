package day08_ShorthandOperators;

public class RelationalOperators {
	
	/*
	 
	 relational operators: returns boolean expression
	 > : grater than
	 >= : greater than or equal
	 < : less than
	 <= : less than or equal
	 == :equal
	 != : not equal
	 
	 =: assign
	 
	 ! : exclamantion mark in java means the logical opposite
	 
	 
	 */
public static void main(String[] args) {
	
	System.out.println( 10>9 );
	boolean result = 10>9;
	System.out.println(result);
	
	System.out.println(10>=9); //greater OR equal, true
	
	boolean result1 = 10>=9;
			System.out.println(result1);
	
			boolean result2 = 10<=9;
			System.out.println(result2);
			
			boolean result3 = 19 == 19; //equal
			System.out.println(result3);
	
	boolean a = 20 != 20;
	System.out.println(a);
	
	boolean b = ! false;
	System.out.println(b);
	
	/*
	 in java true == true, false == false
	 !false equal to true, true equal to false
	 so therefore :
	 !false does not equal !true
	 */
	boolean c = !false != !true;
	System.out.println(c);
	
	boolean d = true == !false;
	System.out.println(d);
	
	boolean e = !(!true);
	System.out.println(e);
	
	System.out.println((int)(10.0/3));
	
	boolean f = 10>9 == 9<10;
	System.out.println(f);
	
	
	boolean r = false;
	System.out.println(!r); //opposite result 
	
	System.out.println(!true == false);
	
	boolean h = "batch12"=="batch13";
	System.out.println(h);
	
	System.out.println("batch12"=="Batch12");
	System.out.println("cybertek" != "club"); //true
	System.out.println("kuzzat"=="bad guy"); //false
	System.out.println("assistant teacher in class" != "awesome");
	
	int num = 198;
	System.out.println(num %= 2);
	
	byte p = 30;
	// int l = l += p; // we must give value to local variables
	
	String str1 = "result a" + 7 * 2;
	System.out.println(str1);
	
	String s4 = "result a" + 8 % 2;
	System.out.println(s4);
	
	
	
	// local variables must be initialized before use == !false :)
	
	
	
	
	
	
	
	
	
	
}
}
