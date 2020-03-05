package day45_inheritance;


class Data {
	
	public String name;
	private String age;
	String ID;
	protected String DOB;
	
	public void hello() {
		System.out.println("hello");
	}
	
	private void anyong() {
		System.out.println("anyong");
	}
	
	void selam() {
	//	anyong();
		System.out.println("selam");
	}
}


public class MultiClassPractice {
	
	public static void main(String[] args) {
		Data obj = new Data();
		System.out.println(obj.name); // public is visible at everywhere
	//	System.out.println(obj.age);  // private is not visible outside the class
		System.out.println(obj.ID); 
		// if those two classes were located in two different packages then the default access modifier is not going to be visible
		
		obj.hello();
	//	obj.anyong(); 
		obj.selam();
		
		
	}

}
