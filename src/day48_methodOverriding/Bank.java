package day48_methodOverriding;

public class Bank {    // Default class. InterestRate and main method in it.

	public Bank() {
		
	}
	
	public void InterestRate() {
		System.out.println("9 percent");
	}
	
	public static void main(String[] args) {
		BankOfAmerika BOA = new BankOfAmerika();
		    BOA.InterestRate();
		
		Chase ch = new Chase();
		    ch.InterestRate();
		
		CapitalOne CO = new CapitalOne();
		    CO.InterestRate();
	}
	
	
}

class BankOfAmerika extends Bank{
	
	public void InterestRate() {
		System.out.println("5%");
	}
}

class Chase extends Bank {
	@Override
	public void InterestRate() {
		System.out.println("6%");
	}
	
}

class CapitalOne extends Bank {
	
	public void InterestRate() {
		System.out.println("8%");
	}
}