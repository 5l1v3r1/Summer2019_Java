package day30_WrapperClass_ArrayList;
import java.util.ArrayList;
public class array_list_class {
	/*
	 
	 ArrayList: 
	             1. presented in "java.util" package
	                           import java.util.Arraylist;
	             2. ArrayList does not support primitives
	             3. Similar to array, in ArrayList, we store objects(non primitives) only.
	             4. we can add or remove objects from array list
	             5. ArrayList' is ordered
	             
	 declaration of arrayList:
	                             ArrayList<ClassType> variableName = new ArrayList<>();
	                             
	             ArrayList vs Array:
	             1. Array's size fixed, ArrayList' size is dynamic
	             2. Array support primitive and non-primitives, ArrayList not support primitive
	             3. Array can be multi-dimentional but arraylist cannot.
	             
	          
	           |---------------------------------------------------------|    
	           |   Some methods of the ArrayList:                        |
	           |                                                         |
	           |   .add() ==> adds objects to ArrayList                  |
	           |   .get(indexNumber) ==> get the specific index value    |
	           |   .size() ==> get the size of the ArrayList             |
	           |   .clear() ==> remove all the values of the ArrayList   |
	           |   Collections.sort(VariableName) ==> sort the ArrayList |
	           |   Arrays.asList(Object Array): used for converting      |
	           |                                     array to ArrayList  |
	           |                                                         |
	           |---------------------------------------------------------|
	 */

	
	public static void main(String[] args) {
		
		int[] array1 = {1,2,3,4};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		ArrayList<Integer> list2 = new ArrayList<>();
		                   list2.add(10); // auto-boxing
		                   list2.add(20);
		                   list2.add(30);
		           
		System.out.println(list2);
		System.out.println(list2.get(1)); //get the specific index value
		System.out.println(" ArrayList' size is "+list2.size()); // size is 3
		list2.clear(); // removes all the values of the arraylist
		System.out.println(list2);
		System.out.println(list2.size()); // 0
		

       }
	
}