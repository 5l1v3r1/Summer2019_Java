package day39_JavaReview;

public class CellPhone {
	
	String brand ;
	double price;
	String color;
	double screensize;
	String model;
	
	
	
	public CellPhone() {
		brand = "samsung";
		model = "note 9";
		screensize = 5.8;
		color = "navy";
		price = 685;
	}
	
	public CellPhone(String brand, double price, String color, double screensize, String model) {
		
		this.brand = brand;
		this.color = color;
		this.model = model;
		this.price = price;
		this.screensize = screensize;
	}
	
	
	
	public void call(long phonenumber) {
		System.out.println(brand+" "+model+" is calling ..");
	}
	
	public void Sendmessage(long phonenumber) {
		System.out.println("sending messages to "+phonenumber);
		
	}
	
	public void getInfo() {
		System.out.println(brand+" "+model+" "+color+" "+screensize+" $"+price);
	}
	
	
	
	
	

}
