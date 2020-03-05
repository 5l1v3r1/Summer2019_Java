package day41_initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {
	
	public static String name;
	public static int[] arr1;
	public static ArrayList<String> list = new ArrayList<>();
		
	static {
		name = "muazzez";
		arr1 = new int[5];  
		arr1[0] = 1;
		arr1[2] = 3;
		
		list.add("Kahve");
		list.add("Cay");
	}
	

	static {
		name = "esra";
		arr1 = new int[3];
		arr1[1] = 2;
		
		list.add("Ara");
	}
	
	public static void main(String[] args) {
		staticBlockPractice obj1 = new staticBlockPractice();
		System.out.println(name); 
		System.out.println(Arrays.toString(arr1));
		System.out.println(list);
	}

	
	public staticBlockPractice(){
		name = "esmira";
	}
	
	
	
	
}
