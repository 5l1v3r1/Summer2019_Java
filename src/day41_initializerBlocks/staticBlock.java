package day41_initializerBlocks;

public class staticBlock {
	/*
	  we can have multiple static blocks in java, first come first serve
	 */
	
	public staticBlock(){
		System.out.println("this is constructor");
	}
	
	public static void main(String[] args) {
		
		staticBlock obj1 = new staticBlock();
		staticBlock obj2 = new staticBlock();
		
		System.out.println("main method");	
		
		}
	
	static {
		System.out.println("static block");
	}
	
	static {
		System.out.println("2. static block");
	}
	

}
