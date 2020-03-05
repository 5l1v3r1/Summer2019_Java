package day37_ClassAndObject;

     public        class CarObjects {
//access modifier	
	public static void main(String[] args) {
		
		  Car       car1    =  new      Car();
	// classname  objName    keyword   constructor
		
		   car1.Brand = "BMW";
		   car1.Color = "black";
		   car1.Mileage = 10;
		   car1.Model = "X6";
		   car1.Price = 700000.1;
		   car1.Year = 2019;
		   
		   System.out.println(car1.Brand);
		   System.out.println(car1.Color);
		   System.out.println(car1.Mileage);
		   System.out.println(car1.Model);
		   System.out.println(car1.Price);
		   System.out.println(car1.Year);
		   
		   
		   System.out.println("~~~~~~~~~~~");
		   
		   
		   Car car2 = new Car();
		   
		   car2.Brand = "Toyota";
		   car2.Color = "grey";
		   car2.Mileage = 50000;
		   car2.Model = "rav4";
		   car2.Price = 16000 ;
		   car2.Year = 2016;
		   
		   System.out.println(car2.Brand);
		   System.out.println(car2.Color);
		   System.out.println(car2.Mileage);
		   System.out.println(car2.Model);
		   System.out.println(car2.Price);
		   System.out.println(car2.Year);
		   
		   car1.drive(); //BMW is driven
		   car2.drive(); //Toyota is driven
		   
		   car1.start();
		   car2.start();
		   
		   car1.getInfo();
		   car2.getInfo();
		   
		   Car car3 = new Car();
			   
		   car3.getInfo(); // null, nothing in this object
		   
		   car3.Brand = "Peugeout";
		   car3.Model = "308";
		   car3.Color = "grey";
		   car3.Mileage = 10000;
		   car3.Price = 10000;
		   car3.Year = 2008;
		   
		   car3.getInfo();
		   
	}

}
