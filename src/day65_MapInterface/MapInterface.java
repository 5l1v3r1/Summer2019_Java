package day65_MapInterface;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInterface {

	public static void main(String[] args) {
	
		Map<String, Double> employees = new HashMap<>();
		employees.put("Muazzez", 90000.0);
		employees.put("Roxy", 90000.01);
		
		System.out.println(employees);
		
		double salary1 = employees.get("Muazzez");
		System.out.println(salary1); //90000.0
		
		
		double salary2 = employees.get("Roxy");
		System.out.println(salary2); //90000.01
		
		
		employees.remove("Roxy");
		System.out.println(employees);
		
		int a = employees.size();
		System.out.println(a); // 1
		
		
		Set<String> set = employees.keySet();
		System.out.println(set);
		
		Map<String, Integer> map1 = new LinkedHashMap<>();
		map1.put("A", 100);
		map1.put("A", 10);
		map1.put("A", 9);
		map1.put("A", 8);
		
		// map does not support duplicated keys but values
	
		System.out.println(map1);
		
		map1.put("B", 3);
		map1.put(null, null);
		System.out.println(map1);
		
		Hashtable<String, Integer> map2 = new Hashtable<>();
	//	map2.put(null, null); // hashtable key and value cannot be null
		System.out.println(map2); // java.lang.NullPointerException
		
		TreeMap<String, Integer> map3 = new TreeMap<>();
		map3.put("z", 1000);
		map3.put("y", 9000);
		map3.put("x", 100000);
		System.out.println(map3); //sorts keys in ascending order
		
		
		
	}
	
}
