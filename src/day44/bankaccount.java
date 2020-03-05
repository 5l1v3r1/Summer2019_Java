package day44;

public class bankaccount {
	
	private String AccountHolder;
	private long AccountNumber;
	private double AvailableBalance;

	// getters for every private data:
	     public String getAccountHolder() {
	    	 return AccountHolder;
	     }
	     
	     public long getAccountNumber() {
	    	 return AccountNumber;
	     }
	     
	     public double getAvailableBalance() {
	    	 return AvailableBalance;
	     }
	     
	     
    // setters to modify private data:
	     public void setAccountHolder(String AccountHolder) {
	    	 this.AccountHolder = AccountHolder;
	     }
	     
	     public void setAccountNumber(long AccountNumber) {
	    	 this.AccountNumber = AccountNumber;
	     }
	     
	// Actions:
	     // deposit
	     
	     public void deposit(double amount) {
	    	 AvailableBalance += amount;
	     }
	     
	    // withdraw
	     
	     public void withdraw(double amount) {
	    	 
	    	 if(AvailableBalance <= 0) {
	    		 System.out.println("your account balance is less or equal to 0");
	    		 return;
	    	 }
	    	 
	    	 if(amount>AvailableBalance) {
	    		 AvailableBalance -= 35;
	    	 }
	    	 
	    	 AvailableBalance -= amount;	    	 
	     }
	     
	    // checking balance
	     
	     public void ShowBalance() {
	    	 System.out.println("Available balance: $"+AvailableBalance);
	     }
	     
	     
}
