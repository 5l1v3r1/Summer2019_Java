package day34_constructors;

public class Constructor {
	/*
	 
	regular methods: 
	           access-modifier specifier return-type methodname(parameter){
	           }
	           
	 constructor: it's a very special method
	 
	 declaration of constructor: 
	              access-modifier className (parameter){
	              }
	 every single class must have a constructor. if we did not give a costructor then the compiler will give the default(no-arg) constructor
	 
	 default of constructor: 
	                          access-modifier classname(){
	                          }
	 
	    constructor with argument:
	      access-modifier className(parameter)
	      
	 cons. calls: only a cons, can call another cons.
	 
	 create an object from a class:
	          className referenceName = new existingConstructor
	 
	 3 types of method:
	              1. void
	              2. return
	              3. constructor (special)
	 can be overloaded
	 
	 wanna have more than one constructor? then overload it, and give a different parameter.
	 
	 
	 
	 
	 
	 
	 */
	
	
	public Constructor() {
		System.out.println("default constructor");
	}
	
	public Constructor(String str) {
		System.out.println("i am a con. with an argument of string: "+ str);
	}

	public static void main(String[] args) {
		Constructor obj = new Constructor("muazzez");
		
	
		 
		  
		  
	}

}
