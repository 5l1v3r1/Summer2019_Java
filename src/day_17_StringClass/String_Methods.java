package day_17_StringClass;

public class String_Methods {
	public static void main(String[] args) {
		
		
		/*
		 trim() : it's used for removing the unused spaces
		 
		 */
		
		String s1 = "            hello";
		s1 = s1.trim();
		System.out.println(s1);
		
		String s2 = "lol            totoro";
		s2 = s2.trim();
		System.out.println(s2);
		
		String s3 = " n n n n n  ";
		s3 = s3.trim();
		System.out.println(s3);
		
		
		/*
		 substring(beginning index) : it creates sub value of the string from the beginning index till the last index
		                             and returns it as a NEW String value
		 */
		
		        String Str = "Cybertek School";
		        //            0123456789
		        
		        String Str2 = Str.substring(9); //School
		        System.out.println(Str2);
		        
		        Str = Str.substring(9); // School, same as other
		        
		        String address = "mclean VA 22000";
		        String zipcode = address.substring(10);
		        System.out.println("zip code is: "+zipcode);
		
		
		
		/*
		 substring( beginning index , ending index) : 
		            it creating the sub value of the String from the beginning index till the ending index
		            (ending index num will be excluded)
		            then returns it as a NEW String value
		 */
		
		
		String name = "hello cybertek school";
		//             0123456789......
		
		name = name.substring(6, 13+1); //cyberte
		
		System.out.println(name);
		
		String fullName = "cybertek school batch12";
		
		String middleName = fullName.substring(9, 15);
		
		System.out.println(middleName);
		
		
		/*
		 replace( old char, new char ) : replaces all 
		 
		 
		    
		 */
		
		
		
		
		
	}

}
