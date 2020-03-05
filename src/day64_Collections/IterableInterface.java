package day64_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IterableInterface {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7));
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i)==1) {
				list.remove(i);
			}
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7,1,1,1,1));
		Iterator<Integer> it = list2.iterator();
		
		boolean a =	it.hasNext();
		System.out.println(a); // true
		
		System.out.println(it.next()); //1
		
		System.out.println("===============================================");
		
		List<Integer> list3 = new ArrayList<Integer>();
		list3.addAll(Arrays.asList(1,1,1,1,2,3,4,5,6,7,1,1,1,1));
		//remove all data elements that are equal to 1
		
		Iterator<Integer> it3 = list3.iterator();
		while(it3.hasNext()) { // since it returns boolean, we use while loop. And more proper
       int num = it3.next();
       if(num == 1) {
    	   it3.remove();
        }
	}
		System.out.println(list3); // [2, 3, 4, 5, 6, 7]
		
		System.out.println("============================");
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		set.addAll(Arrays.asList(10,20));
	 Iterator<Integer> iterate = set.iterator();
	  System.out.println(iterate.hasNext()); // true
	  System.out.println(iterate.next()); //10
	  
	  System.out.println(iterate.hasNext()); // true
	  System.out.println(iterate.next()); // 20
	  
	  System.out.println("=================================");
	  String[] name = {"dE","ss","oe","je","Ebe"};
	  Set<String> names = new LinkedHashSet<String>();
	  names.addAll(Arrays.asList(name));
	  
	 Iterator<String> removeE = names.iterator();
	 
	 while(removeE.hasNext()) {
		 String e = removeE.next();
		 if(e.toLowerCase().contains("e")) { // e iceren isimler gidecek. tam tersi icin ! koy
			 removeE.remove();
		 }
	 }
		System.out.println(names);
		
		
	// for(initialization; condition; iterator)	
		//  mandatory       mandatory
		List<Integer> myList = new ArrayList<>();
		myList.addAll(Arrays.asList(100,900,500,99,200,89,300,79));
		
		for(Iterator<Integer> itr = myList.iterator(); itr.hasNext();) {
			int numbers = itr.next();
			if(numbers > 100) {
				itr.remove();
			}
		}
		System.out.println(myList);
		
		
		String[] student = {"esra","esra","jhjgj","esra"};
		List<String> namelist = new ArrayList<>();
		namelist.addAll(Arrays.asList(student));
		
		for(Iterator<String> itr = namelist.iterator(); itr.hasNext();) {
		String str = itr.next();
		if(str.equals("esra")) {
			itr.remove();
		}
		}
		System.out.println(namelist); // esra gitti
		
		
		
		
		
		
	}	
	
}
