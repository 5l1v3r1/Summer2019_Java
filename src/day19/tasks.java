package day19;

public class tasks {
	public static void main(String[] args) {
		
		
		//task02
		
		for(int i = 1; i <= 32; i++) {
			if(i % 2 == 0) {
			System.out.print(i+" ");
			}
		}
		
		
		//task03
		
		
		for(int i = 1; i <= 32; i++) {
			if(i % 2 != 0) {
			System.out.print(i+" ");
			}
		}
		
		
		System.out.println();
		
		String str = "Java";
		//            0123
		// "avaJ"
		String rev = ""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0); // manually reversing the word
		
		String rev2=""; // we are giving an empty string to initialize it within the loop
		
		for(int i = 3; i >= 0; i--) {
			rev2 += str.charAt(i);            // This is the reversing method automatically // rev2 = ""+a, ""+v,....
			System.out.print(str.charAt(i)+" "); 
		}
		
		System.out.println(rev); //manual method's
	
		System.out.println(rev2); //automatic method's
		
		
		
		
		
		
		
		
		
		
		
	}

}
