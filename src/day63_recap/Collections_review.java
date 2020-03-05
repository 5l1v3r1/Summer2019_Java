package day63_recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Collections_review {
public static void main(String[] args) {
	List<Integer> list1 = new ArrayList<>(); 
	list1.addAll(Arrays.asList(100,100,100));
	System.out.println(list1); // [100, 100, 100]
	
	Set<Integer> set1 = new HashSet<>();
	set1.add(100);
	set1.add(100);
	System.out.println(set1); // [100]
	
	SortedSet<Integer> sortedset = new TreeSet<>(); //since treeSet is child class of thios interface i mean implemented by treeset, I can create obj from it
}
}
