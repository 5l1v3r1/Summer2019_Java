package day21_whileloops;

public class warmup {
	public static void main(String[] args) {
		
		String sentence = "I like books, I have books, I need book";
		//            Index:      i,  i+4 ==> book    
		int count = 0;
		for(int i = 0; i < sentence.length()-3; i++) {
			if(sentence.substring(i, i+4).equals("book"))  // substring (0, 4)
		         //               0, 4
				//                1, 5
				//                2, 6
				//             ...
				//                16, 20 ==> 16, 19
				count++;
		
		}
		
		System.out.println(count);
		
		
		
		System.out.println("\n=================================");
		
		/*
		 write a java program that can remove duplicate values from String 
		 
		 input: aabbcc
		 output: abc
		 */
		
		String s1 = "aabbcc";
		String result = ""; //abc
		
		for(int i = 0; i < s1.length(); i++) {
			if(!result.contains(s1.substring(i, i+1))) {
				result += s1.substring(i, i+1);
			}
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
	}

}
