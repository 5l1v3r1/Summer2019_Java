package day38_CustomClassContinue;

public class BankAccount {
	
	/*
	 
	 WarmUp:
    create a custom class for BankAccount
    attributes/data that can have are: 
                    1. AccountHolder, 2. AccountNumber, 3. Balance
        Actions: deposit, withdraw, showBalance
        Requirements: 
            1. user should be able to deposit money into their account
            2. user should be able to withdraw money from their account
                    2.1 if the withdrawing account is greater than available balance, 35$ charge will be added
                    2.2 if the balance is less than 0, user should not be able to withdraw money
            3. user should be able to see their balance
	 
	 */

	
	String AccountHolder;
	long AccountNumber;
	double Balance;
	
	public BankAccount() {
		
	}
	
	public BankAccount(String name, long accountnum) {
		
		AccountHolder = name;
		AccountNumber = accountnum;
		
	}
	
	
	
	public void ShowBalance() {
		String acct = ""+ AccountNumber;
		String AccountNumber = "*************"+acct.substring(8,12); 
		System.out.println("Account Holder: "+AccountHolder);
		System.out.println("Account Number: "+AccountNumber);
		System.out.println("Available Balance: $"+ Balance);
	}
	
	public void Deposit(double amount) {
		String acct = ""+ AccountNumber;
		String AccountNumber = "*************"+acct.substring(8,12); 
		System.out.println("Depositing $"+amount+" to account "+AccountNumber);
		Balance += amount;
		System.out.println("New balance: $"+Balance);
		
	}
	
	public void withdraw(double amount) {
		
		if(Balance<=0) {
			System.out.println("No available balance");
			return; // exit the method
		}
		
		String acct = ""+ AccountNumber;
		String AccountNumber = "*************"+acct.substring(8,12);
		System.out.println("Withdrawal $"+amount+" from the account "+ AccountNumber);
		Balance -= amount;
		if(Balance < 0) {
			Balance -= 35;
		}
		System.out.println("New balance: $"+Balance);
		
	}
	
	public void accountsetup(String name, long accountnum) {
		
		AccountHolder = name;
		AccountNumber = accountnum;
		
		
	}
	
	
	
}
