package kendi_practicelerim;

import java.util.*;

public class replit_022 {
	public static void main(String[] args) {
		
		
		
		
        String item1, item2, item3, report;
		
		double price1, price2, price3, totalPrice;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter item1 and its price:");
		
		item1 = scan.nextLine();
		price1 = scan.nextDouble();
		
		scan.nextLine();
        System.out.println("Enter item2 and its price:");
		 
		item2 = scan.nextLine();
	    price2 = scan.nextDouble();
		
		
	    scan.nextLine();
        System.out.println("Enter item3 and its price:");
		
		item3 = scan.nextLine();
		price3 = scan.nextDouble();
		
		
		totalPrice = price1+price2+price3;
		
		
		report = "Item1: "+item1+" Price: "+price1+", Item2: "+item2+" Price: "+price2+", Item3: "+item3+" Price: "+price3+"\n"+"Total price: "+totalPrice;
		
		System.out.println(report);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
