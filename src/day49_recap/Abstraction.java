package day49_recap;

public abstract class Abstraction {

	public abstract void startTheCar();
		
}

class Toyota extends Abstraction{
	
	@Override
	public void startTheCar() {
		System.out.println("hit the brake");
		System.out.println("push the start button");
		System.out.println("release the brake");
	}
	
	public static void main(String[] args) {
	//	Abstraction obj = new Abstraction();
	}
}


class Tesla extends Abstraction{
	// regular classes must implement the abstract methods from the abstract class
	@Override
	public void startTheCar() {
		System.out.println("voice control");
		System.out.println("drive");
	}
	
}