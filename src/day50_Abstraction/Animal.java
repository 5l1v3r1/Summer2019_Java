package day50_Abstraction;

public abstract class Animal {
	
	public char Gender;
	public byte Age;
	public String Color;
	public String Nickname;

	public Animal(char Gender, byte Age, String Color, String Nickname) {
		this.Age = Age;
		this.Color = Color;
		this.Gender = Gender;
		this.Nickname = Nickname;
	}
	
	public abstract void Speak(String blahblah);
	public abstract void Eat(String food);
	public abstract void Sleep(int hour);
	public abstract void Drink(String liquid);
	
	public void GetInfo() {
		System.out.println("Age is "+Age);
		System.out.println("Gender is "+Gender);
		System.out.println("Color is "+Color);
		System.out.println("NickName is "+Nickname);
		
	}
}
 