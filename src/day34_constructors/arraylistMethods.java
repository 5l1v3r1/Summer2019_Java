package day34_constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylistMethods {
	/*
	 remaining methods:
	  
	       indexOf(), lastIndexOf()
	       
	       converting array to arrayList
	       
	       removeAll(), addAll();
	 
	 */
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1); // auto boxing
		list.add(2);
		list.add(3);
		list.add(Integer.valueOf("33")); // none
		list.add(Integer.parseInt("100")); // auto boxing
		
		// indexOf(object): returns the index number of the given object from the ArrayList
	     // if it returns negative number, it means the given object is not exist
		
		int a = list.indexOf(1); // auto boxing
		System.out.println(a);
		
		
		// lastIndexOf(object): returns the last index number of the given object from the ArrayList
		
		int b = list.lastIndexOf(2);
		System.out.println("this is the lastindexof methods "+b);
		
		//Arrays.asList(Object Array): used for converting array to ArrayList
		
		Integer[] arr = {1,2,3,4,5};
		
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
		list2.add(100);
		
		System.out.println(list2);
		//===============================
		
		String[] arr2 = {"java", "python", "C#", "C++"};
		
		ArrayList<String> list3 = new ArrayList<>(Arrays.asList(arr2));
		
		// isEmpty(): checks if its empty, returns boolean
		System.out.println(list3.isEmpty()); //false
		System.out.println(list3); // [java, python, C#, C++]
		
		// addAll(InterFace): used for storing multiple objects in to the ArrayList
		
		String[] allnames = {"hamza", "huseyin"};
		
		ArrayList<String> names = new ArrayList<>();
		
		names.addAll(Arrays.asList("esmira", "muazzez", "dilare" ));
		
		names.addAll(Arrays.asList(allnames));
		
		System.out.println(names);
		
		// removeAll(interface): removes all the matching objects in the arraylist
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.addAll(Arrays.asList(1,1,1,1,2,2,2,3,3,4,4));
		
		numbers.removeAll(Arrays.asList(1)); // all 1's are removed
		
		System.out.println(numbers);
		
		// removed() method not designed to be used with in loop
		
		ArrayList<Integer> lis = new ArrayList<>();
		
		lis.addAll(Arrays.asList(1,1,1,1,2,2,2,3,3,4,4));
		
	//===================================================
		for(int i=0; i < lis.size(); i++) {             
			if(lis.get(i) == 1) {
				lis.remove(i);
			}                                      // this is not gonna work
		}
		        System.out.println(lis);
	//==================================================
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
	}

}
