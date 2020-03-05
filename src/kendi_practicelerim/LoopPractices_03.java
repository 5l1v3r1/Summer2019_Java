package kendi_practicelerim;



public class LoopPractices_03 {
	public static void main(String[] args) {
		
		String  a = "I think Java is fun, and java is not that hard. I love java.";
		
		int count = 0;
		
		for(int i = 0; i< a.length()-3; i++) {
			
			if(a.substring(i, i+4).equalsIgnoreCase("java")) {
				 count++;
			}
			
			
		}
		
		System.out.println(count);
		
		
		System.out.println("===============================");
		
		
		
		
		String s = "aabbccdd";
		String result = "";
		
		for(int i = 0; i < s.length(); i++ ) {
			
			if(!result.contains(s.substring(i, i+1))) {
				result += s.substring(i, i+1);
			}
			
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
