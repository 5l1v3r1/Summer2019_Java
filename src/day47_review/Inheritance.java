package day47_review;

class A {
	public String name = "lolipop";
}

class B extends A {
//  public String name = "lolipop";
	public String name2 = "kraker";
	public String name3 = "kopoBka";
}

public class Inheritance extends B {
	
//  public String name = "lolipop";
//	public String name2 = "kraker";
//  public String name3 = "kopoBka";
	public String name4 = "ot";
	public String name5 = "et";
	
	public static void main(String[] args) {
		Inheritance obj = new Inheritance();
		System.out.println(obj.name);
		System.out.println(obj.name2);
		System.out.println(obj.name3);
		System.out.println(obj.name4);
		System.out.println(obj.name5);
		
		B obj2 = new B();
		System.out.println(obj2.name);
		System.out.println(obj2.name2);
		System.out.println(obj2.name3);
	//	System.out.println(obj2.name4);  those not exist in this B class
	//	System.out.println(obj2.name5);
		
	}
	
}
