package Assignments;

public class replit_102 {
	public static void main(String[] args) {

		String sentence = "where is my keys";
		String [] array = sentence.split(" ");
		
		for(int i = array.length-1; i>=0;i--) {
			System.out.println(array[i]);
		}
	}

}
