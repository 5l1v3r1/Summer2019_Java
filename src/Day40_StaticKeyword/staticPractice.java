package Day40_StaticKeyword;

public class staticPractice {

	static long num1;
	       long num2;
	
	public static void main(String[] args) {
		
		System.out.println(num1); // directly call it, not problem
		System.out.println(staticPractice.num1);
		System.out.println();
		
		staticPractice.method1();
	//	staticPractice.method2(); static class it does not support non static
		
		staticPractice obj = new staticPractice();
		    obj.method2(); // now it is ok
		    
		
	}
	
	public static void method1() {
		System.out.println("A");
	}
	
	public void method2() {
		System.out.println("B");
	}
	
}
