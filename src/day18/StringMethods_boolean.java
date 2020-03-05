package day18;

public class StringMethods_boolean {
	public static void main(String[] args) {
		
		

		/*
		 isEmpty() : checks if the String is empty returns boolean expressions
		 
		 */
		
		String str = "Cybertek";
		    boolean r1 = str.isEmpty();
		System.out.println(r1);
		
		String str2 = "";
		if(str2.isEmpty()) {
			System.out.println("it's empty string");
		}
		else {
			System.out.println("it's not empty");
		}
		
		
		/*
		 equals(str) : checks if the two string' face values are equal or not, then returns a boolean expression
		 */
		
		
		String a1 = "Cybertek";
		String a2 = new String("Cybertek");
		System.out.println(a1 == a2); //false
		                                         // text must be same
		boolean r2 = a1.equals(a2);
		System.out.println(r2); // true
		
		
		System.out.println("java".equals("Java")); // false, because of case sensitivity
		
		
		/*
		  equalsIgnoreCase(str) : checks if the two string' face values are equal or not, then returns a boolean expression
		  case sensitivity does not matter
		  
		 */
		
		String s1 = "JAVA";
		String s2 = new String("java");
		
		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // false, case sensitive
		System.out.println(s1.equalsIgnoreCase(s2)); // true
		
		/*
		 contains(str) : checks if the str is contained in the String or not
		 then returns boolean expression
		 
		 contained ==> true             !contained ==> false
		 
		 */
		
		String name = "Muazzez";
		boolean r3 = name.contains("good guy"); // false
		System.out.println(r3);
		
		String name2 = "Esra";
		System.out.println(name2.contains("e")); //false, case sensitivity
		
		String name3 = "Alperen";
		System.out.println(name3.contains("A"));
		
		/*
		 startsWith(str) : checks if the  String started with str or not
		 then returns boolean expression
		 */
		
		
		String today = "Java";
		boolean r4 = today.startsWith("J"); //true
		System.out.println(r4);
		
		String names = "Cybertek School is great place to learn java";
		
		System.out.println(names.startsWith("Cybertek School")); // true
		
		
		/*
		 endsWith(str) : if the String is ended with the given str or not then returns a boolean expression
		 */
		
		String b1 = "Muazzez";
		System.out.println(b1.endsWith("z")); // true
		System.out.println(b1.endsWith("Z")); // false, case sensitive
		
		
		
		
		
		
	}

}
