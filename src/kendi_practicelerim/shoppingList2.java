package kendi_practicelerim;

import java.util.Scanner;

public class shoppingList2 {
	public static void main(String[] args) {
		
	String item1, item2, item3, report;
	double price1, price2, price3, totalprice;
	int count1, count2, count3;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter item1, count and its price:");
	item1 = scan.nextLine();
	count1 = scan.nextInt();
	price1 = scan.nextDouble();
	
	scan.nextLine();
	System.out.println("Enter item2, count and its price:");
	
	item2 = scan.nextLine();
	count2 = scan.nextInt();
	price2 = scan.nextDouble();
	
	scan.nextLine();
    System.out.println("Enter item3, count and its price:");
	
	item3 = scan.nextLine();
	count3 = scan.nextInt();
	price3 = scan.nextDouble();	
		
		
		if(count1>0 && count2>0 && count3>0) {
			totalprice = (price1*count1)+(price2*count2)+(price3*count3);
			report = "Item1: "+item1+" Price: "+(price1*count1)+", Item2: "+item2+" Price: "+(price2*count2)+", Item3: "+item3+" Price: "+(price3*count3);
			System.out.println(report);
			System.out.println("Total price: "+totalprice);
		} 
		else if(count1>0 && count2>0 && count3<=0) {
			totalprice = (price1*count1)+(price2*count2);
			report =  "Item1: "+item1+" Price: "+(price1*count1)+", Item2: "+item2+" Price: "+(price2*count2);
			System.out.println(report);
			System.out.println("Total price: "+totalprice);
		}
		else if(count2>0 && count3>0 && count1<=0) {
			totalprice = (price2*count2)+(price3*count3);
			report = "Item2: "+item2+" Price: "+(price2*count2)+", Item3: "+item3+" Price: "+(price3*count3);
			System.out.println(report);
			System.out.println("Total price: "+totalprice);
		}
		else if(count1>0 && count3>0 && count2<=0) {
			totalprice = (price1*count1)+(price3*count3);
			report = "Item1: "+item1+" Price: "+(price1*count1)+", Item3: "+item3+" Price: "+(price3*count3);
			System.out.println(report);
			System.out.println("Total price: "+totalprice);
		}
		else if(count1>0 && count2<=0 && count3<=0) {
			totalprice = price1*count1;
			report = "Item1: "+item1+" Price: "+(price1*count1);
			System.out.println(report);
			System.out.println("Total price: "+totalprice);
		}
		else if(count2>0 && count2<=0 && count3<=0) {
			totalprice = price2*count2;
			report = "Item2: "+item2+" Price: "+(price2*count2);
			System.out.println(report);
			System.out.println("Total price: "+totalprice);
		}
		else if(count3>0 && count2<=0 && count1<=0) {
			totalprice = (price3*count3);
			report = "Item3: "+item3+" Price: "+(price3*count3);
			System.out.println(report);
			System.out.println("Total price: "+totalprice);
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
