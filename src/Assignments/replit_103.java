package Assignments;

public class replit_103 {
	public static void main(String[] args) {

		String sentence = "honey my name is java";
		String [] array = sentence.split(" ");
		String reversed="";
		
		
		for(int i =array.length-1; i>=0; i--) {
			reversed += array[i] + " ";
		}
		reversed = reversed.trim();
		
		System.out.println(reversed);
	}

}
