package Assignments;
import java.util.Scanner;
public class new2 {
	public static void main(String[] args) {
		
		Scanner A =  new Scanner(System.in);
		System.out.println("Enter a unit price:");
		double price = A.nextDouble();
		System.out.println("Enter quantity: ");
		int quantity = A.nextInt();
		double total = price*quantity;
		System.out.println("Total = "+ total);
		
		
		
		  if ( quantity>=100 && quantity<=120 ) {
			
			double discount = total*0.90;
			System.out.println("10% discount: "+discount);
		}
		  else if( quantity > 120) {
			  double discount2 = total*0.85;
			  System.out.println( "15% discount: "+ discount2);
		  }
		  else {
			  System.out.println("no discount: "+total);
		  }
		
		
		
		
		
		
		
		
		
		
	}

}
