package InterviewQuestions;
import java.util.Arrays;
import java.util.TreeSet;

public class String_SameLetters {
	/*
	 Write a return method that checks if a string is build out of the same letters as another string.

         Ex:  same("abc",  "cab"); -> true 

         same("abc",  "abb"); -> false:
	 */

	public static void main(String[] args) {
		
		System.out.println(sameletter("abc", "cab"));
	}
	
	public static boolean sameletter(String str1, String str2) {

		str1 = new TreeSet<String>(Arrays.asList( str1.split("") ) ).toString();

		str2 = new TreeSet<String>(Arrays.asList( str2.split("") ) ).toString( );

		return  str1.equals(str2);
			
	}
	
	
	
	
	
	
	
	
}
