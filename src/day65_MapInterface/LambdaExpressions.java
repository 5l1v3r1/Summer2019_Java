package day65_MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		Predicate<Integer> remove100 = p -> p == 100;
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(100,100,100,100,100));
		
		list1.removeIf(remove100);
		
		System.out.println(list1);// []   100's are removed
		
		List<Integer> list2 = new ArrayList<>(Arrays.asList(100,200,300,400,500, 600));

		list2.removeIf(R -> R > 300);
		System.out.println(list2);
		
		List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
			list3.forEach(p -> {if(p<5) {System.out.println(p); } } );
			System.out.println("==================================================");
			
			list3.forEach(System.out::println);
			
			//remove all names that's ahmed
			List<String> names = new ArrayList<>();
			names.addAll(Arrays.asList("Ahmet","loloo","ds","Ahmet"));

		Predicate<String> remveET = Suna -> Suna.endsWith("et");
		
		names.removeIf(remveET);
		
		System.out.println(names);
		
		
	//task
		
		List<String> l1 = new ArrayList<String>();
		l1.addAll(Arrays.asList("muhtar","maruf","akerke","asya") );
		List<String> l2 = new ArrayList<String>();

		l1.forEach(a -> { if(a.startsWith("m")) {l2.add(a); } } );
		System.out.println(l2);
		
		l1.removeIf(m ->  m.startsWith("m") );
		System.out.println(l1);
		
	}
}
