package pentagon.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeTest {

	public static void main(String[] args) 
	{
		ArrayDeque<Integer> aq = new ArrayDeque<>();
		aq.add(34);
		aq.add(40);
		aq.add(21);
		aq.addFirst(10);
		aq.addLast(15);
		aq.offerFirst(5);
		aq.offerLast(99);
		aq.addFirst(19);
		aq.addLast(100);
		//aq.add(null);
		
		System.out.println(aq);
		
		System.out.println();
		
		Deque<Integer> dq = new LinkedList<>();
		dq.add(34);
		dq.add(null);
		System.out.println(dq);
		

	}

}
