package day41_initializerBlocks;

public class instanceBlock {
	
	
	{
		System.out.println("instance block");
	}
	
	public instanceBlock() {
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		
		instanceBlock obj = new instanceBlock();
		
		
	}
	
	

}
