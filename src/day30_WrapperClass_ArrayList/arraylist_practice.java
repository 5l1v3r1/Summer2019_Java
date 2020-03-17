package day30_WrapperClass_ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class arraylist_practice {
	
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<>();
		// add method
		            nameList.add("merhaba");
		            System.out.println(nameList);
		            nameList.add("burda ne isin var");
		            System.out.println(nameList);
		            
		///////////////////////////////////////////////////////////////////////            
		            
		            Scanner scan = new Scanner(System.in); 
		            ArrayList<String> studentNames = new ArrayList<>();
		          
		         while(true) {
		            System.out.println("enter a name");
		            String name = scan.nextLine();
		            studentNames.add(name);
		            
		            System.out.println("do want to add another name");
		            String answer = scan.nextLine().toLowerCase();
		            
		            if(!(answer.equals("yes")||answer.equals("no"))) {
		            	System.out.println("invalid");
		            	break;
		            }
		            
		            if(answer.equals("no")) {
		            	break;
		            }
		            
		         }
		            System.out.println(studentNames);
		            
		            
	}
	
}
