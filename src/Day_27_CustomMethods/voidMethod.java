package Day_27_CustomMethods;

public class voidMethod {
	
	/*
	  declaration of method:
	          access-modifier  specifier  return-type  method-name(){}
	 */

	public static void main(String[] args) {
		 myFirstMethod();
		 even1To100();
		 
		 /*
		  reusable benefit
		  */
		
	}
	public static void even1To100() {
		
		 for(int i = 0; i<=100;i++) {
			 if(i%2!=0) {
				 continue;
			 }
			 System.out.print(i+" ");
		 }
	}
	
	public static void myFirstMethod() {
			
		System.out.println("Hello World");
		System.out.println("Hello Cybertek");
		System.out.println("Hello Ana");
		
	
	}
		
}