package day65_MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WarmUp {
	
	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.addAll(Arrays.asList(1,2,4,5,3,6,8,54,2,67));
		
		for(Iterator<Integer> it = list1.iterator(); it.hasNext();) {
			int a = it.next();
			if(a %2 ==0) {
				it.remove();
			}
		}
		System.out.println(list1); //[1, 5, 3, 67]
	

	List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	
	Iterator<Integer>it2 =list2.iterator();
	
/*	
	System.out.println(it2.hasNext());//true
	System.out.println(it2.next());//1
	
	System.out.println(it2.hasNext());//true
	System.out.println(it2.next());//2
	
	System.out.println(it2.hasNext());//false
	System.out.println(it2.next());//NoSuchElementException
	
*/
	
	
	while(it2.hasNext()) {
		int num = it2.next();
		if(num%2!=0) {
			it2.remove();
		}
	}
	
	System.out.println(list2); //[2, 4, 6, 8]
	
	
	
	
	
	}
}
