package Assignments;

import java.util.Arrays;

public class replit_105 {
	public static void main(String[] args) {

		String[] words = {"hello","you","donkey"};
		String temp = "";
		
		for(String each: words) {
			temp+= each.substring(0,1)+each.substring(each.length()-1)+ " ";
		}
		
		
		String [] array = temp.split(" ");
		System.out.println(Arrays.toString(array));
	}

}
