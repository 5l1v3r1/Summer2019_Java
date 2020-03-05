package Assignments;

public class replit_115 {
	public static void main(String[] args) {
		String[] words = {"play","games","newyear","happyfuture"};
		String longest="";
		for(int i =0;i<words.length; i++) {
			if(longest.length()< words[i].length() ) {
			 longest = words[i];
			}
		}
		
		System.out.println(longest);
	}

}
