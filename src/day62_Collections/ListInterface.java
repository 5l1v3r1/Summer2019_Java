package day62_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {
	
	public static void main(String[] args) {
		
// objects are created from classes that's why, since List is an interface, you cannot write its object
		
		List<Integer> list1 = new ArrayList<>();
		
		List<String> list2 = new LinkedList<>();
		
		List<Double> list3 = new Vector<>();
		
		ArrayList<Integer> arraylist = new ArrayList<>();
		           arraylist.add(10);
		           arraylist.add(20);
		           arraylist.add(30);
		           arraylist.remove(1);
		           
		           System.out.println(arraylist);
		
		
		LinkedList<Integer> linkedlist = new LinkedList<>();
		
		           linkedlist.add(10);
		           linkedlist.add(20);
		           linkedlist.add(30);
		           linkedlist.remove(1);
		           
		           System.out.println(linkedlist);
		        
     System.out.println("=====================================");
     
     String[] arr = {"a","b","b"};
     
     List<String> notLinked = new ArrayList<>(Arrays.asList(arr));
     
     LinkedList<String> linked = new LinkedList<>(Arrays.asList(arr));
     
               System.out.println(linked); // it didn't give compile error. but we thought it would?!?!?!
               
               
          Vector<Integer> vt = new Vector<>();
          vt.add(10);
          
          
          System.out.println("======================================");
          
          
          Stack<Integer> st = new Stack<>();
                st.add(1);
                st.add(2);
                st.add(3);
                st.add(4);
                
               System.out.println(st.pop()); // 4
               
               System.out.println(st); // [1, 2, 3]
                
               System.out.println(st.pop()); // 3
               
               System.out.println(st); //[1, 2]
               
               // pop() prints the last value, and removes it from the list
          
	}
	
	// arraylist
	 public void add1(int a) {
		 
	 }
	 
	 //vector
	 public synchronized void add2(int a) {
		 
	 }

}
