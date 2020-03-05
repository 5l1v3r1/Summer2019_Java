package day21_whileloops;

public class warmup2 {
	public static void main(String[] args) {
		
		String s1 = "aabbcc";
        String result = ""; //abc
		
		for(int i = 0; i < s1.length(); i++) {
			if(!result.contains(""+s1.charAt(i))) {  //"" kullaniyoruz cunku char ve string olmaz. boyle onu stringe ceviriyoz. convert ediyoz
				result += s1.charAt(i);
			}
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
