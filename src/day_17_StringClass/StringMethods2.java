package day_17_StringClass;

public class StringMethods2 {
	public static void main(String[] args) {
		
		
		/*
		 replace( old char, new char ) : replaces all the old char values with the given 
		 new char value in the string and returns it as NEW String value
		 
		 
		    
		 */
		
		
		String str1 = "java is fun programming language";
		str1 = str1.replace('a', 'e'); // you can replace it with numbers or capital letters
		
		System.out.println(str1);
		
		
		
		/*
		 replace( old str, new str ) : replaces all the old string values with the given 
		 new string value in the string and returns it as NEW String value
		 
		 
		 */
		
		
		
		String str2 = "today is gonna be great day to learn java";
		str2 = str2.replace("today", "tomorrow");
		
		System.out.println(str2);
		 str2 = str2.replace("java", "");
		 System.out.println(str2);
				 
		
		 /*
		  replaceFirst( old str, new str ) : it replaces the first occured  old str with the 
		  new str in the String and returns it as a NEW STRING VALUE
		  */
		
		String s1 = "java is fun, java is good";
		//                              S G
		s1 = s1.replaceFirst("java", "python");
		System.out.println(s1);
		
		s1 = s1.replace("is good", "iS Good");
		System.out.println(s1);
		
		String s2 = "java is programming language, java is java";
		
		s2 = s2.replace("java is java", "java is popo");
		
		System.out.println(s2);
		
		
		
	}

}
