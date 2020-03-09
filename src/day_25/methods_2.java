package day_25;

import java.util.Arrays;

public class methods_2 {
	public static void main(String[] args) {
		
		
		
		
		String email = "firstname_lastname";
		         String[] arr = email.split("_");
		
		System.out.println(Arrays.toString(arr));
		
		
		String fullname = "cybertek school batch12";
		
		String[] a = fullname.split(" ");
		
		System.out.println(Arrays.toString(a));
		
		
		String emailAddress = "cybertek_school_batch12@gmail.com";
		
		String fulname = emailAddress.substring(0, emailAddress.indexOf("@"));
		System.out.println(fulname);
	            String[] allnames = fulname.split("_");
		
	            System.out.println("first name is: "+allnames[0]);
		
		
		
		
		
		/*
		 toCharArray(): returns the char array from the string 
		 */
		
	            String Str ="Java";
	           char[] ch = Str.toCharArray();
	            System.out.println(Arrays.toString(ch)); //   [J, a, v, a]
		
		/*
		 multi-dimensional arrays:
		  
		  n dimensional array contains(n-1) dimensional array
		 
		 */
			
	}

}
