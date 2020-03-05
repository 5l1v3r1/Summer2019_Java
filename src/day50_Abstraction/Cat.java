package day50_Abstraction;

public class Cat extends Animal {

	public Cat(char Gender, byte Age, String Color, String Nickname) {
		super(Gender, Age, Color, Nickname);
		
	}

	@Override
	public void Speak(String blahblah) {
		
		System.out.println(Nickname+" speaks "+blahblah);
	}

	@Override
	public void Eat(String food) {
		
		System.out.println(Nickname+" eats "+food);
	}

	@Override
	public void Sleep(int hour) {
		System.out.println(Nickname+" sleeps "+hour);
		
	}

	@Override
	public void Drink(String liquid) {
		
		System.out.println(Nickname+" drinks "+liquid);
	}
	
	

}
