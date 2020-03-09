package Day_27_CustomMethods;

public class PracticeMethods {
	
	public static void main(String[] args) {
		
		
	/*	String str="abcabcbabc";
		String result ="";
		for(int i=0;i<str.length();i++) {
			if(!result.contains(""+str.charAt(i))) {
				result += ""+str.charAt(i);
			}
		}
		System.out.println(result);
		
		*/
	
		RemoveDuplicates("sssddaaa");
		
	}

	
	public static void RemoveDuplicates (String a) {
		
		
		String result ="";
		for(int i=0;i<a.length();i++) {
			if(!result.contains(""+a.charAt(i))) {
				result += ""+a.charAt(i);
			}
		}
		System.out.println(result);
		
	}
	
}
