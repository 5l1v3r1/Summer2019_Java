package day46_SuperKeyword;


class A {
	
	String name = "koko";
	
	public void methodA() {
		
	}
	
	public A (int a) {
		
	}
}



public class SuperKeyword extends A {
  //           sub              super
	
	public SuperKeyword(double a) {
		super(4); // super class constructor must be called in the sub class
	}
	
	/*
	   super. : used for calling instances (instance variables, and methods) from the super class
	     
	     super keyword can only be used in the sub class
	      
	      this. vs super. : (this.)used for calling the instances from the class itself. to use it we don't need inheritance
	       
	       (super.) used for calling the instances from the super class. we must have super class and sub class
	       
	        super() : used for calling the constructors from the super class. must be used in the sub class
	     
	         this() : used for calling the constructors from the class itself
            
              String name = "koko";	 
	 */

	public void method() {
		super.name = "lele";
		this.name = "jiji";
		super.methodA();
		this.methodA();
	}
	
	
	
	
}
