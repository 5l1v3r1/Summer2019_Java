package kendi_practicelerim;

public class customclasscalisma {
	
	String name;
	long number;
	double balance;
	
	public customclasscalisma() {
		
	}
	
	public customclasscalisma(String name, long number, double balance) {
		
		this.name = name;
		this.number = number;
		this.balance = balance;
	}
	
	public void show() {
		String nm = ""+number;
		String num = "*********"+nm.substring(10);
		
		System.out.println("holder name: "+name+", account number: "+num+", balance: $"+balance);
	}
	
	public void ekle(double ekle) {
		
		double s = balance+=ekle;
		System.out.println(s+" yeni meblag");
		
	}
	
	

}
