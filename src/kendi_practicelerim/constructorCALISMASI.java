package kendi_practicelerim;

public class constructorCALISMASI {
	
	public constructorCALISMASI () {
		
		System.out.println("selam");
	}

	public constructorCALISMASI (String str) {
		this(6.5);
		System.out.println("Double");
	}
	
	public constructorCALISMASI (boolean a) {
		this("ben stringi call yapiyom");
		System.out.println("String " + a);
	}
	
	public constructorCALISMASI (Double d) {
		System.out.println("ben dobulum");
		
	}
	
	public static void main(String[] args) {
		constructorCALISMASI b = new constructorCALISMASI(true);
	}
	
}
