package Day_27_CustomMethods;

public class VoidMethod_WithArgument {
	
	/*
	 methods with argument:
	          
	          access-modifier  specifier  return-type name(parameter){}
	   parameter:any data type       
	          
	 */

	
	public static void main(String[] args) {
		
	//	OddOrEven();
		// method was designed to take an argument. in order to perform its task needs the argument
		
		//OddOrEven(8); 
		     // need to provide a value that can be assigned to the parameter of the method
		
		OddOrEven(50);
		
		int z = 100;
		OddOrEven(z); // variable z' value will be assigned to the parameter variable 
				
		SumOfTwoNums(4,8);
	
	}
	
	public static void SumOfTwoNums(int a, int b) {
		System.out.println("Sum of "+a+ " and "+b+" is: "+ (a+b) );
		
	}

	public static void OddOrEven(int a) {
			
	if(a % 2 == 0) {
		System.out.println(a + " is Even number");
	}else {
		System.out.println(a + " is Odd number");
	 }
		
		
	}
	
	
	
}
