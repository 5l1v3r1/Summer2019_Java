package day_29_returnmethods;

public class systemExit {
	public static void main(String[] args) {
		
		//System.out.println(number());
	    method1();
		System.out.println("Done");
		System.out.println("completed");
	}
	
	public static void method1() {
		
		System.out.println("hello world");
		System.exit(0);
	}
	
	public static int number() {
		if(true) {
			System.exit(0); // exits all the java execution
		}
		
		return 5;
	}

}
