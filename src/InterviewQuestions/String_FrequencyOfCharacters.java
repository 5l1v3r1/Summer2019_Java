package InterviewQuestions;

import java.util.ArrayList;

public class String_FrequencyOfCharacters {
	
	/*
	 
	  Assignment:
    1. write a return method that can remove duplicates from a string
        Ex: RemoveDup("AABBBCCCDD")  ==> ABCD
 
    2. write a return method that passes two string parameters a and b, 
         return the number appearances of b in a
        Ex:     occurred("ABAB" , "A") ==> 2
         
 
    3. combine method 1 and method 2 to write a method that can find 
    the frequency of characters
        Ex: frequency("AAABBBCCCDD")  ==> A3B3C3D2
        
    4. write a return method that can find the maximum number from an Integer arrayList  
     (DO NOT use sort methods of Collections class)
  
    5. write a return method that can find the minimum number from an Integer arrayList     
      (DO NOT use sort methods of Collections class)

	 
	 
	 */
	
	
	public static void main(String[] args) {
		
		// task 1
		System.out.println(removedup("dafafasdf"));
		
		// task 2
		int count = count("abcdabcdaaa", "a");
		System.out.println(count);
		
		// task 3
		System.out.println(frequency("abcabc"));
		
		// task 4 
	    ArrayList<Integer> list = new ArrayList<>();
	    list.add(10);
	    list.add(20);
	    list.add(0);
	    list.add(30);
	  int num =	maximum(list); // 30
	  System.out.println(num);
		
	  // task 5
	 int num2 = minimum(list);
	 System.out.println(num2);
	  
	}
	
	// task 1
	public static String removedup(String str) {
		
		String result="";
		for(int i=0; i<str.length(); i++) {
			
       if(!result.contains(str.substring(i,i+1))) {
      	 result += str.substring(i,i+1);
       }
			
		}
		return result;
	}
	
	// task 2
	public static int count(String a, String b) {
		
		int count = 0;
		
		while(a.contains(b)) {
			count++;
			a = a.replaceFirst(b, "");
		}
		
		return count;
	}
	
	// task 3
	public static String frequency(String str) {
		
		String result = "";
		
		String nondup = removedup(str);
		
		for(int i =0; i<nondup.length(); i++) {
		int count = count(str, ""+nondup.charAt(i));
		result += ""+nondup.charAt(i) +count;
	}
		
		return result;
	}
	
	// task 4
	public static int maximum(ArrayList<Integer> list) {
		
		int max = Integer.MIN_VALUE;
		
		for(int each : list) {
			if(each > max) {
				max = each;
			}
		}
		
		return max;
	}
	
	// task 5
	public static int minimum(ArrayList<Integer> list) {
		
      int min = Integer.MAX_VALUE;
		
		for(int each : list) {
			if(each < min) {
				min = each;
			}
		}
		
		
		return min;
	}

}
