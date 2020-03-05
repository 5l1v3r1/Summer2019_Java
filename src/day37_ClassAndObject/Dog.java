package day37_ClassAndObject;

public class Dog {
	
	/*
	 Dog
    Attributes/data:
            breed, size, age, color, name ...
    actions:
        eat, sleep, bark, play ...
    Dog1 --> German Shepard, XXL, 5, pink, Lassie
        Dog1.eat() ==>   Lassie
    Dog2 --> Tibetan mastiff, small, 3, red, KIKO
        Dog2.eat() ==> KIKO
	 */
	
	
	String Breed;
	String Size;
	byte   Age;
	String Color;
	String Name;
	char   Gender;
	String Food;
	
	
	public void getInfo() {
		System.out.println(Breed+", "+Size+", "+Age+", "+Color+", "+Name+", "+Gender);
	}
	
	public void eat() {
		System.out.println(Name+" is eating "+Food);
	}
	
	

}
