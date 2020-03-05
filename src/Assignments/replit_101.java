package Assignments;

public class replit_101 {
	public static void main(String[] args) {
		
		String[] words = {"hello","why","by","what","who"}; 
		for(int i =0; i<words.length;i++) {
			System.out.println(words[i].substring(0,1) + words[i].substring(words[i].length()-1));
		}
	}

}
