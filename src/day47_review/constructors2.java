package day47_review;

class Mojojojo {
	
	public Mojojojo() {
		System.out.println("AAAF park");
	}
	
}

public class constructors2 extends Mojojojo {
	
	 public static void main(String[] args) {
		constructors2 obj = new constructors2();  // AAAF park printed, since you don't have to call the default constructor of super class.
		
	}
		
}
