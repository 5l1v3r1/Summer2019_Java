package day37_ClassAndObject;

public class Car {
	
	/*
	 car
   
    data/attribute
        model, Year, brand, color, price, milage,VIN....
    
    actions:
        start, driver, accelerate, stop, drift, brake, get ticket..
    
    car1 --> Audi Q7 2020, white,  100K, 10, 1232112112
        car1.start() ==>  Audi
    
    car2 --> Tesla ModelS 2025, red, 60K, 20, 231123123
        car2.start()  ==> Tesla

    object: instance of the class, created from the class
      class: where the objects came from, determines how the object should behave
	 */

	
	String Model;
	int    Year;
	String Color;
	double Price;
	long   Mileage;
	String Brand;
	
	
	public void drive() {
		System.out.println(Brand + " is driven");
	}
	
	
	public void start() {
		System.out.println(Brand + " is started");
	}
	
	// 2016 toyota rav4, grey, $16000 
	public void getInfo() {
		System.out.println(Year+" "+Brand+ " "+Model+", "+Color+", $"+Price);
	}
	
	
	
	
}
