package day33;

public class MethodCalls {
	
	public static void main(String[] args) {
	method3();	
		maximum(8,9,5);
	}
	
	public static void method1() {
		System.out.println("a");
	}

	public static void method2() {
		method1(); // a
		System.out.println("b"); // b
	}
	
	public static void method3() {
		method2(); // a b
		System.out.println("c"); // c
	}
	
	public static int max(int a, int b) {
		return (a>b)? a : b;
	}
	
	public static int max(int a, int b, int c) {
//	int largestNum = max(a, b); ==> bu da olabilir
	
	       return( max(a, b) > c)? max(a, b) : c ;
	}
	
	public static void maximum(int a, int b, int c) {
		System.out.println(max(a,b,c));
	}
	
}
