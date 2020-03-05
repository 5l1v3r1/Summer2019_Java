package day41_initializerBlocks;

public class staticVSinsVScons {
	
	static {
		System.out.println("static block executed"); // static is not depend on object. istedigi gibi print olur
	}
	
	
	{
		System.out.println("instance block executed");
		//  instance block depends on object
	}
	
	public staticVSinsVScons() {
		System.out.println("Constructor executed");
		// depends object
	}
	

	public static void main(String[] args) {
		
		staticVSinsVScons obj = new staticVSinsVScons();
		
	}
	
	
}
