package day14_scanner;
import java.util.Scanner;
// everything in scanner class is imported
public class scannerclass {
	public static void main(String[] args) {
		
		/*
		 
		scanner : it's a class that provides the methods to get user inputs
	
		scanner class presents in the package "java.util" package
		
		in order to use scanner class, the scanner class MUST be imported: import java.util.Scanner;
		
		 the import statement must be placed between the package and the class name
		
		 import java.util.*;  ==> this imports all classes
		 import java.util.Scanner; ==> imports only
		 
		 declaration of scanner:
		 
		 Scanner VariableName = new Scanner(System.in);
		 
		 VariableName : can reference an object of the scanner class
		 
		 new Scanner(System.in) : creates the object of the scanner class
		 
		 
		 methods of scanner class:
		 
		 VariableName.nextByte():
		           allows user to enter Byte value
		 
		 
		 
		 */
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter a byte value 1");
		         byte bytenum = input.nextByte();
		         
		         System.out.println("you have entered:"+ bytenum);
		
		System.out.println("enter another byte value");
		 byte bytenum2 = input.nextByte();
		
		System.out.println("you have entered:"+ bytenum2);
		
		System.out.println("Addition is: "+(bytenum+bytenum2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
