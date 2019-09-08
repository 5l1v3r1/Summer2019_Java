package day08_ShorthandOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		/*
		 && : and logic  true && true ==> true, if both of them true it will give true, if any of them is false then you will get false
		 || : or logic
		                     true || false ==>true
		                     true || true  ==>true
		                    false || false ==> false   if both conditions are false it will return false, otherwise it will return true
		 */
		
		
		boolean result = 9 == 0 && "muhtar"== "good";
		
	   //                false	      false  ==> false
		
		System.out.println(result);
		
		boolean r2 = 8>5 && 7==(8-2+1);
		//           true&&true ==>true
		System.out.println(r2);
		
		boolean r3 = !false != true && !false ==!(!true);
		//           true !=true && true == !false
		//               false   &&   true==> false
		System.out.println(r3); //false
		
		// || :
		
		boolean A = "monday" == "fun-day" || 6==6;
		           //        false       ||  true ==>true
		System.out.println(A);
		
		
		boolean B = true || false; // true
		System.out.println(B);
		
		boolean C = !(8>5) || !("today"!="friday");
		 //       not true || not    true          ==> false || false ==> false
		System.out.println(C);
		
		// || &&:
		
		boolean D = true && true || false ;
		//              true || false ==> true
		System.out.println(D);
		
		boolean E = !(7>5 && 6 !=5) && (9>5 || 10>4);
		//           ! true          &&   true
		//           false          &&  true
		System.out.println(E);
		
		
		
		boolean x = true, z = true;
		int y = 20;
		x = (y!=10)||(z=false);
		System.out.println(x);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
