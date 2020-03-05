package kendi_practicelerim;

public class dfgdfgdfgdfgdfg {
	public static void main(String[] args) {
		
		/*
		 Remove duplicated values
		 
		 "aaabbfffgghh" ==> "abfgh"
		 
		  and count how many times they appeared
		  
		  "a3b2f3g2h2"
		 
		 */
		
	  String str = "aaadddtttjjjhhklln";
		
		String removedup = "";
		
		for(int i=0; i < str.length(); i++) {
			if(!removedup.contains(str.substring(i,i+1))) {
				removedup += str.substring(i,i+1);
			}
		}
	System.out.println(removedup);
	
	
	String result = "";
	
	for(int a=0; a < removedup.length(); a++) {
		int count = 0;
		
		for(int i=0; i < str.length(); i++) {
			if(removedup.substring(a,a+1).equals(str.substring(i,i+1))) {
				count++;
			}
			
		}
		result += removedup.substring(a,a+1) + count;
	}
		System.out.println(result);
		
		
		//WOW YOU DID IT! claps
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
