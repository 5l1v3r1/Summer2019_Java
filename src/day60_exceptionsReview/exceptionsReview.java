package day60_exceptionsReview;

public class exceptionsReview {

	public static void main(String[] args) {
		
	//	throw new ClassCastException();  // unchecked, compiler is okay with it
		
    //	throw new FileNotFoundException();	// checked exception, compiler is not happy
		
		
	try {	
	//	FileInputStream file = new FileInputStream("path of file");  // checked. but it is not considered as a checked because it assumes the path is wrong and executes catch block 
	    Thread.sleep(2000);
		System.out.println("try block");
	}catch(InterruptedException e){
		System.out.println("catch block");
	} finally {
		System.out.println("finally is always get executed");
	}
	
	//  method();  // you can surround it with try catch to get rid of error. or use throws keyword with method signature
	    method2();
	    method7();
	    int breaktime = 0;
	    if (breaktime == 0) {
	    	throw new RuntimeException("time to go home");
	    }
	    System.out.println("done");
	    
	    
	
	}
	
	public static void method() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public static void method2() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
	}
	
	public static void method7() {
		throw new RuntimeException();
	}
}
