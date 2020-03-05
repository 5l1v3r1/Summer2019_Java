package Day40_StaticKeyword;

public class StaticKeyword {
	
	/*
	 static: means that we can access the members through the class name
	 
	    static members belongs to the class, also called class members
	    
	 what can be static in java: 
	               1. static variables (class, global)
	               2. static methods
	               3. static initializer block
	               4. static inner class (nested class)
	               
	 instance variables: created in the class and outside any methods, belongs to the object. each object will have its own copy
	 
	 local variables: declared within the methods or blocks
	 
	 static variables: created in the class outside any method with static keyword
	 
	             when a variable is static, it's shared by class and all objects of the class, and we can call it through the class name
	 
	 static methods: a method that we can call through the class name
	 
	      
	 
	 
	 */
    
	
	
	
	int a;
	static int b ;
	
	public static void main(String[] args) {
		StaticKeyword obj = new StaticKeyword();
		   obj.a = 100;
		
		   
		   StaticKeyword obj2 = new StaticKeyword();
		     obj2.a = 200;
		   
		   System.out.println(obj.a + obj2.a);
		   
		   System.out.println(StaticKeyword.b);
		   System.out.println(obj.b);
		   System.out.println(obj2.b);
		   
		   System.out.println("==============");
		   
		   StaticKeyword obj3 = new StaticKeyword();
		              obj3.a = 100;
		              System.out.println(obj3.a);
		              
		              StaticKeyword obj4 = new StaticKeyword();
		              System.out.println(obj4.a);
		              
		              
		   obj3.b = 400;
		   System.out.println(obj3.b); // 400
		   
		   System.out.println(obj4.b);
		   
		              
	}
	
	
	
	
	
	
	
	
	
	
}
