package day50_Abstraction;

public class Zoo {
	
	public static void main(String[] args) {
		Cat obj = new Cat('F', (byte)2, "black", "totoro");
//		System.out.println("Name is "+obj.Nickname);
//		System.out.println("gender is "+obj.Gender);
//		System.out.println("color is "+obj.Color);
//		System.out.println("age is "+obj.Age);
				
		obj.GetInfo();
		
		System.out.println("=========================");
		
		Cat obj2 = new Cat('M', (byte)3, "beyaz", "mojojojo");
		obj2.GetInfo();
		obj2.Eat("et");
		obj2.Drink("water");
		obj2.Sleep(5);
		obj2.Speak("meow");
		
	}

}
