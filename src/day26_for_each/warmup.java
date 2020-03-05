package day26_for_each;

import java.util.Arrays;

public class warmup {
	public static void main(String[] args) {
		
		// remove duplicates
		String a = "aabbbc", b= "cabccaabbbaa";
		
		String a1 = ""; //storage
		
		
		for(int j = 0; j < a.length(); j++) {
	    	for(int i = 0; i < a.length(); i++) {
		    	if(!a1.contains(a.substring(j, j+1))) {
				a1 += a.substring(j, j+1);
			}
	    }
	}
		System.out.println(a1);
		
		
		String b1 = "";
		
		for(int i = 0; i < b.length(); i++) {
			
			if(!b1.contains(b.substring(i, i+1))) {
				b1 += b.substring(i, i+1);
			}
		}
		System.out.println(b1);
		
		
		// convert to array
		
		char[] ch = a1.toCharArray();
		String str = Arrays.toString(ch);
		System.out.println(str);
		
		char[] ch2 = b1.toCharArray();
		String str2 = Arrays.toString(ch2);
		System.out.println(str2);
		
		Arrays.sort(ch);
		Arrays.sort(ch2);

		System.out.println("=== Sorted version below ===");
		
		System.out.println( Arrays.toString(ch));
		System.out.println(Arrays.toString(ch2));
		
		String new1 = Arrays.toString(ch);
		String new2 = Arrays.toString(ch2);
		
		if(new1.equals(new2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
