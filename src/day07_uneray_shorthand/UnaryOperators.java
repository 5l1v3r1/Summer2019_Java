package day07_uneray_shorthand;

public class UnaryOperators {

	public static void main(String[] args) {
		
		
		
		/*
		 
		 + ==> positive
		 - ==> negative
		 ++ ==> increment
		 -- ==> decrement
		 +- ==> -
		 -- ==> +
		 ++ ==> +
		 increment: increases the value by 1
		 increment are : 1-post increment and 2-pre increment
		 
		 pre increment: operator is placed before the variable;
		 int a = 100;
		 ++a;
		 system.out.println(++a);
		 
		 decrement: decreases the value by 1
		 
		 
		 
		 
		 
		 */
		
		
		int a = 10;
		int b = -a;
		System.out.println(b);
		
		int c = +b;
		System.out.println(c);
		
		int d = -c;
		System.out.println(d);
		
		int f = - (10);
		System.out.println(f);
		
		int num = 100;
		++num;
		System.out.println(num);
		
		// post increment: operator is placed after the variable.
		int intnum = 100;
		System.out.println(intnum++); //100
		System.out.println(intnum); //101
		
		int intnum2 = intnum ++ ; // intnum2 = 101
		System.out.println(intnum2);
		System.out.println(intnum); //102
		
		int x = 100;
		int y = x++ -1;
		// y = 100 - 1;
		System.out.println(y);
		
		
		//decrement: decreases the value by 1 
		         //pre-decrement: operator is placed before the variable
		                   //decreases the value by 1 immadiately
		
		
		int z = 100;
		-- z;
		System.out.println(z);
		
		System.out.println(-- z);
		
		// post-decrement: operator is placed after variable
		 // it will pass the current value, and then decrease
		

				int s = 95;
				 System.out.println(s--); //95
				 System.out.println(s);
				 
				 int t = 25;
				 System.out.println(++ t); //26
				 
				 System.out.println(-- t);
				 
				 
				 int k = 50;
				 k = --k + k++ + k-- + k++;
               //     pre   post post  post		
				//    49 + 49 +  50  + 49
				 System.out.println(k);
				 
				 
				 short snum = 4; //3
				 int r = snum * 4 - snum--;
			//                16  -   4 =12
				 System.out.println(r);
				 System.out.println(snum);
				 
				 
				 
				 
				 int w = 1; // 0 => 1 => 0 => -1
				 w = - w-- + w++ / -w-- * --w ;
			//         post  post  post   pre	 
		        //     -1  + 0  /  -1  *  -1
				 
				 System.out.println(w);
				 
		
		// 1 gallon = 3.785 liters
		
				 int gallon = 100;
				 double litters = gallon * 3.785;
				 System.out.println(gallon +" gallons equal to " + litters+ " litters ");
				 
				 // write a java program that converts litters to gallons
				 
				 double L = 1;
				 double G = L / 3.785;
				 System.out.println(L +" litters equal to "+ G + " gallons.");
				 
				 
		
		
	}
	
}
