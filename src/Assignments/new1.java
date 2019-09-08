package Assignments;
import java.util.Scanner;
public class new1 {
	public static void main(String[] args) {
		
		
		
		
		
		Scanner variableName = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int intnum = variableName.nextInt();
		String variable = "";
		
		variable = (intnum==1)? "One" : (intnum==2)? "Two" : (intnum==3)? "Three" : (intnum==4)? "Four" 
				: (intnum==5)? "Five" : (intnum==6)? "Six" : (intnum==7)? "Seven" : (intnum==8)? "Eight"
						: (intnum==9)? "Nine" : (intnum==0)? "Zero" : "invalid";
		
		System.out.println(variable);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
