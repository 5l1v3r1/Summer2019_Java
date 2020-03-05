package day37_ClassAndObject;

public class DogObjects {
	public static void main(String[] args) {
		
		
	Dog dog1 = new Dog();
	
	dog1.Age = 5;
	dog1.Breed = "golden";
	dog1.Color = "gold";
	dog1.Gender = 'F';
	dog1.Name = "totoro";
	dog1.Size = "medium";
	dog1.Food = "corba";
	
	dog1.getInfo();
	dog1.eat();	
	
	System.out.println("======================================");
	
    Dog dog2 = new Dog();
	
	dog2.Age = 6;
	dog2.Breed = "pitbull";
	dog2.Color = "dark";
	dog2.Gender = 'M';
	dog2.Name = "mocococo";
	dog2.Size = "medium";
	dog2.Food = "pilav";
	
	dog2.getInfo();
	dog2.eat();
		
		
		
		
		
		
	}

}
