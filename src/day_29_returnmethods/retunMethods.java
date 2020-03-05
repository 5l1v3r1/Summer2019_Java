package day_29_returnmethods;

public class retunMethods {
	/*
	 return-type: void or other data-types (int, string..)
	 if the return type is void, the method does not return any value
	 if the return type is not void: the method must return a value
	 
	 return statement: it's used for exiting the method, 
	 we can also use return statement to return a value from the method
	 return method: 
	        1. does not have "void" as return type
	        2. must return a value
	        3. the returning value must match with the return-type of the method
	        4. the method body must be closed with return statement
	        
	  System.exit(0): java stops all the execution
	  
	  method overloading: feature it allows us to
	   have more than one method with same name
	  the methods must have different parameters
	  
	  why do we need overload method
	              1. make your code reusable
	              2. improves readability
	              
	              return type does not to be same
	   in java all the methods can be overloaded
	      
	 */

	public static void main(String[] args) {
		name(); // this is a String value
		System.out.println(name()); 
		String str = name();        
		System.out.println(str);
	}
	
	public static boolean result() {
	 return 8<9;
	 
	}
	
	public static String name() {
		
		
		return "batch12";
	}
	
	
	
	
	
}
