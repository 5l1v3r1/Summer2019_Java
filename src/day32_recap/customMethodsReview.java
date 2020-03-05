package day32_recap;

public class customMethodsReview {
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			method1();
		}
		evenum();
		System.out.println();
		reverseStr("esmira");
		reverseStr2();
		System.out.println();
		String got = reverse("asiri sacma, mallik");
		System.out.println(got);
	}

	public static void method1() {
		System.out.println("Garnidelia");
	}
	
	public static void evenum() {
		for(int i = 0; i <=100; i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void reverseStr (String str) {
		for(int i=str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));    	
		}		
	}
	
	public static void reverseStr2 () {
		String str = "esra";
		for(int i=str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));    	
		}		
	}
	
	public static String reverse(String str) {
		String result = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
		       result += str.substring(i, i+1);
		}
		return result;
	}
	
}
