package day44;

import java.util.ArrayList;
import java.util.Arrays;

public class CyberBank {
	public static void main(String[] args) {
	
		bankaccount esmira = new bankaccount();
		
		esmira.setAccountHolder("Esmira Huseynova");
		esmira.setAccountNumber(1234567890954l);
		
		System.out.println("Name: "+esmira.getAccountHolder());
		System.out.println("Account Number: "+esmira.getAccountNumber());
		System.out.println("Available Balance: $"+esmira.getAvailableBalance());
		
		esmira.withdraw(1);
		esmira.deposit(100);
		esmira.ShowBalance();
		esmira.withdraw(101);
		esmira.ShowBalance();
		
		
		bankaccount lala = new bankaccount();
		
		lala.setAccountHolder("lala");
		lala.setAccountNumber(123123123l);
		
		lala.deposit(22);
		lala.ShowBalance();
		
	//	bankaccount[] accounts = {esmira, lala};
	
		ArrayList<bankaccount> Accounts = new ArrayList<>();
		Accounts.add(esmira);
		Accounts.add(lala);
	Accounts.addAll(Arrays.asList(esmira, lala)); // ya da boyle yap
	}
}
