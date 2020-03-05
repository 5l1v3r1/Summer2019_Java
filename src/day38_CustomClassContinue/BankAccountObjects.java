package day38_CustomClassContinue;

public class BankAccountObjects {
	
	public static void main(String[] args) {
		
		
		BankAccount account1 = new BankAccount();
		
		account1.AccountHolder = "Muazzez Esra Alperen";
		account1.AccountNumber = 1234567890123L;
		account1.Balance = 100000;
		
		
		account1.ShowBalance();
		
		account1.Deposit(2000);
		
		account1.withdraw(300000);
		
		account1.withdraw(2);
		
		
		BankAccount account2 = new BankAccount();
		
		account2.accountsetup("esra", 2423435434599l);
		account2.ShowBalance();
				
		
		
		BankAccount account3 = new BankAccount("huseyin alperen", 1234567891234l);
		
		account3.ShowBalance();
		
		account3.Deposit(4000);
		
		
		
	}
	
	
}
