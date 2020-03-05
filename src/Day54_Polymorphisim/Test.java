package Day54_Polymorphisim;

abstract class abstractclass {
	
	public static void ByLinkText(int a) {
		System.out.println("Link Text super");
	}
	
	public void get() {
		System.out.println("chrome");
	}
	
}


public class Test extends abstractclass{
	
	public static void ByLinkText() {
		System.out.println("Link Text sub");
	}
	
	public void get() {
	System.out.println("firefox");	
	}
	

	public static void main(String[] args) {
		// abstractclass obj = new abstractclass();
		// we cannot create object from abstract class
		abstractclass obj2 = new Test(); // object can only be created from non-abstract classes 
		obj2.ByLinkText(7); // super gets executed since this method is not overridden
		obj2.get(); // firefox printed. because this method is overridden, so sub class gets executed
		
		Test obj3 = new Test();
		obj3.ByLinkText(9); // super
	}
	
}
