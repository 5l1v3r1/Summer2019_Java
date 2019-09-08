package day15;

public class StringClass {
public static void main(String[] args) {
	
	/*
	 String class:
	          
	          1. String is an object
	                there are two ways to create object from
	                String class:
	                1- String literals
	                2- By using "new" keyword
	          2. String object represents the sequences of characters: == > "ABCDEFG"
	               each character in string has its own index number, index numbers starts from 0
	               String str = "cybertek"
	               index number: 01234567    
	          3. String is immutable:
	               once you declare it you can't modify it
	               
	 String methods:
	
	> charAt(indexnum): it takes the index num and returns it's character as a char
	 
	> length(): returns the total numbers of characters as an int value
	
	> concat(str): it takes a string and contacts it to the string variable, and then returns a new string value 
	 
	> toUpperCase(): converts to upper case
	
	> toLowerCase(): 
	
	==> When the object is created by string literals, 
	      that object will be saved at string pool 
	              (String pool does not take duplicates)
	              
	      when the String object is created by using "new" keyword the object will be saved at java heap memory,
	                       not within the String pool
	          
	 
	 */
	

	String str = "cybertek";
	String A = "cybertek";       // they are being saved one memory location
	String B = "cybertek";
	System.out.println(A == B);
	
	String str2 = new String("cybertek");
	System.out.println(str == str2); // false because different memory locations
	
	String str3 = new String("cybertek");
	System.out.println(str2 == str3); // false also new keyword is creates new memory location
	
	
	
	
	
}	
	
}
