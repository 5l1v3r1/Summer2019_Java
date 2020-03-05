package day42_OOP_encapsulation;

public class Test {
	public static void main(String[] args) {
	TestData obj = new TestData();
	// System.out.println(obj.name); --> data is private
	
	System.out.println(obj.getName()); // with using the getter method, we are able to print the object
	
	System.out.println(obj.getID());
	
	// modify
	
	 obj.setName("argumant name alalalala");
	 System.out.println(obj.getName()); // using the getter method that we created, to print the new set value.
	
	 obj.setID(89);
	 System.out.println(obj.getID());
	
	}
}
