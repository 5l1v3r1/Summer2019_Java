package day49_recap;

public abstract class Animal {
	
	public abstract void eat();
	public abstract void sleep();
	public static void main(String[] args) {
		
	}

}

// concrete
class Cat extends Animal{

	@Override
	public void eat() {
		
		System.out.println("cat eats rabbit");
		
	}

	@Override
	public void sleep() {
		
		System.out.println("cat sleeps 5 hours");
	}
}

class Fish extends Animal{

	@Override
	public void eat() {
		
		System.out.println("fish eats balik yemi");
	}

	@Override
	public void sleep() {
		
		System.out.println("fish sleeps 3-4 hours");
	}

}

class test {
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.eat();
		obj.sleep();
		
		Fish ob = new Fish();
		ob.eat();
		ob.sleep();
	}
}

