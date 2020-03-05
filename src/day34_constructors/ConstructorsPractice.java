package day34_constructors;

public class ConstructorsPractice {
	
	public ConstructorsPractice(int a) {
		System.out.println("hi  i am con with parameter of int: "+a);
	}
	
	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() {
		ConstructorsPractice obj = new ConstructorsPractice(44);
	}

}
