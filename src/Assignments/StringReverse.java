package Assignments;

public class StringReverse {
	
	public static String StrReverse(String str) {
		
		String reverse="";
		
		for(int i = str.length()-1; i >= 0; i--) {
			reverse += str.toCharArray()[i];
		}
		return reverse;
		
	}
	
	public static void main(String[] args) {
		
		
		String a = StringReverse.StrReverse("abcd");
		System.out.println(a);
		
	}

}
