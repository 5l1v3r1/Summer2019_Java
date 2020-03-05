package day32_recap;

public class overloadMethod {
	public static void main(String[] args) {
		sum(96, 7, 9);
		sum(3.7, 2, true);
		int total = sum(5, 4.3, 1);
		System.out.println(total);
	}

	public static void sum(int a, int b) {
		System.out.println("int sum is "+(a+b));
	}
	
	public static void sum(double a, double b) {
		System.out.println("double sum is "+(a+b));
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println("int sum is "+(a+b+c));
	}
	
	public static void sum(double a, long b, boolean c) {
		System.out.println("you have entered "+a+" "+b+" "+c);
	}
	
	public static int sum(int a, double b, int c) {
		int sum = a+(int)b+c;
		return sum ;
	}
	
}
