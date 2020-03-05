package day64_Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	
	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<>();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(10);
	
		// queue does not have index numbers
		// sorts in ascending order when there is no duplication
		// Collections.sort(); sorts any collection type in ascending order
		
		System.out.println(q1);//[10, 10, 30, 20]
		q1.poll();
		System.out.println(q1);//[10, 20, 30]
		q1.poll();
		System.out.println(q1);//[20, 30]
		
		// stack classdaki pop() metodunun aynisiama ilk veriyi aliyur
		
		
		Deque<Integer> d1 = new ArrayDeque<>();
		// baska metodlar var bunda Deque
		d1.addFirst(12);
		d1.addLast(3);
		d1.add(54);
		d1.add(23);
		d1.add(7);
		System.out.println(d1);
		
	}

}
