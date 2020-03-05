package day35_Constructors;

public class Constructor {
	
	public Constructor() {
		System.out.println("default");
	}

	public Constructor(double d) {
		System.out.println("alalala");
	}
	
	public Constructor(boolean a) {
		
		this(100);
		System.out.println("sdgdyufgfrugeryg");
		
	}
	
	
	public static void main(String[] args) {
		Constructor obj = new Constructor();
		Constructor obj2 = new Constructor(true);
		
	}
	
	
	
	
}
